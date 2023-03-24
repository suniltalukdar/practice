package practice.recur;

//Java program to generate power set 
import java.util.*; 

class GFGSet
{ 

	// str : Stores input string 
	// curr : Stores current subset 
	// index : Index in current subset, curr 
	static void powerSet(String str, int index, 
			String curr) 
	{ 
		int n = str.length(); 

		// base case 
		if (index == n) 
		{ 
			return; 
		} 
		System.out.println(curr); 
		System.out.println("before " + index); 
		for (int i = index + 1; i < n; i++) 
		{ 
			curr += str.charAt(i); 
			powerSet(str, i, curr); 
			curr = curr.substring(0, curr.length() - 1); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "abc"; 
		int index = -1; 
		String curr = ""; 
		powerSet(str, index, curr); 
	} 
} 

//This code is contributed by PrinciRaj1992 
