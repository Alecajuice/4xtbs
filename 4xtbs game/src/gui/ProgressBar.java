package gui;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;

import components.Grid;

public class ProgressBar extends JPanel implements PropertyChangeListener
{
    private static final int SMOOTHNUM = 5;
	private JProgressBar progressBar;
	private static JLabel taskOutput;
	private static Grid map;
	public GenerateMap mapgen;
	public ProgressBar(Grid map)
	{
	        super(new BorderLayout());

	        this.map = map;
	        
	        progressBar = new JProgressBar(0, 100);
	        progressBar.setValue(0);
	        progressBar.setStringPainted(true);

	        taskOutput = new JLabel();
	        
	        JPanel panel = new JPanel(new BorderLayout());
	        panel.add(progressBar, BorderLayout.SOUTH);
	        panel.add(new JScrollPane(taskOutput), BorderLayout.CENTER);
	        add(panel, BorderLayout.CENTER);

	        mapgen = new GenerateMap();
	        mapgen.addPropertyChangeListener(this);
	        mapgen.execute();
	}
	
	public void propertyChange(PropertyChangeEvent evt)
	{
		if ("progress" == evt.getPropertyName())
		{
			int progress = (Integer)evt.getNewValue();
			progressBar.setValue(progress);
		}
	}
	
	public Grid getMap()
	{
		return map;
	}
	
	public static class GenerateMap extends SwingWorker<Void, Void>
    {
    	public int progress = 0;
    	public int maxProgress = map.getWidth() * map.getHeight();
        public Void doInBackground() throws IOException
        {
            setProgress(0);
            taskOutput.setText("Generating map...");
            map.generate();
            for(int i = 0; i < 5; i++)
            {
            	map.smooth();
            }
            map.create();
            return null;
        }
        
        public void setprogress(int progress)
        {
        	setProgress(progress);
        }
        
        public void done()
        {
        	Main.progressBarFrame.dispose();
        	Main.loadMap();
        }
    }
}
