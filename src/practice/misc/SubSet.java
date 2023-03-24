package practice.misc;

import java.util.List;

public class SubSet {

   static void printSubSet(String str,String set, int index) {
      
	if(index==str.length()) {
	    System.out.println(set);
	    return;
	}else {	    
	    printSubSet(str, set+str.charAt(index), index+1);
	    printSubSet(str, set, index+1);
	  
	    
	}
    }
    
    public static void main(String[] args) {
	printSubSet("abc", "", 0);
    }

}
