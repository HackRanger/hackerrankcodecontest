package hackerrankcodecontest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static java.lang.System.in;

class Prime {
	public static boolean isPrime(int val) {
		if (val < 2)
			return false;
		for (int j = 2; j <= (int) Math.sqrt(val); j++) {
			if (val % j == 0)
				return false;
		}
		return true;
	}

	public static void checkPrime(int... values) {
		if (values != null && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				int N = values[i];
				if (isPrime(N))
					System.out.print(N + " ");
			}
			System.out.println("");
		}
	}
}

public class CheckPrime {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			Random rand = new Random();
			int n = rand.nextInt();
			Prime ob = new Prime();

			Prime.checkPrime(9, 10, 32, 89, 66);
			Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
			Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
