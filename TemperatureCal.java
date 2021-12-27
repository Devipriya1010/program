package com.pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureCal {

	public static void main(String[] args)throws NumberFormatException, IOException {

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		double c,f;
		System.out.println("temp in fahr f=");
		f=Double.parseDouble(ob.readLine());
		c=(f-3)/9*5;
		System.out.println("tem in cel ="+c);
	

	}

}
