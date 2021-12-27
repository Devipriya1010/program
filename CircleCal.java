package com.pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCal {

	public static void main(String[] args)throws NumberFormatException, IOException {

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		double r,a,p;
		double pi=3.14;
		System.out.println("rad of cir r =");
		r=Double.parseDouble(ob.readLine());
		a=pi*r*r;
		System.out.println("arer"+a);
		p=2*pi*r;
		System.out.println("perimeter"+p);
		

	}

}
