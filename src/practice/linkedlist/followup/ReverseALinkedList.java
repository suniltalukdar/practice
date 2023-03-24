package practice.linkedlist.followup;

import practice.linkedlist.SingleNode;
import practice.linkedlist.SinglyLinkedList;

public class ReverseALinkedList {

	//SingleNode head=null;

	void reverse(SingleNode head) {
		SingleNode prev=head, current=head;

		while(current.getNext() != null) {
			current = current.getNext();
			current.setNext(prev);
		}
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
		obj.insert(6);
		obj.insert(8);


		ReverseALinkedList o = new ReverseALinkedList();
		o.reverse(obj.head);
		o.traverse(obj.head);

	}

}
