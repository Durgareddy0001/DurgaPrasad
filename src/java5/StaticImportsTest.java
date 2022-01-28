package java5;
import static comparatordem.Test2.*;

import comparatordem.Test2;
public class StaticImportsTest {
	public static void main(String... args) {
		System.out.println(i);
		System.out.println(j);
		m1();
		
		System.out.println("------ By calling by the class name---");
		System.out.println(Test2.i);
		System.out.println(Test2.j);
		Test2.m1();

	}
}

