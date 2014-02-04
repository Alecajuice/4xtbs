import org.junit.Assert;
import org.junit.Test;

public class UnitTest
{

	
	@Test 
	public void testCalcRangeDmg1()
	{
		Assert.assertEquals(20, Unit.calcRangeDmg(25,5));
		
	}
	
	@Test 
	public void testCalcRangeDmg2()
	{
		Assert.assertEquals(0, Unit.calcRangeDmg(5,10));
		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCalcRangeDmg3()
	{
		Unit.calcRangeDmg(-25,5);
		
	}
	
	
}
