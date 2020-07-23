package com.epam.java8Lambdas;

import java.util.Scanner;
import java.util.*;

/**
 * Method which returns the average of a list of integers
 *
 */
public class AverageOfListElements
{
	interface FunctionInterface{
		int add(int a, int b);
	}
	
	public static int avgOfListOfElements(int noOfElements, ArrayList<Integer> list) {
		int sumOfElements=0;
		FunctionInterface obj = (int a, int b) -> (a+b);
		for(int index=0;index<noOfElements;index++) {
			sumOfElements = obj.add(sumOfElements, list.get(index));
		}
		return (int)sumOfElements/noOfElements;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int noOfIntegers,avgOfElements;
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter number of elements: ");
		noOfIntegers=scan.nextInt();
		System.out.println("Enter elements: ");
		for(int index=1;index<=noOfIntegers;index++)
		{
			list.add(scan.nextInt());
		}
		avgOfElements=avgOfListOfElements(noOfIntegers,list);
		System.out.println("Average of given list of Elements is : "+avgOfElements);
		scan.close();
	}
}