package hackerrankcodecontest;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in = new Scanner(System.in);
		      int testCases = Integer.parseInt(in.nextLine());
		      while(testCases>0){
		         String pattern = in.nextLine();
		         try{
		             //Write your code
		         Pattern p = Pattern.compile(pattern);
		         System.out.println("Valid");
		         }catch(PatternSyntaxException e)
		         {
		        	 System.out.println("Invalid");
		         }
		         testCases=testCases-1;
		      }
	}

}
