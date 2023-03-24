package practice.dsa.sec;

public class ReverseString {

	static String reverse(String str) {
		if(str !=null) {
			String temp = new String();
			for(int i=str.length()-1;i>=0;i--) {
				temp += str.charAt(i);
			}
			return temp;
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("sunil"));
		StringBuilder sb = new StringBuilder();
		sb.reverse();
	}

}
