package practice.linkedlist.followup;

import practice.linkedlist.SingleNode;
import practice.linkedlist.SinglyLinkedList;

public class NthNodeFromEnd {
	
	
	public void deleteNthNode(int n, SingleNode head) {
		
		int count=0;
		SingleNode temp = head;
		while(temp != null) {
			count++;
			temp = temp.getNext();
		}
		
		int del = (count -n-1);
		int val=0;
		temp = head;
		while(val != del) {
			val++;
			temp = temp.getNext();
		}
		System.out.println(val + " " + del);
		temp.setNext(temp.getNext().getNext());
	}
	
	void traverse(SingleNode head) {
		SingleNode temp = head;		
		while(temp !=null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		
		NthNodeFromEnd ob = new NthNodeFromEnd();
		ob.deleteNthNode(7, obj.head);
		ob.traverse(obj.head);

	}

}
