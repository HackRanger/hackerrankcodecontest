package hackerrankcodecontest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Permission;

class Volume {
	// cube
	int main(int a) {
		return a * a * a;
	}

	// Cuboid
	int main(int l, int b, int h) {
		return l * b * h;
	}

	// Hemisphere
	double main(double r) {
		return (2 / 3) * Math.PI * r * r * r;
	}

	// Cylinder
	double main(double r, double h) {
		return Math.PI * r * r * h;
	}
}

class Display {
	public void display(double x) {
		System.out.printf("%.3f\n", x);
	}
}

class Calculate {
	Display output;
	BufferedReader br;

	public Calculate() {
		// TODO Auto-generated constructor stub
		br = new BufferedReader(new InputStreamReader(System.in));
		output = new Display();
	}

	public int getINTVal() {
		int val = 0;
		try {
			val = Integer.parseInt(br.readLine());
			if (val <= 0)
				throw new NumberFormatException("All the values must be positive");
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
		return val;
	}

	public double getDoubleVal() throws IOException {
		double val = 0;
		try {
			val = Double.parseDouble(br.readLine());
			if (val <= 0)
				throw new NumberFormatException("All the values must be positive");
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
		return val;
	}

	public static Volume get_Vol() {
		return new Volume();
	}
}

public class VolumeCalc {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.getINTVal();
			while (T-- > 0) {
				double volume = 0.0d;
				int ch = cal.getINTVal();
				if (ch == 1) {

					int a = cal.getINTVal();
					volume = Calculate.get_Vol().main(a);

				} else if (ch == 2) {

					int l = cal.getINTVal();
					int b = cal.getINTVal();
					int h = cal.getINTVal();
					volume = Calculate.get_Vol().main(l, b, h);

				} else if (ch == 3) {

					double r = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r);

				} else if (ch == 4) {

					double r = cal.getDoubleVal();
					double h = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r, h);

				}
				cal.output.display(volume);
			}

		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}// end of Do_Not_
