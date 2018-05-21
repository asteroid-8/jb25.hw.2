package by.epam.jb25.hometask;

import java.util.Scanner;

public class Hometask2_1 {
	public static void main(String[] args) { // ���������� ������ main - ����� ����� � ����������
		int n = 10; // ���������� ���������� ���� int

		Scanner sc = new Scanner(System.in); // �������� ������� ���� Scanner
		String max = "", min = "", str = ""; // ���������� �������� ������ String
		for (int i = 0; i < n; i++) { //���� for: � ���������� ����� ��������� ���������� i (int i = 0), ���������� ������� ���������� ����� (���� i < n) � ������� ���������� ���������� (i++) - ���
			System.out.print("> "); //��������� �� �������
			if (sc.hasNextLine()) { //�������� �������� if: �����������, ����� ������� � ������� ��������� �������� true - ��� ���������� ������, ������ ��� ����� ������� ����� ���������������� ��� ������
				str = sc.nextLine(); //������������ ���������� ��������, ���������� � ����������
				if (i == 0) { //�������� �������� if: ����������� ��������, ��� ������ �������� �����
					min = str; //������������ ���������� min ������ �� ���������� str
				}
				if (str.length() > max.length()) { //�������� �������� if: �����������, ����� ����� ���������� str ������ ����� ���������� max (true)
					max = str; //������������ ���������� max �������� ��������
				} else if (str.length() < min.length()) { //�������������� ����� else: �����������, ����� ��������� � ������� ��������� ��������� if ��������� �������� false 
					min = str; //������������ ���������� min �������� ��������
				}
			}
		}
		System.out.println("max string = " + max + " length=" + max.length()); //��������� �� ������� ������ ����������� �����
		System.out.println("min string = " + min + " length=" + min.length()); //��������� �� ������� ������ ������������ �����
	}

}
