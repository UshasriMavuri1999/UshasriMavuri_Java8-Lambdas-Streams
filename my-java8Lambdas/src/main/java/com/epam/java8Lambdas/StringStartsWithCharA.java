package com.epam.java8Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*
 * Given a list of strings,
 * write a method that returns a list of all strings that
 * starts with the letter 'a' and have exactly 3 letters.
 */
public class StringStartsWithCharA {
	
	public static ArrayList<String> getStringWithCharA(ArrayList<String> arrayString){
		
		Predicate<String> predicate = (s)->s.length()==3 && s.startsWith("a");
		List<String> result = new ArrayList<String>();
		result=arrayString.stream().filter(predicate).collect(Collectors.toList());
		return (ArrayList<String>) result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter no.of Strings: ");
		
		int noOfStrings = scan.nextInt();
		
		ArrayList<String> arrayString = new ArrayList<String>();
		
		System.out.println("Enter "+noOfStrings+" strings: ");
		
		for(int index=0;index<noOfStrings;index++) {
			arrayString.add(scan.next());
		}
		
		ArrayList<String> res = getStringWithCharA(arrayString);
		
		if(res.size()==0) {
			System.out.println("There is no palindromes in given array of Strings.");
		}
		else {
			System.out.println("The palindromes in given array of Strings are: ");
			for(String palindromestring: res ) {
				System.out.println(palindromestring);
			}
		}
		scan.close();
	}

}
