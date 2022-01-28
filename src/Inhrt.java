class test2 {
		int i=10;
		static int j=20;
	}
	class B extends test2{
		
	}
	public class Inhrt{
		public static void main(String[] args) {
			B b1=new B();
			System.out.println(b1.i);
			System.out.println(b1.j);
		}
	}


