package multiplicationtable;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Mission1 {

	public static void main(String[] args) {

		System.out.println("�������� ����� ����?");

		Scanner scanner = new Scanner(System.in);
		try {
			int number = scanner.nextInt();
		
			if (number < 2) {
				System.out.println("2���� ���ڴ� �Է��� �Ұ��մϴ�");
			} else if (number > 19)

			{
				System.out.println("20�̻� ���ڴ� �Է��� �Ұ��մϴ�");
			} else {	System.out.println("������2�ܺ���" + number + "�ܱ����Դϴ�");
				int[] result = new int[10];
				for (int i = 2; i <= number; i++) {
					for (int j = 1; j < 10; j++) {

						System.out.println(i + "*" + j + "=" + i * j);
//					result[i] = j * (i + 1);
				
					}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("�Է¿���");
		}
	}
}
