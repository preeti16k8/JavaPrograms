package com.preeti.javaprograms.BasicJavaPrograms.StringPrg;

import java.util.HashMap;
import java.util.Set;

public class findDuplicateCharInString {
	
	static void duplicateCharCount(String inputStrg){
		//creating hashmap which contain char as key and its occurrences as value
		
		HashMap<Character,Integer> charCntMap=new HashMap<Character,Integer>();
		//Convert input string to char Array
		
		char[] strArray=inputStrg.toCharArray();
		for(char c:strArray){
			if(charCntMap.containsKey(c)){
				//if char is presnt in charcntmap ,then increment by 1
				charCntMap.put(c, charCntMap.get(c)+1);
			}
			else{
				//if char is not present in charCntMap
				charCntMap.put(c, 1);
			}
		}
		
		System.out.println("Duplicate Character in "+inputStrg);
		
		Set<Character>  CharInString = charCntMap.keySet();
		//iterating through set charInString
		for(Character ch: CharInString){
			
		//	System.out.println(ch+":"+charCntMap.get(ch));
			
			if(charCntMap.get(ch)>1){
				System.out.println(ch+":"+charCntMap.get(ch));
			}
		}
	}

	
	

	public static void main(String[] args) {
	
		findDuplicateCharInString SObj=new findDuplicateCharInString();
		SObj.duplicateCharCount("preeti");
	}

}
