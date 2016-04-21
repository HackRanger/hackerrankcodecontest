package hackerrankcodecontest;

import java.io.*;


public class PrivateAccess {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());
		Object o =  new PrivateAccess().new Private();
		Private o1 = (PrivateAccess.Private) o;
		System.out.println(o1.powerof2(num));
		System.out.println("An instance of class: " + o.getClass().getSimpleName() + " has been created");
	}// end of main

	class Private {
		private String powerof2(int num) {
			return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
		}
	}// end of Privtate
}// end of solution
