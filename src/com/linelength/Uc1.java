package com.linelength;

import java.util.Scanner;

public class Uc1 {
	static double x1;
	static double x2;
	static double y1;
	static double y2;
	static double result1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				 
				Scanner sc = new Scanner(System.in);
				x1=sc.nextDouble();
				x2=sc.nextDouble();
				y1=sc.nextDouble();
				y2=sc.nextDouble();
				sc.close();
				double result=Math.sqrt(Math.pow(x1,x2))+Math.pow(y1,y2);
				
				System.out.println(result);
				
				

			}

		

	}


