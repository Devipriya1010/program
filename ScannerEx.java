package com.pro;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a,b;
		long c,d;
		float e,f;
		String name;

		System.out.println("Enter the value of a=");
		a=ob.nextInt();
		System.out.println("Enter the value b=");
		b=ob.nextInt();
		System.out.println("Enter the value c=");
		c=ob.nextLong();
		System.out.println("Enter the value d=");
		d=ob.nextLong();
		System.out.println("Enter the value e=");
		e=ob.nextFloat();
		System.out.println("Enter the value f=");
		f=ob.nextFloat();
		System.out.println("Enter the word name=");
		name=ob.next();
		System.out.println("add="+(a+b));
		System.out.println("longadd="+(c+d));
		System.out.println("float add="+(e+f));
		System.out.println("name="+name);
		ob.close();
		


	}

}
