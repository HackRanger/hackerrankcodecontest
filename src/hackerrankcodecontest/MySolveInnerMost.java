package hackerrankcodecontest;



public class MySolveInnerMost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySolveInnerMost.innermostsuper.innermost me = new MySolveInnerMost().new innermostsuper().new innermost();
		me.printme();
	}
	
	class innermostsuper {
		void printme(){
			System.out.println("Hello I am super and outerclass");
		}
		class innermost extends innermostsuper {
			@Override
			void printme() {
				// TODO Auto-generated method stub
				System.out.println("Me inner");
				printme(); // missing super. fix here and run.
			}
		}
	}

}
