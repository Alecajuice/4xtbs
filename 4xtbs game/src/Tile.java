
public class Tile 
{
	private int ID;
	private int building = 0;
	public Tile(int iD, int build)
	{
		ID = iD;
		building = build;
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
}
