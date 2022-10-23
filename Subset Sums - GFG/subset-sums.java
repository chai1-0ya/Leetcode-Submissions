//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    public void sum(ArrayList<Integer> arr, int i, int sum, ArrayList<Integer> l){
        if(i>=arr.size()){
            l.add(sum);
            return;
        }
        sum += arr.get(i);
        sum(arr, i+1, sum, l);
        sum -= arr.get(i);
        sum(arr, i+1, sum, l);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> l = new ArrayList<>();
        sum(arr, 0, 0, l);
        Collections.sort(l);
        return l;
    }
}