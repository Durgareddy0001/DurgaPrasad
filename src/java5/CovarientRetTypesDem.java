package java5;

import java.util.*;

class FetchTest {
	public List fetch() {
		System.out.println("it is the covarient1 Ret Types");
		return null;
	}
}

class Test extends FetchTest {
	public ArrayList fetch() {
		System.out.println("it is the covarient Ret Types");

		return null;
	}
}

public class CovarientRetTypesDem {
	public static void main(String[] args) {
		FetchTest t = new Test();
		List l = t.fetch();
		t.fetch();
		System.out.println(t.toString());
	
	}
	

}
