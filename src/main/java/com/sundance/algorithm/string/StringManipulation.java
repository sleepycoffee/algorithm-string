package com.sundance.algorithm.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class StringManipulation {


	public static void main(String args[]) {

		//quick wasy to reverse String in Java - Use StringBuffer
		String word = "HelloWorld";
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);

		//another quick to reverse String in Java - use StringBuilder
		word = "WakeUp";
		reverse = new StringBuilder(word).reverse().toString();
		System.out.printf(" original String : %s , reversed String %s %n", word, reverse);

		//one way to reverse String without using StringBuffer or StringBuilder is writing
		//own utility method
		word = "Band";
		reverse = reverse(word);
		System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
		
		word = "Hello World";
		if(isUniqueCharacters(word)) {
			System.out.println(word + " has all unique characters");
		} else {
			System.out.println(word + " has duplicate characters");
		}
		
		word = "abcdef";
		if(isUniqueCharacters(word)) {
			System.out.println(word + " has all unique characters");
		} else {
			System.out.println(word + " has duplicate characters");
		}
	}   


	public static String reverse(String source){
		
		
		if(source == null || source.isEmpty()){
			return source;
		}       
		String reverse = "";
		for(int i = source.length() -1; i>=0; i--){
			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}
	
	public static boolean isUniqueCharacters(String str) {
		
		boolean unique = true;
		Set<Character> chars = new HashSet<>();
		for(int i = 0; i < str.length(); i++) {
			if(chars.contains(str.charAt(i))) {
				unique = false;
				break;
			} else {
				chars.add(str.charAt(i));
			}
		}
		
		return unique;
		
	}

}

