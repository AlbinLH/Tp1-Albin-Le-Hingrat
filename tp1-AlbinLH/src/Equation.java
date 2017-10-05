import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		double d;
		double s1;
		double s2;
		double s0;
		Scanner scan = new Scanner(System.in);
		System.out.println("a ?");
		double a = scan.nextDouble();
		System.out.println("b ?");
		double b = scan.nextDouble();
		System.out.println("c ?");
		double c = scan.nextDouble();
		d = b*b-4*a*c;
		if (d > 0) {
			s1 = (-b-Math.sqrt(d))/(2*a);
			s2 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Solution 1 ="+s1+" et solution 2 ="+s2);
		}
		if (d == 0) {
			s0 = -b/(2*a);
			System.out.println("Solution double ="+s0);
		}
		if (d < 0) {
			System.out.println("Pas de solution dans R");
		}
	}

}
