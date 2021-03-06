package gui;


/*
 * Main class: contains action listeners and display methods
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import components.Grid;
import components.Player;
import components.tiles.Tile;

public class Main extends JPanel implements KeyListener, MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	private static String gameName = "4XTBS";
    public static Grid map;
    public static Player player1 = new Player();
    static final int screenWidth = 1920;
    static final int screenHeight = 1080;
    public static JFrame frame = new JFrame();
    public static ProgressBar progressBar;
    public static JFrame progressBarFrame = new JFrame();
    public static JPanel test = new JPanel();
    public static void main(String[] args) throws IOException
    {
        player1.getCamera().setZoomRatio(0.2);
        player1.getCamera().setulPosition(new Point(0, 0));
        Tile.getTileSheet();
        map = new Grid(5, 20, 20);
        progressBar = new ProgressBar(map);
        map = progressBar.getMap();
        progressBarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progressBarFrame.setTitle("Loading...");
        progressBarFrame.add(progressBar);
        progressBarFrame.setSize(500, 80);
        progressBarFrame.setVisible(true);
        progressBarFrame.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 - progressBarFrame.getWidth()/2), (int)( Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 - progressBarFrame.getHeight()/2));
        frame.setSize(screenWidth, screenHeight);
        frame.setTitle(gameName);
        frame.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 - frame.getWidth()/2), (int)( Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 - frame.getHeight()/2));
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main drawer = new Main();
        frame.add(drawer);
        frame.addKeyListener(drawer);
        frame.addMouseListener(drawer);
        frame.addMouseMotionListener(drawer);
        frame.getContentPane().setLayout(null);
    }
    public static void loadMap()
    {
        GridLayout gridLayout = new GridLayout(20, 20);
        test.setLayout(new BorderLayout());
        frame.add(test);
    	Tile[][] grid = map.getGrid();
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
//            	test.add(grid[i][j]);
            }
        }
        resetPanelBounds();
        test.repaint();
        frame.setVisible(true);
    }
    public static void resetPanelBounds()
    {
    	test.setBounds((int)player1.getCamera().getulPosition().getX(), (int)player1.getCamera().getulPosition().getY(), Tile.modWidth * map.getGrid()[0].length, Tile.modHeight * map.getGrid().length);
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
    public class DrawPad extends JComponent {
		  Image image;
		  Graphics2D graphics2D;
		  int currentX, currentY, oldX, oldY;
		  public DrawPad() {
		    setDoubleBuffered(false);
		    addMouseListener(new MouseAdapter() {
		      public void mousePressed(MouseEvent e) {
		        oldX = e.getX();
		        oldY = e.getY();
		      }
		    });
		    addMouseMotionListener(new MouseMotionAdapter() {
		      public void mouseDragged(MouseEvent e) {
		        currentX = e.getX();
		        currentY = e.getY();
		        if (graphics2D != null)
		          graphics2D.drawLine(oldX, oldY, currentX, currentY);
		        repaint();
		        oldX = currentX;
		        oldY = currentY;
		      }
		    });
		  }

		  public void paintComponent(Graphics g) {
		    if (image == null) {
		      image = createImage(getSize().width, getSize().height);
		      graphics2D = (Graphics2D) image.getGraphics();
		      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		          RenderingHints.VALUE_ANTIALIAS_ON);
		      clear();
		    }
		    g.drawImage(image, 0, 0, null);
		  }

		  public void clear() {
		    graphics2D.setPaint(Color.white);
		    graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		    graphics2D.setPaint(Color.black);
		    repaint();
		  }
		}
    
}
