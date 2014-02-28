import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements KeyListener, MouseListener, MouseMotionListener
{
    private static String gameName = "4XTBS";
    private static Grid map;
    public static Player player1 = new Player();
    static int screenWidth = 500;
    static int screenHeight = 500;
    static JFrame frame = new JFrame();
    public static void main(String[] args) throws IOException
    {
        player1.getCamera().setZoomRatio(0.25);
        Tile.getTileSheet();
        map = new Grid(4, 10, 10);
        frame.setSize(screenWidth, screenHeight);
        frame.setTitle(gameName);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main drawer = new Main();
        frame.add(drawer);
        frame.setVisible(true);
        frame.addKeyListener(drawer);
        frame.addMouseListener(drawer);
        frame.addMouseMotionListener(drawer);
        for(int i = 0; i < 1000; i++)
        {
        	try 
        	{
				Thread.sleep(1000);
			} 
        	catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
//        	for(int j = 0; j < 10; j++)
//        	{
//        		map.smooth();
//        	}
        	frame.repaint();
        	System.out.println("Swagging...");
        }
    }
    public void paintComponent(Graphics screen)
    {
        map.draw(screen);
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
}