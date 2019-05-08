package org.class1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// i am altering to give the reviewer name in pull request
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice of string");
		String s1 = s.next();
		String s2 ="";
		for(int i=s1.length()-1;i<s1.length();i--){
			char c = s1.charAt(i);
			s2=s2+c;
			if(i==0){
				break;
			}
		}
		System.out.println(s2);
		if(s2.equals(s1)){
			System.out.println("Given string is palindrome");
		}else{
			System.out.println("Given string is not palindrome");
		}
		}
	}
