package com.linelength;

import java.util.Scanner;

public class Uc2_comparelength {
	static double x1,x2,y1,y2;
    static double a1,a2,b1,b2;
    static double firstline;
    static double secondline;
    //method for line1
    public static double firstline(double x1,double x2,double y1,double y2) {
    	firstline=Math.sqrt(Math.pow(x1,x2))+Math.pow(y1,y2);
    	return firstline;
    }
    public static double secondline(double a1,double a2,double b1,double b2) {
    	secondline=Math.sqrt(Math.pow(a1,a2))+Math.pow(b1,b2);
    	return secondline;
    }
	
		// TODO Auto-generated method stub
		

		

		
			
			
			public static void main(String[] args) {
				
		      
			Scanner sc= new Scanner(System.in);
		       {
		    	   System.out.println("enter the value of firstline/x1,x2,y1,y2");
		    	   x1=sc.nextDouble();
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
		       System.out.println(firstline +" " + " "+secondline);
		       if(firstline==secondline) {
		    	   System.out.println("both lines are equal");
		       }
		       else
		       {
		    	   System.out.println("both lines are not equal");
		       }
		       
		    	   
		       }
		       
			



	}


