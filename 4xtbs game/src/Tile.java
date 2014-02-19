import java.awt.Color;
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
	private final int WIDTH = 5;
	private final int HEIGHT = 5;
	private final BufferedImage TILESHEET = ImageIO.read(new File("Tiles.png"));
	
	//Type constants
	private final int TYPE_NULL = 0;
	private final int TYPE_WATER = 1;
	private final int TYPE_DESERT = 2;
	private final int TYPE_PLAINS = 3;
	private final int TYPE_TUNDRA = 4;
	private final int TYPE_ROCK = 5;
	
	//Resource constants
	private final int RES_NORES = 0;
	
	//Feature constants
	private final int FEAT_NOFEAT = 0;
	private final int FEAT_FOREST = 1;
	private final int FEAT_MOUNTAIN = 2;
	
	private BufferedImage tileImage;
	//Constructor instance variables
	private Coordinate position;
	private int ID;
	private int building;
	private int resource;
	private int feature;
	
	//Tile constructor
	public Tile(int iD, int build, Coordinate pos, int resourceIn, int featureIn) throws IOException
	{
		ID = iD;
		building = build;
		position = pos;
		resource = resourceIn;
		feature = featureIn;
	//	tileImage = TILESHEET.getSubimage(X_OFFSET*ID + WIDTH*(ID), Y_OFFSET, WIDTH, HEIGHT);
	}


	//Draw tiles
	public void draw(Graphics screen)
	{
		screen.setColor(new Color(0, 130 + 20*ID, 255 - 30*ID));
//		screen.drawImage(tileImage, position.getX()*(WIDTH + 1), position.getY()*(HEIGHT + 1), WIDTH, HEIGHT, this);
		screen.fillRect(position.getX()*WIDTH, position.getY()*HEIGHT, WIDTH, HEIGHT);
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

	public int getResource() 
	{
		return resource;
	}

	public void setResource(int resource) 
	{
		this.resource = resource;
	}
	public int getFeature() 
	{
		return feature;
	}
	public void setFeature(int feature) 
	{
		this.feature = feature;
	}
}
