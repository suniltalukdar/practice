package practice.linkedlist;

import java.io.ObjectInputStream.GetField;

public class SingleNode {

	private Integer value;
	private SingleNode next;
	
	public SingleNode() {
		
	}
	
	public SingleNode(Integer value, SingleNode node) {
		this.value = value;
		this.next = node;
	}

	public Integer getValue() {
		return value;
	}

	public SingleNode getNext() {
		return next;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public void setNext(SingleNode node) {
		this.next = node;
	}
	
	
	
	
}
