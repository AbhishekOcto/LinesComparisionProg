package com.bridgelabz.lineComparision;

import java.util.Scanner;

/* @author Abhishek
 * 04.08.2022
 * */

public class LineComparision {
	
	double x1, y1, x2, y2;
	
	
	public static void main(String[] args) {
		System.out.println("***Welcome to the Line Comparision Computation Program***");
	/* 
	 * UC 1 Finding the length of a line from two coordinated
	 * */
		
			Scanner sc= new Scanner(System.in);
			System.out.print("enter the value of x1= ");
			double x1 = sc.nextDouble();
		
			System.out.print("enter the value of y1= ");
			double y1 = sc.nextDouble();
			
			System.out.print("enter the value of x2= ");
			double x2 = sc.nextDouble();
			
			System.out.print("enter the value of y2= ");
			double y2 = sc.nextDouble();
			sc.close();
			
			double xCord = x2-x1;
			double xCordSquare=xCord*xCord;
			double yCord = y2-y1;
			double yCordSquare=yCord*yCord;
		    double lengthofline= Math.sqrt(xCordSquare+yCordSquare);
			System.out.println("Length of given line is = "+lengthofline);
        	}

     }