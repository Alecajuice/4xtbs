package components.tiles;

import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;

import components.tiles.resources.*;
import components.tiles.tileBuildings.*;
import components.tiles.features.*;

public class Water extends Tile
{

	public Water(Point position, Feature feature, TileBuilding building, Resource resource) throws IOException
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
		screen.drawImage(getTileImage(), (int)(getPosition().getX()*(modWidth + 1)), (int)(getPosition().getY()*(modHeight + 1)), modWidth, modHeight, this);
	}
}
