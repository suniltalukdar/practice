package practice.recur;

public class ReverseString {

	static void reverseStringHelper(String str, String reversed) {

		if (str.isEmpty()) {
			 System.out.println(reversed.toCharArray());
			return;
		} else {			
			char ch = str.charAt(str.length()-1);
			String temp = str.substring(0, str.length()-1);

			reversed = reversed.concat(String.valueOf(ch));
			reverseStringHelper(temp, reversed);

		}
	}

	void reverseString(String str) {
		reverseStringHelper(str, "");
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseString("sunil");
		Character[] test= {'a','b', 'c'};
		System.out.println(test);

	}

}
