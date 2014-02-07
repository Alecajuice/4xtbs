/*
 * Assignment: Free form uses a stack or a treeset
 * Use (or replace) a data structure so that your free form project employs a stack or a treeset.
 * Submit the class definition that uses the stack or treeset.
 * 
 * Alex Tarng
 * Period 5
 * 
 * alexStackTest() (the method that showcases the stack) is below in Main.java
 * The stack that I am using (notify) is in Player.java
 * Run the program to see the notifications in the console
 */


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
        alexStackTest();
    }
    public static void alexStackTest()
    {
    	Player p1 = new Player();
    	p1.addNotify("A Unit has been killed!");
    	p1.addNotify("You are in debt!");
    	p1.addNotify("Gold from Venice ended!");
    	p1.addNotify("Arabia's capital has been captured!");
    	p1.addNotify("France is now protecting Venice!");
    	p1.addNotify("Russia has made a Declaration of Friendship with England!");
    	p1.notifyPlayer();
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