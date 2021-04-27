/*
Name : Jishnu TU
Email : jishnutu1995@gmail.com
Given a matrix A of size mxn (number of rows: m and number of columns n), the rows are sorted and the columns are also sorted. 
Write an efficient algo to return the index for a number x in the matrix, return -1 in case x is not in the matrix
For example: A = [[1,2,3],[4,5,6]] and x = 2 return (0,1)
Your solution must be of O(m+n)
*/

public class Question2 {

	static int[][] arr = { { 1, 2,3 }, { 4, 5, 6} };  // the array elements
	static int m = 2; // (number of rows: m and number of columns n
	static int n = 3;

	static int x = 4;  // element to be searched
	
	static Integer previousCheck = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(search (m/2));

		
		
	}
	
	/* applying binary search in row wise 
	 * 
	 * and then each row is fed to the binary search
	 * 
	 * 
	 */
	public static String  search (int k) {

		if(k>=m || previousCheck == k || k < 0)
			return "-1";
		
		Integer col = binarySearch(arr[k],0,n-1,x);

		if(col >= 0 || col == 0)
		{
			return 	k +"," + col;
		}
		else if (arr[k][n/2] >= x)
		{
			previousCheck = k;
			return	search(( (k-1)/2));
			
			
		}
		else
		{
			previousCheck = k;
			return search(k + k/2 + 1);
			
			
		}
		
		
	}
	
	
	
	
	static int binarySearch(int arr[], int l, int r, int x)
	{
	    while (l <= r) {
	        int m = l + (r - l) / 2;
	 
	        // Check if x is present at mid
	        if (arr[m] == x)
	            return m;
	 
	        // If x greater, ignore left half
	        if (arr[m] < x)
	            l = m + 1;
	 
	        // If x is smaller, ignore right half
	        else
	            r = m - 1;
	    }
	 
	    // if we reach here, then element was
	    // not present
	    return -1;
	}

}
