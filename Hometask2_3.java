package by.epam.jb25.hometask;

import java.util.Scanner;

public class Hometask2_3 {
	public static void main(String[] args) {
		double c = 0, r = 0, s = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("������� ������: ");
			if (sc.hasNextDouble()) {
				r = sc.nextDouble();
				flag = true;
			} else {
				System.out.println("\n�� ����� �� �������������� �����.\n");
				sc.next();
			}
		} while (!flag);
		
		c = 2 * Math.PI * r;
		System.out.println("����� ���������� ����� " + c);
		
		s = Math.PI * Math.pow(r, 2);
		System.out.println("������� ����� ����� " + s);
		
	}

}
