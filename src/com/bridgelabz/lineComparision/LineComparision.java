package com.bridgelabz.lineComparision;

import java.util.Scanner;

/* @author Abhishek
 * 04.08.2022
 * UC-3
 * */

public class LineComparision {
	
	static double coords() {
		Scanner sc= new Scanner(System.in);

		System.out.print("enter the value of x1= ");
		double x1 = sc.nextDouble();

		System.out.print("enter the value of y1= ");
		double y1 = sc.nextDouble();
		
		System.out.print("enter the value of x2= ");
		double x2 = sc.nextDouble();
		
		System.out.print("enter the value of y2= ");
		double y2 = sc.nextDouble();
		
		
		double xCord = x2-x1;
		double xCordSquare=xCord*xCord;
		double yCord = y2-y1;
		double yCordSquare=yCord*yCord;
	    double lengthOfLine = Math.sqrt(xCordSquare+yCordSquare);
	    
	    return lengthOfLine;
	    }
		
		/**
		 * Method to calculate the length of two lines and
		 * check the equality of two lines.
		 */
		
		public static void length() {
			double line1 = coords();
			String s1 = Double.toString(line1);
			double line2 = coords();
			String s2 = Double.toString(line2);
			System.out.println("Length of Line 1 : "+s1);
			System.out.println("Length of Line 1 : "+s2);
			if (s1.equals(s2)) {
				System.out.println("Both Lines are Equal");
			} else {
				System.out.println("Both Lines are not Equal");
			}

		}
			/**
			 *Method to compare two lines and find the greater
			 *
			 */
			
			static void compareLength() {
				double line1 = coords();
				String s1 = Double.toString(line1);
				double line2 = coords();
				String s2 = Double.toString(line2);
				
				System.out.println("Length of Line 1 : "+s1);
				System.out.println("Length of Line 2 : "+s2);

					if (s1.compareTo(s2) < 0) {
					System.out.println("line1 is less than the line2");
					
				} else {
					System.out.println("line1 is greater than the line2");
					
				}
		
		  }
	    
	    
		public static void main(String[] args) {
			System.out.println("***Welcome to the Line Comparision Computation Program***");
			
			compareLength();

		   	}
	    }
	