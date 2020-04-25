package slr;

public class Palindrome
{
	public static boolean isPalindromeSimple(int num)
	{
		String numAsString = String.valueOf(num);
		return numAsString.equals(new StringBuilder(numAsString).reverse().toString());
	}

	public static boolean isPalindromeFast(int num)
	{
		int given = num;
		int reversed;

		for (reversed = 0; given > 0; given /= 10)
		{
			reversed = reversed * 10 + given % 10;
		}

		return num == reversed;
	}
}
