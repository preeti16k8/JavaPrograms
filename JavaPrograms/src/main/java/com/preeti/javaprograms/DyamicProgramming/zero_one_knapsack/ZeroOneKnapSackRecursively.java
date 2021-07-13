package com.preeti.javaprograms.DyamicProgramming.zero_one_knapsack;

import java.util.Arrays;

public class ZeroOneKnapSackRecursively {
	 public static void main(String[] args) {
	 System.out.println(getMaxProfit(
	 new int[]{1, 3, 4, 5},
	 new int[]{1, 4, 5, 7},
	 7
	 ));
	 System.out.println(MAX_PROFIT);
	 System.out.println(getMaxProfit(
	 new int[]{1, 2, 3, 5},
	 new int[]{30, 70, 50, 60},
	 5
	 ));
	 System.out.println(MAX_PROFIT);
	 }
	 static int MAX_PROFIT = Integer.MIN_VALUE;
	 static int t[][]; // Memorization matrix.
	 public static int getMaxProfit(int[] weight, int[] val, int capacity) {
	 // Recursive Approach.
	 t = new int[weight.length + 1][capacity + 1]; // Memorization matrix
	 /**
	 * So we are making memorization matrix with Rows as the weights
	 * and capacity as the columns
	 * ------CAPACITY----->
	 * |
	 * |
	 * Weights.
	 * |
	 * |
	 * \/
	 */
	 for (int[] row : t) {
	 Arrays.fill(row, -1);
	 }
	 return MAX_PROFIT = getMaxProfitRecursively(weight, val, weight.length ,capacity);
	// return getMaxProfitRecursivelyBottomUp(weight, val, weight.length, capacity);
	 }
	public static int getMaxProfitRecursively(int[] weight, int[] value, int n,
	int capacity) {
	 // Base Condition.
	 if (n == 0 || capacity == 0) return 0;
	 // If result is pre-calculated, let's use it.
	 if (t[n][capacity] != -1) return t[n][capacity];
	 // Choice.
	 if (weight[n-1] <= capacity) {
	// Now we can either choose this or don't and we have to check the maximum.
	 return t[n][capacity] = Math.max(
	 // Choose the weight at index = n; hence capacity is reduced.
	(value[n-1] + getMaxProfitRecursively(weight, value, n - 1, capacity -
	weight[n-1])),
	 // Don't choose the weight at index = n, hence capacity is untouched.
	 getMaxProfitRecursively(weight, value, n - 1, capacity));
	 }
	else {
	// Since weight of item is > capacity so there is no chance we can choose it.
	return t[n][capacity] = getMaxProfitRecursively(weight, value, n - 1,
	capacity);
	 }
	 }
	public static int getMaxProfitRecursivelyBottomUp(int[] weight, int[] value,int n,int W)
	{

	 for (int i = 0; i < n+1; i++) {
	 for (int j = 0; j < W+1; j++) {
	 if (i == 0 || j == 0) {
	 t[i][j] = 0;
	 continue;
	 }
	 }
	 }
	// Now for Rest of the Matrix we will populate the result for the sub-problem
	 for (int i = 1; i < n+1; i++) {
	 for (int j = 1; j < W+1; j++) {
	 if (weight[i - 1] <= j) {
	 
	 t[i][j] = Math.max(
	 (value[i - 1] + t[i - 1][j - weight[i - 1]]), // Choose
	 t[i - 1][j] // Don't choose
	 );
	 } else {
	// Weight is greater so we will not choose the item.
	 t[i][j] = t[i - 1][j];
	 }
	 }
	 }
	 return t[n][W];
	 }
	}