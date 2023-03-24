package practice.hashing;

public class BasicHashingTest {
	static String[] hash = new String[5];
	public String[] storeString(String str) {
		
		int index = hashFunc(str.length());
		hash[index] = str;
		return hash;
	}
	
	private int hashFunc(int len) {
		int index = len%4;
		return index;
	}
	
	public static void main(String[] args) {
		BasicHashingTest obj = new BasicHashingTest();
		obj.storeString("sunil");
		obj.storeString("suni");
		obj.storeString("abcde");
		for(String s:hash) {
			System.out.println(s);
		}

	}

}
