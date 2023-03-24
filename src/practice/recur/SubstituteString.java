package practice.recur;

import java.util.Arrays;
import java.util.Collections;

public class SubstituteString {
    
    public static int getTotalCount(String s1, String s2, int i, int j) {
	if(s1.length() == i) {
	    return s2.length()-j;
	}
	if(s2.length()==j) {
	    return s1.length()-i;
	}
	if(s1.charAt(i)==s2.charAt(j)) {
	    return getTotalCount(s1, s2, i+1, j+1);
	}else {
	    int a = 1+getTotalCount(s1, s2, i+1, j+1);
	    int b = 1+getTotalCount(s1, s2, i+1, j);
	    int c = 1+getTotalCount(s1, s2, i, j+1);
	    return Math.min(a, Math.min(c, b));
	}
	
    }
    
    static public int getCount(String s1, String s2) {
	for(int i=0; i<s1.length(); i++) {
	    for(int j=0;j<s2.length();j++) {
		 System.out.println(s2);
		if(s1.charAt(i)==s2.charAt(j)) {
		   
		    s2 = s2.replaceFirst(String.valueOf(s2.charAt(j)), "");
		    break;
		}
	    }
	}

	return s2==null?0:s2.length();
    }

    public static void main(String[] args) {
	String str = "abcaaa";
	int mid = str.length()/2;
	String s1 = str.substring(0, mid);
	String s2 = str.substring(mid);
	System.out.println(s1 + " ** " + s2);
    	int a = getTotalCount("abc", "aaa", 0, 0);
    	System.out.println(a);
    	
    	int b = getCount("xaxb", "bbxx");
    	System.out.println(b);
    	
    	int arr[]= {1,2,3,4,5};
    	
    	

    }

}
