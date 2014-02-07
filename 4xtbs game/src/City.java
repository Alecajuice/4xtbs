import java.util.Stack;
public class City
{
	//Constructor instance variables
	private Coordinate position;
	private Stack<Building> buildings = new Stack<Building>();

	//City constructor
	public City(Coordinate pos)
	{
		position = pos;
	}
	
	//Getters and setters
	public Coordinate getPosition() {
		return position;
	}

	public void setPosition(Coordinate position) {
		this.position = position;
	}

	public Stack<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(Stack<Building> buildings) {
		this.buildings = buildings;
	}
}
