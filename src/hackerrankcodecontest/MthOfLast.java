package hackerrankcodecontest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MthOfLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		while (scanner.hasNextInt()) {
			mylist.addFirst(scanner.nextInt());
		}
		boolean found = false;
		if (mylist.size() > 0 && mylist.size() <= 1024) {
			int scanStartPos = mylist.size();
			if (m < scanStartPos / 2) {
				scanStartPos = scanStartPos / 2;
			}
			for (int i = scanStartPos - 1; i >= m; i--) {
				if (i == m) {
					System.out.printf("%d", mylist.get(i - 1));
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("NIL");
			}
		} else {
			System.out.println("NIL");
		}

	}

}
