package practice.recur;

public class SetString {

	static void printSet(String str,int index, String set) {
		if(str.length()==index) {
			return;
		}else {
			System.out.println(set);
			for(int i=index+1;i<str.length();i++) {
				char ch = str.charAt(i);
				set = set+ch;
				printSet(str, i, set);
				set = set.substring(0, set.length()-1);
			}
		}
	}

	public static void setOfString(String str) {
		printSet(str,-1, "");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setOfString("abcd");
	}

}
