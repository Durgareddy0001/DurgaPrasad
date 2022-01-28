
package java5;
import java.util.*;
public class AdvForLoop {
	private static final String Interger = null;

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("shiva");
		l.add(Interger.valueOf(5));
		l.add(new String("lood"));
		for(Object o : l) {
			System.out.println(o);
		}
	}	
}
