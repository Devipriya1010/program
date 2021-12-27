package com.pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypes {

	public static void main(String[] args)throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		int a,b;
		long c,d;
		float e,f;
		char g;

		System.out.println("a");
		a=Integer.parseInt(ob.readLine());
		System.out.println("b");
		b=Integer.parseInt(ob.readLine());
		System.out.println("c");
		c=Long.parseLong(ob.readLine());
		System.out.println("d");
		d=Long.parseLong(ob.readLine());
		System.out.println("e");
		e=Float.parseFloat(ob.readLine());
		System.out.println("f");
		f=Float.parseFloat(ob.readLine());
		System.out.println("g");
		g=(char)ob.read();
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(e+f);
		System.out.println(g);
		
	
		

	}

}
