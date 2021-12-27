package com.pro;

public class Operator {

		public static void main(String[] args) {
			int a=10,b=17,c=67;
	//arithmetic
			System.out.println("arithmetic******"+(a+b));
			System.out.println(a-b);
			System.out.println(a/b);
			System.out.println(a*b);
			System.out.println(a%b);
	// logic		
			System.out.println("logic********"+(a>b && b>c));
			System.out.println(a>b || b>c);
			System.out.println(a!=b);
	//assignment		
			System.out.println("assignment *****"+(a+=12));//a=a+12
			System.out.println(a-=12);
			System.out.println(a*=12);
			System.out.println(a/=2);
	//bitwise
			System.out.println("bitwise*****"+(a&b));
			System.out.println(a|b);
			System.out.println(a>>b);
			System.out.println(a<<b);
	//increment and decrement
			System.out.println(a++);
			System.out.println(a);
			System.out.println(++a);

	}

}
