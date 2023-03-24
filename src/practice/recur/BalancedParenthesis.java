package practice.recur;

public class BalancedParenthesis {

    static void printBrackets(int open, int closed, int total, String str) {

	if(closed == total) {
	    System.out.println(str);
	    
	}else {

	    if(open<total) {
		str += "(";
		open++;
		printBrackets(open, closed, total, str);
	    }

	    if(closed<open) {
		str += ")";
		closed++;
		printBrackets(open, closed, total, str);
	    }
	}
    }

    public static void main(String[] args) {
	printBrackets(0, 0, 2, new String());
    }

}
