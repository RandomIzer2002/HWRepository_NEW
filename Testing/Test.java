package Testing;

import java.util.Scanner;
import java.lang.Math;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		double i = 2;
		while (i <= 9) {
			i++;
		}
		double a = number / i;
		sc.close();
	}
}
