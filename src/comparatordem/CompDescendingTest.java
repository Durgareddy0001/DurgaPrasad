package comparatordem;

import java.util.*;

class Emp{
	int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}
class Test implements Comparator{
	public int compare(Object o1, Object o2) {
	Emp e1 = (Emp) o1;
	Emp e2 = (Emp) o2;
	if(e1.id<e2.id) {
		return -1;
	}else if (e1.id>e2.id) {
		return 1;
	}else
		return 0;
	}
}
public class CompDescendingTest {
	public static void main(String[] args) {
		Set s= new TreeSet(new Test());
		Emp e1 = new Emp(10,"ghu");
		Emp e2 = new Emp(20,"hks");
		Emp e3 = new Emp(10,"ghu");
		Emp e4 = new Emp(30,"khks");
		Emp e5 = new Emp(40,"aghu");
		Emp e6 = new Emp(50,"hiks");
		System.out.println(s.add(e1));		
		System.out.println(s.add(e2));
		System.out.println(s.add(e3));
		System.out.println(s.add(e4));
		System.out.println(s.add(e5));
		System.out.println(s.add(e6	));

		
//		System.out.println(s.add(new Emp(10,"hi")));
//		System.out.println(s.add(new Emp(100,"bay")));
//		System.out.println(s.add(new Emp(20,"to")));
//		System.out.println(s.add(new Emp(30,"comparator")));
//		System.out.println(s.add(new Emp(60,"bay")));
//		System.out.println(s.add(new Emp(100,"hi")));
//		System.out.println(s.add(new Emp(10,"hi")));
//		
		System.out.println(s);
		System.out.println("----------ReverseOrder------------");
	Set s1 = new TreeSet(Collections.reverseOrder(new Test()));
	
		Emp t1 = new Emp(10,"ghu");
		Emp t2 = new Emp(20,"hks");
		Emp t3 = new Emp(10,"ghu");
		Emp t4 = new Emp(30,"khks");
		Emp t5 = new Emp(40,"aghu");
		Emp t6 = new Emp(50,"hiks");
		System.out.println(s1.add(t1));		
		System.out.println(s1.add(e2));
		System.out.println(s1.add(e3));
		System.out.println(s1.add(e4));
		System.out.println(s1.add(e5));
		System.out.println(s1.add(e6	));
//	System.out.println(s1.add(new Emp(10,"hi")));
//	System.out.println(s1.add(new Emp(100,"bay")));
//	System.out.println(s1.add(new Emp(20,"to")));
//	System.out.println(s1.add(new Emp(30,"comparator")));
//	System.out.println(s1.add(new Emp(60,"bay")));
//	System.out.println(s1.add(new Emp(100,"hi")));
//	System.out.println(s1.add(new Emp(10,"hi")));
		System.out.println(s1);
	}
}