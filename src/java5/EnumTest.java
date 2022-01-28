
package java5;
enum Color{
	RED , ORANGE , GREEN
}
class Signals{
	public void _3waysinganls(Color c) {
		if(c.ordinal()==0) {
			System.out.println("STOP");
		}else if(c.ordinal()==1) {
			System.out.println("WATE");
		}else {
			System.out.println("GO");
		}
	}
}
public class EnumTest {
	public static void main(String[] args) {
		Signals s = new Signals();
		s._3waysinganls(Color.GREEN);
		s._3waysinganls(Color.RED);
		s._3waysinganls(Color.ORANGE);
		
	}

}

enum Fruits{
	APPLE(25),ORANGE(10),BANANA(3),MANGO(5),WATERMELON(50);
	int value;
	Fruits(int value){
		this.value=value;
		
	}
	public int getvalue() {
		return this.value;
	}
}

class FruitsTest{
	public static void main(String[] args) {
		System.out.println(Fruits.WATERMELON);
		System.out.println(Fruits.APPLE.ordinal());//we will get index number
		System.out.println(Fruits.APPLE.getvalue());//we will get value we given
	int totol=0;
	Fruits[] arr = {Fruits.APPLE , Fruits.BANANA , 
			Fruits.MANGO , Fruits.ORANGE , Fruits.WATERMELON};
	for (Fruits f : arr) {
		totol = + f.getvalue();
	}
	System.out.println(totol);
	}
	
}