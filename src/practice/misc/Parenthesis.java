package practice.misc;
/**
 * Need to solve it
 * Not giving correct output
 * @author lenovo
 *
 */
public class Parenthesis {

	static void printCombo(int n, int open, int close, String str) {
		if(close==n) {
			System.out.println(str);
			return;
		}else {
			if(close<open) {
				str += "}";
				
				printCombo(n, open, close+1, str);
				//System.out.println(" } added " + open + " op -cl " + close + " " + str);
				str = str.substring(0, str.length()-1);
			}
			
			if(open<n) {
				str += "{";
				
				printCombo(n, open+1, close, str);
			//	System.out.println(" { added "+ open + " op -cl " + close + " " + str);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		printCombo(3, 0, 0, "");
	}

}
