package com.pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args)throws NumberFormatException, IOException {

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		double p,t,r,i;

		System.out.println("enter the principal amount= ");
		p=Double.parseDouble(ob.readLine());
		System.out.println("enter the rate of int=");
		r=Double.parseDouble(ob.readLine());
		System.out.println("enter the time= ");
		t=Double.parseDouble(ob.readLine());
		i=(p*r*t)/100;
		System.out.println("interset:"+i);
				

	}

}
