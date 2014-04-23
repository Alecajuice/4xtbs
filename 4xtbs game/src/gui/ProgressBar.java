package gui;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

import components.Grid;

public class ProgressBar extends JPanel implements PropertyChangeListener
{
    private static final int SMOOTHNUM = 5;
	private JProgressBar progressBar;
	private JTextArea taskOutput;
	private static Grid map;
	public GenerateMap mapgen;
	public ProgressBar(Grid map)
	{
	        super(new BorderLayout());

	        this.map = map;
	        
	        progressBar = new JProgressBar(0, 100);
	        progressBar.setValue(0);
	        progressBar.setStringPainted(true);

	        taskOutput = new JTextArea(5, 20);
	        taskOutput.setMargin(new Insets(5,5,5,5));
	        taskOutput.setEditable(false);

	        JPanel panel = new JPanel();
	        panel.add(progressBar);

	        add(panel, BorderLayout.SOUTH);
	        add(new JScrollPane(taskOutput), BorderLayout.CENTER);

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
			taskOutput.append(String.format("Completed %d%% of task.\n", mapgen.getProgress()));
		}
	}
	
	public Grid getMap()
	{
		return map;
	}
	
	public static class GenerateMap extends SwingWorker<Void, Void>
    {
    	public int progress = 0;
    	public int maxProgress = map.getWidth() * map.getHeight() * (SMOOTHNUM + 1);
        public Void doInBackground() throws IOException
        {
            setProgress(0);
            map.generate();
            for(int i = 0; i < 5; i++)
            {
            	map.smooth();
            }
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
