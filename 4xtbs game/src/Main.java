import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main extends JPanel implements KeyListener, MouseListener, MouseMotionListener
{
	private static String gameName = "Derp";
    static int screenWidth = 500;
    static int screenHeight = 500;
	public static void main(String[] args)
	{
        JFrame frame = new JFrame();
        frame.setSize(screenWidth,screenHeight);
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
	}
	public void mouseDragged(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mouseMoved(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void keyPressed(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}
