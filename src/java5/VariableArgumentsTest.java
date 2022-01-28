package java5;

public class VariableArgumentsTest {
	int add(int... arr) {
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			r += arr[i];
		}
		return r;
	}
}

class TestV {
	public static void main(String[] args) {
		VariableArgumentsTest vat = new VariableArgumentsTest();
		int res = vat.add(5, 10, 25, 2, 255, 30, 25);
		System.out.println(res);
		int[] arr2 = { 10, 2, 52, 36, 96 };
		int res1 = vat.add(arr2);
		System.out.println(res1);
		int[] arr3 = { 1, 2, 3, 6, 9, 8, 5, 2, 1 };
		for(int i : arr3) {
		System.out.println(i);
		}
	}

}
