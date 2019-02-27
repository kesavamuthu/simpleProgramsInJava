import java.util.Scanner;

public class sample  {
	

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l = 0; l < t; ++l) {
		String name = sc.next();
		name = name.toLowerCase();
		int count = 0;
		char in[] = name.toCharArray();
		int sum = 0;

		for (int i = 0; i < name.length() - 1; ++i)
			for (int j = i; j < name.length() ; ++j) {
				// in[j] = name.charAt(j);
				for (int k = i; k <= j; ++k)
					if (in[k] == 'a' || in[k] == 'e' || in[k] == 'i' || in[k] == 'o' || in[k] == 'u') {
						++count;
						// System.out.print(in[k]);
					}
				System.out.println(count);
				sum += count;
				count = 0;

			}
		System.out.println(sum);
	}

	}
}
