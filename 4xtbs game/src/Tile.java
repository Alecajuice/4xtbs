import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tile implements ImageObserver 
{
	//Spritesheet constants
	private final int X_OFFSET = 50;
	private final int Y_OFFSET = 50;
	private final int WIDTH = 200;
	private final int HEIGHT = 200;
	private final BufferedImage TILESHEET = ImageIO.read(new File("Tiles.png"));
	
	private BufferedImage tileImage;
	//Constructor instance variables
	private Coordinate position;
	private int ID;
	private int building;
	private int resource;
	
	//Tile constructor
	public Tile(int iD, int build, Coordinate pos, int resourceIn) throws IOException
	{
		ID = iD;
		building = build;
		position = pos;
		setResource(resourceIn);
		tileImage = TILESHEET.getSubimage(X_OFFSET*ID + WIDTH*(ID), Y_OFFSET, WIDTH, HEIGHT);
	}

	//Draw tiles
	public void draw(Graphics screen)
	{
		screen.drawImage(tileImage, position.getX()*(WIDTH + 1), position.getY()*(HEIGHT + 1), WIDTH, HEIGHT, this);
	}
	
	//Getters and setters
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public int getBuilding() 
	{
		return building;
	}
	public void setBuilding(int building) 
	{
		this.building = building;
	}	
	public Coordinate getPosition()
	{
		return position;
	}
	//Update Image
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) 
	{
		return false;
	}
	public int getWIDTH() 
	{
		return WIDTH;
	}
	public int getHEIGHT() 
	{
		return HEIGHT;
	}

	public int getResource() {
		return resource;
	}

	public void setResource(int resource) {
		this.resource = resource;
	}
}
