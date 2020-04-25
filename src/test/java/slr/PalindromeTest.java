package slr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest
{
	@Test(dataProvider="database", dataProviderClass = DataSource.class)
	public void validValuePalindromeTest(int palindrome)
	{
		Assert.assertTrue(Palindrome.isPalindromeFast(palindrome));
		Assert.assertTrue(Palindrome.isPalindromeSimple(palindrome));
	}

	@Test(dataProvider="database", dataProviderClass = DataSource.class)
	public void invalidValuePalindromeTest(int notPalindrome)
	{
		Assert.assertFalse(Palindrome.isPalindromeFast(notPalindrome));
		Assert.assertFalse(Palindrome.isPalindromeSimple(notPalindrome));
	}
}
