package practice.recur;

import java.util.ArrayList;
import java.util.List;
/**
 * String s=list.get(list.size()-1);
			list.remove(list.size()-1);
			choosen.add(s);
			sublistPrinter(list,  choosen);
			choosen.remove(s);
			
			sublistPrinter(list,  choosen);
			list.add(list.size(), s);
 * @author lenovo
 *
 */
public class SubLists {

	static void sublistPrinter(List<String> list, List<String> choosen) {
		if(list.isEmpty()) {
			System.out.println(choosen);
			return;
		}else {

			String s=list.get(0);
			list.remove(0);
			choosen.add(s);
			sublistPrinter(list,  choosen);
			choosen.remove(s);
			sublistPrinter(list,  choosen);
			list.add(0, s);
			
		}
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		sublistPrinter(list, new ArrayList<String>());

	}

}
