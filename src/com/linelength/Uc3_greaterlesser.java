package com.linelength;

import java.util.Scanner;

public class Uc3_greaterlesser {
	static double x1,x2,y1,y2;
	static double a1,a2,b1,b2;
	static double firstline;
	static double secondline;
	static double firstline (double x1,double x2,double y1,double y2) {
		firstline=Math.sqrt(Math.pow(x1, x2)+Math.pow(y1, y2));
		return firstline;
	}
	static double secondline(double a1,double a2,double b1,double b2) {
		secondline=Math.sqrt(Math.pow(a1, b2)+Math.pow(b1, b2));{
			return secondline;
		}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		
		


			
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter the value of firstline/x1,x2,y1,y2");
			 x1 = sc.nextDouble();
			 x2=sc.nextDouble();
			 y1=sc.nextDouble();
			 y2=sc.nextDouble();
			 System.out.println("enter the value of secondline/a1,a2,b1,b2");
			 a1=sc.nextDouble();
			 a2=sc.nextDouble();
			 b1=sc.nextDouble();
			 b2=sc.nextDouble();
		}
		firstline(x1,x2,y1,y2);
		secondline(a1,a2,b1,b2);
		System.out.println(firstline+ " " + " "+secondline);
		if(firstline==secondline) {
			System.out.println("both lines are equal");
		}else if(firstline>secondline) {
			System.out.println("firstline is greaterthan secondline");
		}
		else if(firstline<secondline) {
			System.out.println("firstline is lessthan secondline");
		}
		else {
			System.out.println("both lines are not equal");
		}
				
				
			}

			
		
			 
			 
			

			



			

	}


