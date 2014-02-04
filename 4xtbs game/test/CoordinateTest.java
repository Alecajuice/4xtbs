import org.junit.Assert;
import org.junit.Test;



public class CoordinateTest 
{
	@Test 
	public void testX1()
	{
		Coordinate coordinate1 = new Coordinate(1,3);
		Assert.assertEquals(1, coordinate1.getX());
		
	}
	
	@Test 
	public void testY1()
	{
		Coordinate coordinate2 = new Coordinate(1,3);
		Assert.assertEquals(3, coordinate2.getY());
		
	}
	@Test 
	public void testX2()
	{
		Coordinate coordinate1 = new Coordinate(-1,3);
		Assert.assertEquals(100, coordinate1.getX());
		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testY2()
	{
		Coordinate coordinate1 = new Coordinate(1,-3);
		
	}
	@Test 
	public void testX3()
	{
		Coordinate coordinate1 = new Coordinate(109,3);
		Assert.assertEquals(8, coordinate1.getX());
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testY3()
	{
		Coordinate coordinate1 = new Coordinate(1,109);

		
	}

}
