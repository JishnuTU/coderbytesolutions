
/*
Name : Jishnu TU
Email : jishnutu1995@gmail.com
Given an array A of integers (both positive and negative integers), return the maximum contiguous su
For example A = [1,2,-3,5] your code should return 5
The naïve solution is O(n^2) try to code in O(n)
*/


import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		// reading the number of elements from the that we want to enter
		n = sc.nextInt();
		// creates an array in the memory of length 10
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array elements are: ");
		// accessing array elements using the for loop
		int sum = 0;
		// computing the sum by adding the fist and last numbers from array in iterate
		for (int i = 0; i < n/2; i++) {
			sum = sum + array[i] + array[n-i-1];
			
		}
		//  if the array size is odd adding the middle element
		if(n%2 != 0)
			sum = sum + array[n/2];
		
		System.out.print("maximum contiguous sum : " + sum);
	}
}
