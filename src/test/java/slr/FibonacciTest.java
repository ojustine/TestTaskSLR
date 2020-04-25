package slr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest
{
	@Test(timeOut = 100, dataProvider="database", dataProviderClass = DataSource.class)
	public void validValueFibonacciTest(int pos, String value)
	{
		Assert.assertEquals(Fibonacci.getFibonacci(pos).toString(), value);
	}

	@Test
	public void invalidValueFibonacciTest()
	{
		Assert.assertEquals(Fibonacci.getFibonacci(0).toString(), "0");
		Assert.assertEquals(Fibonacci.getFibonacci(-1).toString(), "0");
	}
}
