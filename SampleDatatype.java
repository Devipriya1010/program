package com.pro;

import java.util.Scanner;

public class SampleDatatype {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a,b;
		long x,y;
		float u,v;
		String word;

	    System.out.println("Enter the value a=");
		a=ob.nextInt();
		System.out.println("Enter the value b=");
		b=ob.nextInt();
		System.out.println("Enter the value x=");
		x=ob.nextLong();
		System.out.println("Enter the value y=");
		y=ob.nextLong();
		System.out.println("uEnter the value u=");
		u=ob.nextFloat();
		System.out.println("Enter the value v=");
		v=ob.nextFloat();
		System.out.println("Enter the string word=");
		word=ob.next();
		System.out.println("add="+(a+b));
		System.out.println("add1="+(x+y));
		System.out.println("add2="+(u+v));
		System.out.println("word="+word);
		ob.close();
		

	}

}
