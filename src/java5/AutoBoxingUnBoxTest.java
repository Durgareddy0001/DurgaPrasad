package java5;

public class AutoBoxingUnBoxTest {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Integer i2 = i + 2;    // it is a Auto Boxing in java 1.5
		System.out.println(i2);
		Integer i3 = Integer.valueOf(i + 20);
		System.out.println(i3);
		int i4 = i3; // it is auto unBoxing in java 1.5 
		System.out.println(i4);
		String s1="102";
		System.out.println(s1);
		int i5=Integer.parseInt(s1+6);
		System.out.println(i5);
		// i1.toString();
		i2.toString();
	}
}
