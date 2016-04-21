package hackerrankcodecontest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserNameRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String username = in.nextLine();
	         if(Pattern.matches("^[a-z0-9_.]{8,30}$", username))
	        	 System.out.println("Valid");
	         else
	        	 System.out.println("Invalid");
	         --testCases;
	         
	   
	      }
	}

}
