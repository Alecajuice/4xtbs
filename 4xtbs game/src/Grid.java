import java.awt.Graphics;
import java.io.IOException;
public class Grid 
{
    private int width = 100;
    private int height = 100;
    private int ID;
    private Tile[][] grid = new Tile[width][height];
    public Grid(int n, int w, int h) throws IOException
    {
        height = h;
        width = w;
        ID = n;
        generate();
    }
    public Tile getTile(int x, int y)
    {
        return grid[x][y]; 
    }
    public void generate() throws IOException
    {
        double[] probability = new double[6];
        for(int i = 2; i < probability.length; i++)
        {
            probability[i] = 1;
        }
        double sum = 0;
        for(int i = 1; i < probability.length; i++)
        {
            sum += probability[i];
        }
        probability[1] = 1;
        probability[ID] = 1;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                double random = (Math.random());
                int id = 0;
                if(random >= 0)
                {
                    id = 1;
                }
                if(random >= ((probability[1])/sum))
                {
                    id = 2;
                }
                if(random >= ((probability[1] + probability[2])/sum))
                {
                    id = 3;
                }
                if(random >= ((probability[1] + probability[2] + probability[3])/sum))
                {
                    id = 4;
                }
                if(random >= ((probability[1] + probability[2] + probability[3] + probability[4])/sum))
                {
                    id = 5;
                }
                grid[i][j] = new Tile(id, 0, new Coordinate(i,j), 0, 0);
                if(id == 0)
                {
                	System.out.println(random);
                }
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
    public void draw(Graphics screen)
    {
        for(int i = 0; i < grid.length; i ++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                grid[i][j].draw(screen);
            }
        }
    }
    public void smooth()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                float [] prob = new float[6];
                prob[grid[i][j].getID()] += 0;
                prob[1] += 0;
                for(int k = Math.max(0, i - 1); k <= Math.min(grid.length - 1, i + 1); k++)
                {
                    for(int l = Math.max(0, j - 1); l <= Math.min(grid[0].length - 1, j + 1); l++)
                    {
                        prob[grid[k][l].getID()] += 1;
                    }
                }
                float sum = 0;
                for(int a = 0; a < prob.length; a++)
                {
                    sum += prob[a];
                }
                double r = Math.random();
                for(int y = 1; y < prob.length; y++)
                {
                    float s = 0;
                    for(int z = 0; z < y; z++)
                    {
                        s += prob[z];
                    }
                    if(r > s/sum && r < (s + prob[y])/sum)
                    {
                        grid[i][j].setID(y);
                    }
                }
            }
        }
    }
}