import java.util.Scanner;

public class Multiplicationtable {
//    �޼ҵ屸����
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
		
//		ctrl + alt + �Ʒ� �� ȭ��ǥ
// �Է±�����
//		System.out.println("������ �� ����� ����? :");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number);
//		if (number < 2) {
//			System.out.println("���� �߸��Է��Ͽ����ϴ�");
//		} else if (number > 9) {
//			System.out.println("���� �߸��Է��Ͽ����ϴ�");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
// �迭������
//		int[] result = new int[10];
//		for (int i = 2; i < result.length; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "=" + i * j);
//				result[i] = j * (i + 1);
//			}

//		}

	}

}
