package practice.misc;

public class PowerSet {

	void generateSet(String str) {
		generateSetHelper(str,-1, "");
	}

	private void generateSetHelper(String str,int index, String string) {

		int n = str.length();
		if(index == n) {
			return;
		}else {
			for(int i=index+1;i<n;i++) {
				char ch = str.charAt(i);
				string += ch;
				generateSetHelper(str, i, string);
				string = string.substring(0, string.length()-1);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerSet obj = new PowerSet();
		obj.generateSet("abc");
	}

}
