package by.epam.jb25.hometask;

import java.util.Scanner;

public class Hometask2_3 {
	public static void main(String[] args) {
		double c = 0, r = 0, s = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Введите радиус: ");
			if (sc.hasNextDouble()) {
				r = sc.nextDouble();
				flag = true;
			} else {
				System.out.println("\nВы ввели не действительное число.\n");
				sc.next();
			}
		} while (!flag);
		
		c = 2 * Math.PI * r;
		System.out.println("Длина окружности равна " + c);
		
		s = Math.PI * Math.pow(r, 2);
		System.out.println("Площадь круга равна " + s);
		
	}

}
