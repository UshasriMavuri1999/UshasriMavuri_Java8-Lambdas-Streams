package com.epam.java8Lambdas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/*
 * Given a list of strings
 * Write a method that returns a list of all the palindrome strings.
 */

public class PalindromeStrings {
		
		public static ArrayList<String> getPalindromesList(ArrayList<String> stringArr){
			ArrayList<String> result = new ArrayList<String>();
			
			Predicate<String> predicate = (str)-> str.equals(new StringBuilder().append(str).reverse().toString());
			
			for(String str : stringArr) {
				if(predicate.test(str)) {
					result.add(str);
				}
			}
			
			return result;
		}
		
		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter no.of Strings: ");
			
			int noOfElements = scan.nextInt();
			
			ArrayList<String> arrayString = new ArrayList<String>();
			
			System.out.println("Enter "+noOfElements+" strings: ");
			
			for(int index=0;index<noOfElements;index++) {
				arrayString.add(scan.next());
			}
			
			ArrayList<String> palindromeArray = getPalindromesList(arrayString);
			
			if(palindromeArray.size()==0) {
				System.out.println("There are no palindromes in given array of Strings.");
			}
			else {
				System.out.println("The palindromes in given array of Strings are: ");
				for(String strpalindrome: palindromeArray ) {
					System.out.println(strpalindrome);
				}
			}
			
		
	}

}
