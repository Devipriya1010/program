package com.pro;

import java.util.Scanner;

public class OperatorsInJava {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value a=");
		a=ob.nextInt();
		System.out.println("enter the value b=");
		b=ob.nextInt();
		System.out.println("enter the value c=");
		c=ob.nextInt();
		
		
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
		ob.close();
		
		}

}

