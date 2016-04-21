package hackerrankcodecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaParallelogram {
	static int B;
	static int H;
	static boolean flag;
	static {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			B = Integer.parseInt(br.readLine());
			H = Integer.parseInt(br.readLine());
			if (H <= 0 || B <= 0) {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
				flag = false;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	}

}
