package hackerrankcodecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Checker {
	Comparator desc;

	public Checker() {
		// TODO Auto-generated constructor stub
		desc = new MyComparator();
	}

}

class MyComparator implements Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score == o2.score) {
			if (o1.name.compareTo(o2.name) < 0) {
				return -1;
			} // Special Case : check for names to story
			else if (o1.name.compareTo(o2.name) == 0) {
				return 0;
			} else {
				return 1;
			}
		} else if (o1.score > o2.score) {
			return -1;
		} else {
			return 1;
		}
	}
}

class Player {
	String name;
	int score;
}

public class CompareThePlayers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		Player Player[] = new Player[N];
		Checker check = new Checker();
		for (int i = 0; i < N; i++) {
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			Player[i] = new Player();
			Player[i].name = st.nextToken();
			Player[i].score = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(Player, check.desc);
		for (int i = 0; i < Player.length; i++) {
			System.out.printf("%s %s\n", Player[i].name, Player[i].score);
		}

	}

}
