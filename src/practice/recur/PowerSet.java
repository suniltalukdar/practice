package practice.recur;

public class PowerSet {
	
	/*
	 * static void subSetHelper(String str, int index, String sub) {
	 * if(str.length()==index) { return; }else { System.out.println(sub); for(int
	 * i=index+1;i<str.length();i++) { char ch = str.charAt(i); //str =
	 * str.substring(i+1); sub +=ch; subSetHelper(str,i , sub);
	 * 
	 * sub = sub.substring(0, sub.length()-1);
	 * 
	 * } } }
	 */
	
	static void subSetHelper(String str, int index, String sub) {
		
		if(str.isEmpty()) {
			System.out.println( sub);
			return;
		}else {
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				str = str.substring(i+1);
				//System.out.println(i + " " + str);
				sub = sub +ch;				
				subSetHelper(str,i , sub);
				sub = sub.substring(0, sub.length()-1);
			
			}
		}
	}

	public static void main(String[] args) {
		subSetHelper("abc",-1, "");

	}

}
