package comparatordem;

import java.util.*;

public class InterfacesTest {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add("ksh");
	l.add("hi");
	l.add("josadj");
	Iterator i = l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
class SetTest{
	public static void main(String[] args) {
	Set s = new HashSet();
	s.add("ksh");
	s.add("ksh");
	s.add("hi");
	s.add("josadj");
	s.add("ksh");
	Iterator t = s.iterator();
	while(t.hasNext()) {
		System.out.println(t.next());
	}
}
}

	
	

