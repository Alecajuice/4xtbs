
public class Grid 
{
	private int width = 100;
	private int height = 100;
	private int[][] grid = new int[width][height];
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
	public int[][] getGrid() 
	{
		return grid;
	}
	public void setGrid(int[][] grid) 
	{
		this.grid = grid;
	}
	public void setTile(int x, int y, int n)
	{
		grid[x][y] = n;
	}
}
