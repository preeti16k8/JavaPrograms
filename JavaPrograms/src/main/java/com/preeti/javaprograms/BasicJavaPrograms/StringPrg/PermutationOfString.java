package com.preeti.javaprograms.BasicJavaPrograms.StringPrg;

public class PermutationOfString {

	
	public void StringPermutation(String prefix,String str){
		int length=str.length();
		
		if(length==0){
			System.out.println(prefix);
			return;
		}
		
		for(int i=0; i<length;i++){
			StringPermutation
			(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1, length));
		}
	}

	public void permutation(String str){
		StringPermutation("",str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermutationOfString p=new PermutationOfString();
		p.permutation("123");

	}

}
