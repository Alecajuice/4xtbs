package components.units;
/*
 * Unit class: represents a unit each player owns, such as a warrior or worker
 */
import java.awt.Graphics;
import java.awt.Point;


public class Unit
{
	//#s of types/levels
	
	private final int numTypes = 5;
	private final int numLevels = 10;
	
	//Unit types
	public final int TYPE_MELEE = 1;
	public final int TYPE_RANGED = 2;
	public final int TYPE_FAST = 3;
	public final int TYPE_FASTRANGED = 4;
	public final int TYPE_NAVYMELEE = 5;
	public final int TYPE_NAVYRANGED = 6;
	
	//List of unit templates
	public Unit[][] unitTemplates = new Unit[numTypes][numLevels];
	
	//Constructor instance variables
	private Point position;
	private int health;
	
	//Unit constructor
	public Unit(int x, int y) 
	{
		position = new Point(x, y);
	}
	
	//Calculate damage done to units
	public static int[] calcDmg(int strength1, int strength2)
	{
		//TODO: Calculate damage done to both Units when one Unit attacks an enemy Unit
		return null;
	}
	
	public static int calcRangeDmg(int rstrength, int cover)
	{
		//TODO: Calculate damage done to a Units when a ranged Unit attacks an enemy Unit
		int temp = 12345;
		return temp;
	}
	
	//Getters and setters
	public Point getPosition() 
	{
		return position;
	}
	public void setPosition(Point position) 
	{
		this.position = position;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
