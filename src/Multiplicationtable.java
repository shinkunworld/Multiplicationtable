import java.util.Scanner;

public class Multiplicationtable {
//    메소드구구단
	public static int[] caculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int []result=caculate(i);
			print(result);
		}
		
//		ctrl + alt + 아래 위 화살표
// 입력구구단
//		System.out.println("구구단 중 출력할 단은? :");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number);
//		if (number < 2) {
//			System.out.println("값을 잘못입력하였습니다");
//		} else if (number > 9) {
//			System.out.println("값을 잘못입력하였습니다");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
// 배열구구단
//		int[] result = new int[10];
//		for (int i = 2; i < result.length; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "=" + i * j);
//				result[i] = j * (i + 1);
//			}

//		}

	}

}
