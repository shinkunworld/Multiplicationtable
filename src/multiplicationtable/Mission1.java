package multiplicationtable;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Mission1 {

	public static void main(String[] args) {

		System.out.println("구구단중 출력할 단은?");

		Scanner scanner = new Scanner(System.in);
		try {
			int number = scanner.nextInt();
		
			if (number < 2) {
				System.out.println("2이하 숫자는 입력이 불가합니다");
			} else if (number > 19)

			{
				System.out.println("20이상 숫자는 입력이 불가합니다");
			} else {	System.out.println("구구단2단부터" + number + "단까지입니다");
				int[] result = new int[10];
				for (int i = 2; i <= number; i++) {
					for (int j = 1; j < 10; j++) {

						System.out.println(i + "*" + j + "=" + i * j);
//					result[i] = j * (i + 1);
				
					}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("입력오류");
		}
	}
}
