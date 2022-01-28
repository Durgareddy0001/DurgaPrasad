
class Datatype {
	int id;
	int branchId;
	private int nani;
}
class test1{
	public static void main(String[] args) {
		Datatype e1=new Datatype();
		System.out.println(e1.id);
		System.out.println(e1.branchId);
		e1.id=101;
		e1.branchId=10;
		System.out.println(e1.id);
		System.out.println(e1.branchId);
		Datatype e2=new Datatype();
		System.out.println(e2.id);
		e2.id=102;
		System.out.println(e2.id);
		System.out.println(e2.branchId);
		System.out.println(e1.branchId);
	}
}
