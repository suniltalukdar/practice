package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class SetFirstTry {
	List<List<Integer>> set = new ArrayList<List<Integer>>();
//List<Integer> list = new ArrayList<Integer>();

	/*
	 * public void setGenerate(Integer[] arr, int index) { List<Integer> list = new
	 * ArrayList<Integer>(); if(index==arr.length) { return; }else {
	 * list.add(arr[index]); index++; setGenerate(arr, index); set.add(list);
	 * System.out.println("set " + set); } }
	 */
	List<Integer> list = new ArrayList<Integer>();

	/*
	 * public void setGenerate(Integer[] arr, int index, int currentIndex) {
	 * 
	 * if(index==arr.length-1) { return; }else { if(currentIndex<arr.length) {
	 * list.add(arr[currentIndex]); currentIndex++; setGenerate( arr,index,
	 * currentIndex); set.add(list); System.out.println("list" + list); }else {
	 * index++; setGenerate( arr,index, index); list.add(arr[index]); set.add(list);
	 * } System.out.println("set" + set); } }
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/*
	 * public void setGenerate(Integer[] arr, int index, int currentIndex) {
	 * 
	 * if(index==arr.length-1) { Integer i= arr[index]; List<Integer> newList = new
	 * ArrayList<Integer>(); newList.add(i); set.add(newList);
	 * System.out.println("set" + set); return; }else { if(currentIndex<arr.length)
	 * { List<Integer> newList = new ArrayList<Integer>();
	 *//**
		 * This I need to convert to recursion and it is not complete
		 *//*
			 * for(int i=index; i<=currentIndex; i++) { newList.add(arr[i]); }
			 * if((currentIndex-index)>=2) { //System.out.println(index + "**" +
			 * currentIndex + "----" + (currentIndex-index)); List<Integer> sub = new
			 * ArrayList<Integer>(); sub.add(arr[index]); sub.add(arr[currentIndex]);
			 * set.add(sub); } set.add(newList); currentIndex++; setGenerate( arr,index,
			 * currentIndex);
			 * 
			 * //System.out.println(set); //System.out.println(currentIndex + "currentIndex"
			 * + "index" + index); }else { index++; setGenerate( arr,index, index); } } }
			 */
	public static void main(String[] args) {
		SetFirstTry obj = new SetFirstTry();
		//obj.setGenerate(new Integer[] { 1, 2, 3, 4 }, 0, 0);
		/*
		 * obj.setGenerate(new Integer[] {1,2,3, 4}, 0, 0); obj.setGenerate(new
		 * Integer[] {1}, 0, 0);
		 */
	}

}
