package practice.recur;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class AllSubString {
	Set<String> set = new HashSet<String>();
	
	  void print(String str) {
	  
	  for(int j=0;j<str.length();j++) { 
	      String test = ""; 
	      for(int i=j;i<str.length();i++) {
		  test += str.charAt(i); 
		  System.out.println(test); 
		  }
	  } 
	  }
	 

	/*
	 * void recur(String str, int index, String test) { if(index==str.length()) {
	 * return; }else { for(int i=index+1;i<str.length();i++) {
	 * 
	 * test += str.charAt(i); System.out.println(test); set.add(test); recur(str,
	 * index+1, ""); } } }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubString obj = new AllSubString();
		obj.print("Sunil");
		//obj.recur("Sunil", -1, "");
		//System.out.println(obj.set);
	}

}
