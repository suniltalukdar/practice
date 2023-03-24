package practice.recur;

public class NoLoopSet {
	
	static void  generateSet(String str, String set, int index) {
		
		if(str.length()==0) {
			System.out.println(set);
			return;
		}else {
		
			
			//index++;
			String ros = str.substring(1);
			generateSet(ros, set, index);
			
			set = set+str.charAt(0);
			generateSet(ros, set, index);
			set.substring(0, set.length()-1);
			
			
			

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateSet("abc", "", 0);

	}

}
