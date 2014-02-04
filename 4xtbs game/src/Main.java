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
	private static Grid map = new Grid(1, 100, 100);
    static int screenWidth = 500;
    static int screenHeight = 500;
	public static void main(String[] args) throws IOException
	{
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
        map.generate();
        frame.repaint();
        alexTest();
	}
	public static void alexTest()
	{
		System.out.println("calcDmg (Method 1) Test Cases: Calculate damage done to both Units when one Unit attacks an enemy Units");
		int success1 = 0;
		System.out.println("Test 1: (5, 5) --> {40, 40}");
		int[] array1 = {40, 40};
		if (Unit.calcDmg(5, 5) == array1)
		{
			System.out.println("Test succeeded");
			success1++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Test 2: (10, 5) --> {5, 75}");
		int[] array2 = {5, 75};
		if (Unit.calcDmg(10, 5) == array2)
		{
			System.out.println("Test succeeded");
			success1++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Test 3: (20, 5) --> {5, 100}");
		int[] array3 = {5, 100};
		if (Unit.calcDmg(20, 5) == array3)
		{
			System.out.println("Test succeeded");
			success1++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Percent of test cases succeeded: " + success1/3*100);
		
		System.out.println("calcRangeDmg (Method 2) Test Cases: Calculate damage done to a Units when a ranged Unit attacks an enemy Units");
		int success2 = 0;
		System.out.println("Test 1: (5, 5) --> 40");
		if (Unit.calcRangeDmg(5, 5) == 40)
		{
			System.out.println("Test succeeded");
			success2++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Test 2: (5, 10) --> 20");
		if (Unit.calcRangeDmg(10, 5) == 20)
		{
			System.out.println("Test succeeded");
			success2++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Test 3: (10, 5) --> 80");
		if (Unit.calcRangeDmg(20, 5) == 80)
		{
			System.out.println("Test succeeded");
			success2++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Percent of test cases succeeded: " + success2/3*100);

		System.out.println("generateProbabilities (Method 3) Test Cases: Generate probability of adjacent Tiles depending on the ID of the base Tile");
		int success3 = 0;
		double[] array4 = {0.8, 0.05, 0.05, 0.05, 0.05};
		System.out.println("Test 1: (1) --> 40");
		if (Grid.generateProbabilities(1) == array4)
		{
			System.out.println("Test succeeded");
			success3++;
		} else {
			System.out.println("Test failed");
		}
		double[] array5 = {0.25, 0.05, 0.6, 0.05, 0.05};
		System.out.println("Test 2: (3) --> 20");
		if (Grid.generateProbabilities(3) == array5)
		{
			System.out.println("Test succeeded");
			success3++;
		} else {
			System.out.println("Test failed");
		}
		double[] array6 = {0.25, 0.05, 0.05, 0.05, 0.6};
		System.out.println("Test 3: (5) --> 80");
		if (Grid.generateProbabilities(5) == array6)
		{
			System.out.println("Test succeeded");
			success3++;
		} else {
			System.out.println("Test failed");
		}
		System.out.println("Percent of test cases succeeded: " + success3/3*100);
	}
	public void paintComponent(Graphics screen)
	{
		
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