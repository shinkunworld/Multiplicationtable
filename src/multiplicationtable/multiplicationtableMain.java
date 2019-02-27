package multiplicationtable;

public class multiplicationtableMain {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			int[] result =  Multiplicationtable.caculate(i);
			Multiplicationtable.print(result);
		}
}}
