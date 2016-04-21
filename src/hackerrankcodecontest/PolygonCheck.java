package hackerrankcodecontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PolygonCheck {

	static int checkSquare(HashMap<Integer, Integer> h, ArrayList<Integer> sortedArray) {
		int squareCount = 0;
		Object[] keys = h.keySet().toArray();
		for (int i = 0; i < h.size(); i++) {
			if ( (h.get(keys[i]) > 4) && (h.get(keys[i]) % 4 == 0))
				squareCount+= (h.get(keys[i]) % 4);
		}
		return squareCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> sidesArray = new ArrayList<>();
		while (scanner.hasNextInt()) {
			int side = scanner.nextInt();
			sidesArray.add(side);
		}
		Collections.sort(sidesArray);
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < sidesArray.size(); i++) {
			if (h.containsKey(sidesArray.get(i))) {
				h.put(sidesArray.get(i), h.get(sidesArray.get(i)) + 1);
			} else {
				h.put(sidesArray.get(i), 1);
			}
		}
		System.out.println(checkSquare(h, sidesArray));
	}
}
