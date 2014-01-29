import java.awt.Graphics;


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
	public final int TYPE_BOAT = 5;
	
	//List of unit templates
	public Unit[][] unitTemplates = new Unit[numTypes][numLevels];
	
	//Constructor instance variables
	private Coordinate position;
	private int type;
	private int level;
	private String name;
	
	//Unit constructor
	public Unit(int x, int y, int typeIn, int levelIn, String nameIn) 
	{
		position = new Coordinate(x, y);
		type = typeIn;
		level = levelIn;
		name = nameIn;
	}
	
	//Draw units
	public void draw(Graphics screen) {
		
	}
	
	//Getters and setters
	public Coordinate getPosition() 
	{
		return position;
	}
	public void setPosition(Coordinate position) 
	{
		this.position = position;
	}
	public int getType() 
	{
		return type;
	}
	public int getLevel() 
	{
		return level;
	}
	public String getName() 
	{
		return name;
	}
}
