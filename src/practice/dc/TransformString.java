package practice.dc;

public class TransformString {

	int transform(String strOne, String strTwo, int i1, int i2) {
		if(i1==strOne.length()) {
			return strTwo.length()-i2;
		}
		if(i2==strTwo.length()) {
			return strOne.length()-i1;
		}
		if(strOne.charAt(i1)==strTwo.charAt(i2)) {
			return transform(strOne, strTwo, i1+1, i2+1);
		}
			int insert = 1+transform(strOne, strTwo, i1+1, i2);
			int delete = 1+transform(strOne, strTwo, i1, i2+1);
			int replace = 1+ transform(strOne, strTwo, i1+1, i2+1);
			return Math.min(insert, Math.min(replace, delete));

	}
	public static void main(String[] args) {
		TransformString obj = new TransformString();
		int result = obj.transform("sunil", "xxx", 0, 0);
		System.out.println(result);

	}

}
