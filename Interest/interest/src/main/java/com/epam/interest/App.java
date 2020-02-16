package com.epam.interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
	{

		Scanner in = new Scanner(System.in);
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));

		print.println("Principal Amount : ");
		double principal = in.nextDouble();
		print.println("Time Period : ");
		double time = in.nextDouble();
		print.println("Rate of Interest : ");
		double rate = in.nextDouble();

		print.println("Select Your Choice");
		print.println("1. Simple Interest");
		print.println("2. Compund Interest");

		int option = in.nextInt();

		switch(option) {

		case 1 :print.println("Simple Interest = " + simpleInterest(principal,time,rate));
		break;

		case 2 :print.println("Compound Interest = " + compoundInterest(principal,time,rate));
		break;

		default: print.println("Invalid Choice");
		break;

		}

		print.close();
		in.close();

	}

	public static double simpleInterest(double principal, double time, double rate) {

		return (principal * time * rate)/100;
	}

	public static double compoundInterest(double principal, double time, double rate) {
	
		double amount = principal * Math.pow((1 + (rate / 100)) , time);
		return amount - principal;
	}

}
