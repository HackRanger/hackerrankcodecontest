package hackerrankcodecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weired {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		try {
			N = Integer.parseInt(br.readLine());
			boolean evenValue = (N % 2 == 0) ? true : false;
			if (evenValue) {
				if ( N >= 2  && N < 5) {
					System.out.println("Not Weird");
				}

				if ( N >=6 && N <= 20) {
					System.out.println("Weird");
				}

				if (N > 20) {
					System.out.println("Not Weird");
				}
			} else {
				System.out.println("Weird");
			}
		} catch (NumberFormatException|IOException e) {
			// TODO: handle exception
			System.out.println("Enter a Number");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
