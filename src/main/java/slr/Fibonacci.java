package slr;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Fibonacci
{
	public static BigInteger getFibonacci(int position)
	{
		if (position <= 0)
		{
			return BigInteger.ZERO;
		}

		return Stream
				.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
						i -> new BigInteger[]{i[1], i[0].add(i[1])})
				.limit(position)
				.map(i -> i[1])
				.reduce((first, second) -> second)
				.orElse(BigInteger.ZERO);
	}
}
