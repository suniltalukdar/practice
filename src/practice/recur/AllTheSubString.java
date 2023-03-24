package practice.recur;

public class AllTheSubString {

	/*
	 * static void printAllSubstring(String str, String subString, int index, int
	 * lastIndex) { //System.out.println(lastIndex + "last index" + str.length() +
	 * "index"+ index); if(lastIndex==str.length() || index==str.length()) { //
	 * System.out.println(subString); return; }else {
	 * 
	 * for(int i=index;i<str.length();i++) { subString =
	 * str.substring(index,lastIndex);
	 * 
	 * lastIndex++; printAllSubstring(str, subString, i, lastIndex);
	 * System.out.println(subString); lastIndex = index; str =
	 * str.substring(index+1); } } }
	 * 
	 */
	/*
	 * static void printAllSubstring(String str, String subString, int index, int
	 * lastIndex) { //System.out.println(lastIndex + "last index" + str.length() +
	 * "index"+ index); //System.out.println("base*** " + str.charAt(index));
	 * System.out.println("index " + index); System.out.println("str " + str);
	 * if(lastIndex>str.length()) { // System.out.println(subString); return; }else
	 * if(index>str.length()){ return; } else { subString =
	 * str.substring(index,lastIndex); lastIndex++; printAllSubstring(str,
	 * subString, index, lastIndex); //System.out.println(subString); index++; str =
	 * str.substring(index); lastIndex = index; printAllSubstring(str, subString,
	 * index, lastIndex);
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printAllSubstring("abcd", "", 0, 0);
	}

}
