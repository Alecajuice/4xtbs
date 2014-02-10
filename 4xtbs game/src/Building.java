
public class Building {

	//Building type constants
	public final int TYPE_LAB = 1;
	public final int TYPE_BARRACKS = 2;
	public final int TYPE_MARKET = 3;
	
	//Constructor instance variables
	private int type = 0;
	private int level;
	private String name;
	
	//Building constructor
	public Building(int typ, int lvl)
	{
		type = typ;
		level = lvl;
		name = calcName(type, level);
	}
	
	public String calcName(int type, int level)
	{
		//TODO: Calculate building name based on type and level
		return "Market";
	}

	//Getters and setters
	public int getType() 
	{
		return type;
	}

	public void setType(int type) 
	{
		this.type = type;
	}

	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int level) 
	{
		this.level = level;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
}
