
public class Grid 
{
	private int width = 100;
	private int height = 100;
	private Tile[][] grid = new Tile[width][height];
	//Getters and setters
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int height) 
	{
		this.height = height;
	}
	public Tile[][] getGrid() 
	{
		return grid;
	}
	public void setGrid(Tile[][] grid) 
	{
		this.grid = grid;
	}
	public void setTile(int x, int y, Tile n)
	{
		grid[x][y] = n;
	}
}
