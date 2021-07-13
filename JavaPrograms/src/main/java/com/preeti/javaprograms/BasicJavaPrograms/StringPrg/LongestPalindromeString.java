package com.preeti.javaprograms.BasicJavaPrograms.StringPrg;

public class LongestPalindromeString {
	
	
	public static String getLongestPalindrome(final String input){
		int rightIndex=0,leftIndex=0;
		String currentPalindrome="", LongestPalindrome="";
		
		for(int centerIndex=1;centerIndex<input.length()-1;centerIndex++){
			
			leftIndex=centerIndex-1; rightIndex=centerIndex+1;
			
			while(leftIndex>=0&&rightIndex<input.length()){
				
				if(input.charAt(leftIndex)!=input.charAt(rightIndex)){
					break;
				}
				currentPalindrome=input.substring(leftIndex, rightIndex+1);
				if(currentPalindrome.length()>LongestPalindrome.length()){
					LongestPalindrome=currentPalindrome;
				}
				leftIndex--; rightIndex++;
			}
		}
		
		return LongestPalindrome;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="abbacabacabab";
		String str="aaaabbaa";
		//String str="forgeeksskeegfor";
		String longestpali=getLongestPalindrome(str);
		System.out.println("String:"+str);
		System.out.println("Longest Palindrome:"+longestpali);

	}

}
