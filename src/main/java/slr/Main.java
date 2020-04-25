package slr;

public class Main
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 100001; i *= 10)
		{
			long timeBefore = System.currentTimeMillis();
			System.out.println(Fibonacci.getFibonacci(i));
			long timeAfter = System.currentTimeMillis();

			System.out.println("Calculating the Fibonacci number at position "
								+ i +
								" took "
								+ ((timeAfter - timeBefore) / 1000) +
								" seconds "
								+ ((timeAfter - timeBefore) % 1000) +
								" milliseconds\n");
		}

		System.out.println(Palindrome.isPalindromeSimple(0));
		System.out.println(Palindrome.isPalindromeSimple(1001));
		System.out.println(Palindrome.isPalindromeSimple(1000));

		System.out.println(Palindrome.isPalindromeFast(0));
		System.out.println(Palindrome.isPalindromeFast(1001));
		System.out.println(Palindrome.isPalindromeFast(1000));
	}
}