package com.preeti.javaprograms.DyamicProgramming.zero_one_knapsack;

class Max_no_strings_given_zero_ones{ 
	   
	// 3D dp table to store the state value 
	static int [][][]dp = new int[100][100][100]; 
	   
	// Function that count the combination 
	// of 0's and 1's from the given list 
	// of String 
	static int countString(int m, int n, 
	                String []arr, int i) 
	{ 
	    // Base Case if count of 0's or 1's 
	    // becomes negative 
	    if (m < 0 || n < 0) { 
	        return Integer.MIN_VALUE; 
	    } 
	   
	    // If index reaches out of bound 
	    if (i >= arr.length) { 
	        return 0; 
	    } 
	   
	    // Return the prestored result 
	    if (dp[m][n][i] != -1) { 
	        return dp[m][n][i]; 
	    } 
	   
	    // Intialise count of 0's and 1's 
	    // to 0 for the current state 
	    int zero = 0, one = 0; 
	   
	    // Calculate the number of 1's and 
	    // 0's in current String 
	    for (char c : arr[i].toCharArray()) { 
	        if (c == '0') { 
	            zero++; 
	        } 
	        else { 
	            one++; 
	        } 
	    } 
	   
	    // Include the current String and 
	    // recurr for the next iteration 
	    int x = 1 + countString(m - zero, 
	                            n - one, 
	                            arr, i + 1); 
	   
	    // Exclude the current String and 
	    // recurr for the next iteration 
	    int y = countString(m, n, arr, i + 1); 
	   
	    // Update the maximum of the above 
	    // two states to the current dp state 
	    return dp[m][n][i] = Math.max(x, y); 
	} 
	   
	// Driver Code 
	public static void main(String[] args) 
	{ 
	    String []arr = { "10", "0001", "1", 
	                           "111001", "0" }; 
	   
	    // N 0's and M 1's 
	    int N = 3, M = 5; 
	   
	    // Intialise dp array to -1 
	    for(int i = 0;i<100;i++){ 
	        for(int j = 0;j<100;j++){ 
	            for(int l=0;l<100;l++) 
	            dp[i][j][l]=-1; 
	        } 
	    } 
	   
	    // Function call 
	    System.out.print(countString(M, N, arr, 0)); 
	} 
	} 
	  
