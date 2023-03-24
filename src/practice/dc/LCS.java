package practice.dc;

public class LCS {
	
	int getLCS(String s1, String s2, int i1, int i2) {
		
		if(s1.length()==i1 || s2.length()==i2) {
			return 0;
		}	
		int a=0;
		if(s1.charAt(i1)==s2.charAt(i2)) {
			a = 1+getLCS(s1, s2, i1+1, i2+1);
		}
		int b = getLCS(s1, s2, i1+1, i2);
		int c = getLCS(s1, s2, i1, i2+1);
		return Math.max(a, Math.max(c, b));
	}
	public static void main(String[] args) {
		LCS obj = new LCS();
		int a = obj.getLCS("abcd", "xaczb", 0, 0);
		System.out.println(a);

	}

}
