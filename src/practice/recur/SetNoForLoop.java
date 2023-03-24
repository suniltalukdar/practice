package practice.recur;

public class SetNoForLoop {

	static void setPrintHelper(String str, String choosen) {
		if(str.isEmpty()) {
			System.out.println(choosen);
			return;
		}else {
			//choose
			char ch = str.charAt(0);
			String temp = str.substring(1);
			//System.out.println(temp);
			//explore
			//no
			setPrintHelper(temp, choosen);
			//yes
			choosen += ch;
			setPrintHelper(temp, choosen);
			
			//unchoose
			choosen.substring(0, choosen.length()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setPrintHelper("abc", "");
	}

}
