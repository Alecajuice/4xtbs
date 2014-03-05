import java.awt.Point;
import java.util.EmptyStackException;
import java.util.Stack;
public class City
{
	//Constructor instance variables
	private Point position;
	private Stack<Building> buildings = new Stack<Building>();
	private String name;

	//City constructor
	public City(Point pos, String namae)
	{
		position = pos;
		name = namae;
	}
	
	public void build(Building build)
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

	public Stack<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(Stack<Building> buildings) {
		this.buildings = buildings;
	}
}
