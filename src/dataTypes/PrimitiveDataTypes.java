package dataTypes;

public class PrimitiveDataTypes {
	
	boolean bool;
	byte num;
	char grade;
	short nums;
	int number;
	long bigdata;
	float fewdecimal;
	double moredecimal;

	public static void main(String[] args) {
		PrimitiveDataTypes obj = new PrimitiveDataTypes();
		System.out.println(obj.bool);
		System.out.println(obj.num);
		System.out.println(obj.grade);
		System.out.println(obj.nums);
		System.out.println(obj.number);
		System.out.println(obj.bigdata);
		System.out.println(obj.fewdecimal);
		System.out.println(obj.moredecimal);	
		
		byte num1 = 127;
		long big = 2324354545454653456L;
		float few = 10.493859345749857f;
		char gr = 66;
		byte val = 'B';
		
		System.out.println(num1);
		System.out.println(big);
		System.out.println(few);
		System.out.println(gr);
		System.out.println(val);
		

	}

}
