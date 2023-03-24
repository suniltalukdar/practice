package practice.recur;

public class MyNameCombo {


	/*
	 * public void printNameCombo(String name) { printNameComboHelper(name, ""); }
	 * 
	 * private void printNameComboHelper(String name,String combo) {
	 * if(name.isEmpty()) { System.out.println(combo); }else { for(int
	 * i=0;i<name.length();i++) { combo =
	 * combo.concat(String.valueOf(name.charAt(i))); name = name.substring(i);
	 * printNameComboHelper(name, combo); combo =
	 * combo.substring(0,combo.length()-1); } } }
	 */

	static void indent(int i) {
		for(int j=0;j<i;j++)
			System.out.print(" ");
	}

	static void printPermutn(String str, String ans) 
	{ 
		if (str.length() == 0) { 
			System.out.println(ans ); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 
			char ch = str.charAt(i); 
			String ros = str.substring(0, i) +  
					str.substring(i + 1); 
			ans = ans+ch;
			printPermutn(ros, ans); 
			ans = ans.substring(0,ans.length()-1); 
		} 
	} 

	public static void main(String[] args) {
		MyNameCombo obj = new MyNameCombo();
		printPermutn("sunil", ""); 
	}

}
