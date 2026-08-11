package operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
			    System.out.println("Enter your marks: ");
			    double marks = input.nextDouble();

			    // ternary operator checks if
			    // marks is greater than 40
			    String result = (marks > 40) ? "pass" : "fail";

			    System.out.println("You " + result + " the exam.");
			    input.close();
		
		  		int x=1;
				System.out.println(x);//1
				System.out.println(x++);//1 //post increment
				System.out.println(x);//2
				
				System.out.println(++x);//3 //pre increment
				System.out.println(x);//3
				
				System.out.println(x--);//3
				System.out.println(x);//2
				System.out.println(--x);//1
				System.out.println(x);//1
				
				int a1=10;
				int b1=10;
				System.out.println(a1++ + ++a1);
				
				int a2=10;
				int b2=-10;
				System.out.println(~a2);//a=-a-1
				System.out.println(~b2);//b=-b-1

				boolean c=true;
				boolean d=false;
				System.out.println(!c);
				System.out.println(!d);
				
				System.out.println(10*10/5+3-1*4/2);
				System.out.println(4/2+8*4-(5+2)%3);
				System.out.println(5<2);
				System.out.println(1<2 && 3<5);
				System.out.println(true && false);
				System.out.println(true & false);
				
				System.out.println(12&25);
				System.out.println(1>2 || 3<5);
				System.out.println(true||false);
				System.out.println(true | false);
				System.out.println(12|25);
				int a3=10;
				int b3=5;
				int c3=20;
		        System.out.println(a3>b3|a3++<c3);
		        
		        
				System.out.println(1>2 ^ 3<5);
				System.out.println(true^false);
				System.out.println(5^7);
				
				int a=2;
				int b=2;
				System.out.println(a+=4);//a=a+4
				System.out.println(a-=4);//a=a-4
				System.out.println(a*=4);//a=a*4
				System.out.println(a/=4);//a=a/4
				System.out.println(a%=b);//a=a%2
				
				System.out.println(1==1);
				System.out.println(1==2);
				System.out.println("Erode"=="Perundurai");
				System.out.println(true==false);
				System.out.println(2!=1);
				System.out.println(3>3);
				System.out.println(3>=3);

}
}
