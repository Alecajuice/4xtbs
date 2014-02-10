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
    static int screenWidth = 500;
    static int screenHeight = 500;
    public static void main(String[] args) throws IOException
    {
        map = new Grid(2, 100, 100);
        JFrame frame = new JFrame();
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
//        map.generate();
//        map.smooth();
        frame.repaint();
        liamStackTest();
    }
    public static void liamStackTest()
    {
    	City city1 = new City(new Coordinate(0, 0), "London");
    	city1.build(new Building(1, 2));
    	city1.build(new Building(3, 1));
    	city1.build(new Building(2, 4));
    	city1.build(new Building(2, 8));
    	while (true)
    	{
    		city1.raze();
    		if (city1.raze())
    		{
    			break;
    		}
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