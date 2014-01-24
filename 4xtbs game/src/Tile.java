import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Tile implements ImageObserver 
{
	private int x;
	private int y;
	private int ID;
	private int building = 0;
	private int width;
	private int height;
	private int xOffset;
	private int yOffset;
	private BufferedImage tileSheet;
	private BufferedImage tileImage;
	public Tile(int iD, int build) throws IOException
	{
		ID = iD;
		building = build;
		tileSheet = ImageIO.read(new File("Tiles.png"));
		tileImage = tileSheet.getSubimage(xOffset*ID + width*(ID), yOffset, width, height);
	}
	public void draw(Graphics screen)
	{
		screen.drawImage(tileImage, x*(width + 1), y*(height + 1), width, height, this);
	}
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
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) 
	{
		return false;
	}
}
