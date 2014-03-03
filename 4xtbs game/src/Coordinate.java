
public class Coordinate
{
	//Constructor instance variables
	private int x;
	private int y;
	
	//Coordinate constructor
	public Coordinate(int X, int Y)
	{
		x = X;
		y = Y;
	}

	public Coordinate(double X, double Y)
	{
		x = (int)X;
		y = (int)Y;
	}

	//Getters and setters
	public int getX()
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
}