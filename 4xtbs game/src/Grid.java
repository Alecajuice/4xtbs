import java.io.IOException;


public class Grid 
{
	private int width = 100;
	private int height = 100;
	private int ID;
	private Tile[][] grid = new Tile[width][height];
	public Grid(int n, int w, int h)
	{
		height = h;
		width = w;
		ID = n;
	}
	public void generate() throws IOException
	{
		double[] probability = new double[5];
		for(int i = 2; i < probability.length; i++)
		{
			probability[i] = 0.1;
		}
		probability[1] = 0.3;
		probability[ID] = 0.4;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				int random = (int)(101*Math.random());
				int id = 0;
				if(random >= 0 && random < probability[1])
				{
					id = 1;
				}
				if(random >= probability[1] && random < probability[1] + probability[2])
				{
					id = 2;
				}
				if(random >= probability[1] + probability[2] && random < probability[1] + probability[2] + probability[3])
				{
					id = 3;
				}
				if(random >= probability[1] + probability[2] + probability[3] && random < probability[1] + probability[2] + probability[3] + probability[4])
				{
					id = 4;
				}
				if(random >= probability[1] + probability[2] + probability[3] + probability[4] && random < probability[1] + probability[2] + probability[3] + probability[4] + probability[5])
				{
					id = 5;
				}
				grid[i][j] = new Tile(id, 0, new Coordinate(i,j), 0, 0);
			}
		}
	}
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
	public void smooth()
	{
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				int [] prob = new int[5];
				for(int k = Math.max(0, i - 1); k <= Math.min(grid.length, i + 1); k++)
				{
					for(int l = Math.max(0, j - 1); l <= Math.min(grid[0].length, j + 1); l++)
					{
						if(!(k == i && l == j))
						{
							prob[grid[k][l].getID()] += 1;
						}
					}
				}
				int max = 0;
				for(int a = 0; a < prob.length; a++)
				{
					if(prob[a] > max)
					{
						max = prob[a];
					}
				}
			}
		}
	}
}
