package hackerrankcodecontest;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static int B,H;
	static boolean flag = false;
	static{
		Scanner in = new Scanner(System.in);
		B =in.nextInt();
		H = in.nextInt();
		if(B <= 0 || H <= 0)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		
		}
		else flag = true;
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main


}
