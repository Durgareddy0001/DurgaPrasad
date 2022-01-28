package comparatordem;

import java.util.*;

class T {
	public void process(List list, boolean flag) {
		Set s = new HashSet();
		s.add("ksh");
		s.add("ksh");
		s.add("hi");
		s.add("josadj");
		s.add("ksh");
		for (int i = 0; i < list.size(); i++) {
			if (s.add(list.get(i))) {
				flag = false;
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).equals(list.get(j))) {
						flag = true;
						break;
					}
				}
			}
			if (flag == false) {
				System.out.println(list.get(i));
			}
		}
	}
}

public class Test3 {
	public static void main(String[] args) {
	}
}
