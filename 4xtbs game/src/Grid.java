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
            probability[i] = 0.1;
        }
        probability[1] = 0.3;
        probability[ID] = 0.3;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                double random = (Math.random());
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
                prob[grid[i][j].getID()] += 10;
                prob[0] += 2;
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
                for(int y = 0; y < prob.length; y++)
                {
                    int s = 0;
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