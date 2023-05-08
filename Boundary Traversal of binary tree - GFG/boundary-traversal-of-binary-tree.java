//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    
    boolean isleaf(Node root){
		if(root.left==null && root.right==null)
			return true;
		return false;
	}
    
     void left(Node cur, ArrayList<Integer> ans){
         Node root =cur;
		while(root != null){
			if(!isleaf(root))
				ans.add(root.data);
			if(root.left != null)
				root = root.left;
			else
				root = root.right;
		}
	}

	 void leaf(Node root, ArrayList<Integer> ans){
		if(isleaf(root)){
			ans.add(root.data);
			return;
		}
		if(root.left != null)
			leaf(root.left, ans);
		if(root.right != null)
			leaf(root.right, ans);
	}

	 void right(Node curr, ArrayList<Integer> ans){
	     Node root = curr;
		List<Integer> ls = new ArrayList<>();
		while(root != null){
			if(!isleaf(root))
				ls.add(root.data);
			if(root.right != null)
				root = root.right;
			else root = root.left;
		}
		// for(int i=0;i<ls.size();++i){
		// 	ans.add(ls.get(i));
		// }
		for(int i=ls.size()-1;i>=0;--i){
			ans.add(ls.get(i));
		}
	}
    
    
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
		if(root == null)
			return ans;
		if(!isleaf(root))
			ans.add(root.data);
		left(root.left, ans);
		leaf(root, ans);
		right(root.right, ans);
		return ans;
	}
}
