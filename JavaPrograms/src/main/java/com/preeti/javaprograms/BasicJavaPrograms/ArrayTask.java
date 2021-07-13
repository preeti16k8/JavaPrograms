package com.preeti.javaprograms.BasicJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for (int n = 0; n < t; n++) {
	            int sizeofarr = sc.nextInt();

	         int[] arr1=new int[sizeofarr];
	         int[] arr2=new int[sizeofarr];
	         
	        for(int i=0; i<sizeofarr;i++){
	          arr1[i]=sc.nextInt();
	         }

	       for(int i=0; i<sizeofarr;i++){
	          arr2[i]=sc.nextInt();
	         }
	     
		
	     /*
	       int sizeofarr=5;
	      int arr1[]={5 ,2, 1, 3 ,4};
	      int arr2[]={3 ,5 ,4 ,2 ,4};*/
	         	
	      Pojo person = CompareArraynew(sizeofarr, arr1, arr2);
	            

	       if(person.b==false)
	        {
	    	   System.out.println("NO");
	        }

	    else if(person.b==true && person.j>0)
	            {
	    	System.out.println(person.j+" "+2);

	                }

	        else if(person.b==true && person.j<0){
	        	System.out.println(Math.abs(person.j)+" "+1);
	           }
	        else {
	        	System.out.println("Yes"); 
	        }
	        
	        }
	
}      
	public static Pojo CompareArraynew(int n,int[] a, int[] b) {
		
		int countn=0;
		int arraytemp[]=new int[n];
		 
		ArrayList<Integer> arrayLista = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			arrayLista.add(a[i]);
		}
		
      ArrayList<Integer> arrayListb = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			arrayListb.add(b[i]);
		}
		
		for(int i=0;i<n;i++){
		
			int index=(arrayListb.indexOf(arrayLista.get(i)));
			
			if(index!=-1){
				arrayListb.remove(index);
				
			}
			else{
				countn++;
				if(countn>1){
					
					return new Pojo(false,0);
					
				}
				
					arraytemp[0]=arrayLista.get(i);
					
				
			}
				
		}
		arraytemp[1]=arrayListb.get(0);
		
		if(countn==1){

			return new Pojo(true,arraytemp[0]-arraytemp[1]);
		}
		else if(countn==0){
			
			 return new Pojo(true,0);
		}
		
		else{
			
			 return new Pojo(false,0);
		}
		
	}
		
}      
	
	       
	       
	final class Pojo
	{
		public Boolean b;
		public Integer j;
		
		public Pojo(Boolean b, Integer j) {
			this.b = b;
			this.j = j;
			
		}
	}

	
	
