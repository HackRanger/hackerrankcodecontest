package hackerrankcodecontest;

import java.util.Scanner;

class Sports{

	   String get_name()
	   {
	      return "Generic Sports";
	   }
	   void get_number_of_team_members()
	   {
	      System.out.println("Each team has n players in "+get_name());
	   }
	}

	class Soccer extends Sports
	{
	   String get_name()
	   {
	      return "Soccer Class";
	   }
	   
	  
	}

public class JavaEOF {
	
	abstract class book {
		abstract void setTitle();
	}
	
	class MyBook extends book{
		@Override
		void setTitle() {
			// TODO Auto-generated method stub
			
		}
	}
	
	interface AdvancedArithmetic{
		  public abstract int divisorSum(int n);
	}
	
	class MyCalculator implements AdvancedArithmetic{
	    @Override
	    public int divisorSum(int n){
	    	int sum=0;
	    	for (int i = 0; i<n; i++) {
				if(n%i==0) sum+=i;
			}
	        return 0;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.nextLine();
			System.out.println(s);

		}
	}

}
