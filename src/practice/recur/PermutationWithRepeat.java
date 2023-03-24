package practice.recur;

public class PermutationWithRepeat {

    static void printAll(String str, String result) {
	if(str.length()==0) {
	    System.out.println(result);
	    return;
	}
	
	for(int i=0;i<str.length();i++) {
	    result = result+ str.charAt(i);
	    String ros = str.substring(0,i)+str.substring(i+1);
	    printAll(ros, result);
	    result = result.substring(0, result.length()-1);
	}
    }
    public static void main(String[] args) {
	printAll("aba", "");
    }

}
