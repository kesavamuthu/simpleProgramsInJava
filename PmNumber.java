package com.hackrerth;

public class PmNumber {
	static int fLimit, sLimit;

	static boolean isPrime(int a) {
		for (int i = 2; i <= Math.sqrt((double) a); ++i)
			if (a % i == 0)
				return false;
		return true;
	}

	static int cDigit(int a) {
		int b, c;
		b = c = 0;
		while ((a /= 10) >= 10) {
			//a /= 10;
			++c;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fLimit = 10;
		sLimit = 1000;
		int b, c;
		b = c = 0;
		for (int i = fLimit; i <= sLimit; ++i)
			if (isPrime(i)) {
				b = c = 0;
				c = i;
				if (cDigit(i) > 0) {
					while (c >= 10) {
						b = b+(c % 10);
						c /= 10;
					}
					if ( isPrime(b+c))
						System.out.println(i);
				//	if(c > 1 && isPrime(b + c))
					//	System.out.println(i);
				}
				else {
					//System.out.println("in");
					b = c % 10;
					c /= 10;
					if (isPrime(b + c))
						System.out.println(" i value is "+i);
				}
				// System.out.print(b+" "+c);
				
			}

	}

}
