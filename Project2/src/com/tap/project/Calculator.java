package com.tap.project;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Simple Calculator!");
		System.out.println("Select a Specific Operation to perform Calculation : ");
		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit");
		int n=scan.nextInt();
		System.out.print("The result after performing the operation is : "+calculatorOperations(n));

	}
	public static int calculatorOperations(int n) {
		Scanner scan=new Scanner(System.in);
		switch(n) {
		case 1:
			System.out.println("Enter the 1st Number : ");
			int n1=scan.nextInt();
			System.out.println("Enter the 2nd Number : ");
			int n2=scan.nextInt();
			return n1+n2;
		case 2:
			System.out.println("Enter the 1st Number : ");
			int n3=scan.nextInt();
			System.out.println("Enter the 2nd Number : ");
			int n4=scan.nextInt();
			return n3-n4;
		case 3:
			System.out.println("Enter the 1st Number : ");
			int n5=scan.nextInt();
			System.out.println("Enter the 2nd Number : ");
			int n6=scan.nextInt();
			return n5*n6;
		case 4:
			System.out.println("Enter the 1st Number : ");
			int n7=scan.nextInt();
			System.out.println("Enter the 2nd Number : ");
			int n8=scan.nextInt();
			return n7/n8;
		case 5:
			System.out.println("Enter the 1st Number : ");
			int n9=scan.nextInt();
			System.out.println("Enter the 2nd Number : ");
			int n10=scan.nextInt();
			return n9%n10;
		case 6:
			break;
		default:
			System.out.println("Invalid Input");
			return 0;
		}
		scan.close();
		return 0;
	}

}
