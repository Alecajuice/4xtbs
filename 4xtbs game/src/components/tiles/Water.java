package components.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;

import components.building.*;
import components.tiles.features.*;

public class Water extends Tile
{

	public Water(Point position, Feature feature, Building building, int resource) throws IOException
	{
		super(position, feature, building, resource);
		setTileImage(1);
	}
	
	public int getID()
	{
		return 1;
	}

	public void draw(Graphics screen)
	{
		screen.drawImage(getTileImage(), (int)(position.getX()*(modWidth + 1)), (int)(position.getY()*(modHeight + 1)), modWidth, modHeight, this);
	}
}
