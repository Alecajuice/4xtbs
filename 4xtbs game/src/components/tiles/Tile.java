package components.tiles;

import gui.Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RasterFormatException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import components.tiles.resources.Resource;
import components.tiles.tileBuildings.*;
import components.tiles.features.*;

public abstract class Tile implements ImageObserver 
{
	//Spritesheet constants
	private final int X_OFFSET = 50;
	private final int Y_OFFSET = 50;
	private final int WIDTH = 200;
	private final int HEIGHT = 200;
	private static BufferedImage TILESHEET;
	
	//Tile type constants
	public final static int TILE_WATER = 1;
	public final static int TILE_DESERT = 2;
	public final static int TILE_PLAINS = 3;
	public final static int TILE_TUNDRA = 4;
	public final static int TILE_ROCK = 5;
	
	//Camera adjustments
	protected int modWidth = (int)Math.round(WIDTH * Main.player1.getCamera().getZoomRatio());
	protected int modHeight = (int)Math.round(HEIGHT * Main.player1.getCamera().getZoomRatio());
	
	private BufferedImage tileImage;
	//Constructor instance variables
	private Point position;
	private TileBuilding building;
	private Resource resource;
	private Feature feature;
	
	//Tile constructor
	public Tile(Point position, Feature feature, TileBuilding building, Resource resource) throws IOException
	{
		this.building = building;
		this.position = position;
		this.resource = resource;
		this.feature = feature;
	}

	public static void getTileSheet() throws IOException
	{
		TILESHEET = ImageIO.read(new File("img/Tiles.png"));
	}
	
	public final void setTileImage(int iD)
	{
		try {
			tileImage = TILESHEET.getSubimage(X_OFFSET*(iD) + WIDTH*(iD - 1), Y_OFFSET, WIDTH, HEIGHT);
		} catch (RasterFormatException e) {
			System.out.println(iD);
		}
	}
	
	public BufferedImage getTileImage()
	{
		return tileImage;
	}
	
	//Draw tiles
	public abstract void draw(Graphics screen);
//		screen.setColor(new Color(0, 130 + 20*ID, 255 - 30*ID));
//		screen.drawImage(tileImage, (int)(position.getX()*(modWidth + 1)), (int)(position.getY()*(modHeight + 1)), modWidth, modHeight, this);
//		screen.fillRect(position.getX()*modWidth, position.getY()*modHeight, modWidth, modHeight);
	
	//Getters and setters
	public TileBuilding getBuilding() 
	{
		return building;
	}
	public void setBuilding(TileBuilding building) 
	{
		this.building = building;
	}	
	public Point getPosition()
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

	public Resource getResource() 
	{
		return resource;
	}

	public void setResource(Resource resource) 
	{
		this.resource = resource;
	}
	public Feature getFeature() 
	{
		return feature;
	}
	public void setFeature(Feature feature) 
	{
		this.feature = feature;
	}
	public abstract int getID();
}
