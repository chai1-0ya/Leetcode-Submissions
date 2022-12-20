//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int n = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[n];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Solution obj = new Solution();
		    int ans = obj.maxDistance(arr, n);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        int Max = 0;
        int X1 = Integer.MIN_VALUE;
        int X2 = Integer.MAX_VALUE;
        int Y1 = Integer.MIN_VALUE;
        int Y2 = Integer.MAX_VALUE;
        for(int i=0; i< n; i++){
            X1 = Math.max(X1, arr[i] - i);
            X2 = Math.min(X2, arr[i] - i);
            Y1 = Math.max(Y1, arr[i] + i);
            Y2 = Math.min(Y2, arr[i] + i);
            Max = Math.max(X1-X2, Y1-Y2);
        }
        return Max;
    } 
}


