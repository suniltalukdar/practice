package practice.recur;

public class AllSubSetOfSet {
	
	static void generateSet(String str,int index, String set) {
		
		if(index==str.length()) {
			System.out.println(set); 
			return;
		}else {			
			generateSet(str, index+1, set);
			generateSet(str, index+1, set+str.charAt(index));
		}
	}

	public static void main(String[] args) {
		generateSet("abc", 0, "");

	}

}
