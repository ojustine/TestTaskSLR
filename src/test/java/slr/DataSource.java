package slr;

import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;

public class DataSource
{
	@DataProvider(name = "database")
	public static Object[][] dataSource(Method testMethod)
	{
		String methodName = testMethod.getName();

		Object[][] fibonacciValidData = {{1, "1"},
										{10, "55"},
										{100, "354224848179261915075"},
										{1000, "43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875"}};

		Integer[][] palindromeValidData = {{0}, {11}, {2002}, {6645466}, {1000001}};
		Integer[][] palindromeInvalidData = {{-1}, {10}, {2092}, {6655466}, {1000000}};

		String[][] errorMessage = {{"No data present."}};


		if (methodName.equalsIgnoreCase("validValueFibonacciTest"))
		{
			return fibonacciValidData;
		}
		else if (methodName.equalsIgnoreCase("validValuePalindromeTest"))
		{
			return palindromeValidData;
		}
		else if (methodName.equalsIgnoreCase("invalidValuePalindromeTest"))
		{
			return palindromeInvalidData;
		}
		else
		{
			return errorMessage;
		}
	}
}