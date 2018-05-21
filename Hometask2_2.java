package by.epam.jb25.hometask;

import java.util.Scanner;

public class Hometask2_2 {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, res = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag_a = false, flag_b = false, flag_c = false;
		
		do {
			System.out.print("Введите число a: ");
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				flag_a = true;
			} else {
				System.out.println("\nВы ввели не действительное число.\n");
				sc.next();
			}
			
		} while (!flag_a);
		
		do {
			System.out.print("Введите число b: ");
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				flag_b = true;
			} else {
				System.out.println("\nВы ввели не действительное число.\n");
				sc.next();
			}
			
		} while (!flag_b);
		
		do {
			System.out.print("Введите число с: ");
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				flag_c = true;
			} else {
				System.out.println("\nВы ввели не действительное число.\n");
				sc.next();
			}
			
		} while (!flag_c);
		
		
		res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c + b);
		
		System.out.print("\nРезультат выражения равен " + res);
	}

}
