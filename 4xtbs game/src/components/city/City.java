package components.city;
/*
 * City class: represents a city a player owns
 */
import java.awt.Point;
import java.util.EmptyStackException;
import java.util.Stack;

import components.city.cityBuildings.*;
public class City
{
	//Constructor instance variables
	private Point position;
	private Stack<CityBuilding> buildings = new Stack<CityBuilding>();
	private String name;

	//City constructor
	public City(Point pos, String namae)
	{
		position = pos;
		name = namae;
	}
	
	public void build(CityBuilding build)
	{
		buildings.add(build);
	}
	
	public boolean raze()
	{
		try
		{
		for (int i = 0; i < Math.ceil((double)buildings.size() / 3); i++)
		{
			System.out.println("A " + buildings.pop().getName() + " in " + name + " has burned!"); //TODO: Add this to player notifications
			if (buildings.size() == 0)
			{
				System.out.println(name + " has burned to the ground!"); //TODO: Add this to player notifications and pop city from city list
				return true;
			}
		}
		}
		catch (EmptyStackException e)
		{
			
		}
		return false;
	}
	
	//Getters and setters
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Stack<CityBuilding> getBuildings() {
		return buildings;
	}

	public void setBuildings(Stack<CityBuilding> buildings) {
		this.buildings = buildings;
	}
}
