package gui;


/*
 * Main class: contains action listeners and display methods
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import components.Grid;
import components.Player;
import components.tiles.Tile;

public class Main extends JPanel implements KeyListener, MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	private static String gameName = "4XTBS";
    private static Grid map;
    public static Player player1 = new Player();
    static final int screenWidth = 1920;
    static final int screenHeight = 1080;
    static final int SMOOTHNUM = 5;
    GenerateMap mapgen;
    static JFrame frame = new JFrame();
    public static void main(String[] args) throws IOException
    {
        player1.getCamera().setZoomRatio(0.2);
        player1.getCamera().setulPosition(new Point(0, 0));
        Tile.getTileSheet();
        map = new Grid(5, 20, 20);
        frame.setSize(screenWidth, screenHeight);
        frame.setTitle(gameName);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main drawer = new Main();
        frame.add(drawer);
        frame.addKeyListener(drawer);
        frame.addMouseListener(drawer);
        frame.addMouseMotionListener(drawer);
        mapgen.addPropertyChangeListener(this);
        frame.setLayout(new FlowLayout());
        JPanel test = new JPanel();
        GridLayout gridLayout = new GridLayout(20, 20);
        gridLayout.setHgap(-16);
        gridLayout.setVgap(-12);
        test.setLayout(gridLayout);
        frame.add(test);
        Tile[][] grid = map.getGrid();
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
            	test.add(grid[i][j]);
//            	map.add(new JButton("hi"));
            }
        }
        frame.pack();
        frame.setVisible(true);
    }
    public void paintComponent(Graphics screen)
    {
//        map.draw(screen);
    }
    //Mouse events
    public void mouseDragged(MouseEvent arg0) 
    {
        
    }
    public void mouseMoved(MouseEvent arg0) 
    {
        
    }
    public void mouseClicked(MouseEvent arg0) 
    {
        
    }
    public void mouseEntered(MouseEvent arg0) 
    {
        
    }
    public void mouseExited(MouseEvent arg0) 
    {
        
    }
    public void mousePressed(MouseEvent arg0) 
    {
        
    }
    public void mouseReleased(MouseEvent arg0) 
    {
        
    }
    
    //Keyboard Events
    public void keyPressed(KeyEvent arg0) 
    {
        
    }
    public void keyReleased(KeyEvent arg0) 
    {
        
    }
    public void keyTyped(KeyEvent arg0) 
    {
        
    }
    
    public static class GenerateMap extends SwingWorker<Void, Void>
    {
    	public static int progress = 0;
    	public static int maxProgress = map.getWidth() * map.getHeight() * (SMOOTHNUM + 1);
        public Void doInBackground() throws IOException
        {
            //Initialize progress property.
            setProgress(0);
            map.generate();
            for(int i = 0; i < 5; i++)
            {
            	map.smooth();
            }
//            while (progress < 100) {
//                //Sleep for up to one second.
//                try {
//                    Thread.sleep(random.nextInt(1000));
//                } catch (InterruptedException ignore) {}
//                //Make random progress.
//                progress += random.nextInt(10);
//                setProgress(Math.min(progress, 100));
//            }
            return null;
        }
        
        public static void setprogress(int progress)
        {
        	setProgress(progress);
        }
        
        public void done()
        {
        }
    }
}