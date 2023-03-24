package practice.linkedlist.followup;

import practice.linkedlist.SingleNode;
import practice.linkedlist.SinglyLinkedList;

public class RemoveDuplicates {

	public void removeNodes(SingleNode head) {
		
		SingleNode temp = head;
		SingleNode curr=temp;

		while(temp != null) {
			while(curr.getNext() != null) {
				if(curr.getNext().getValue() == temp.getValue()) {
					curr.setNext(curr.getNext().getNext());				
				}else {
				curr = curr.getNext();
				}
			}
			temp = temp.getNext();
			curr = temp;
		}
	}

	void traverse(SingleNode head) {
		SingleNode curr = head;
		while(curr!=null) {
			System.out.println(curr.getValue());
			curr = curr.getNext();
		}
	}
	public static void main(String[] args) {

		SinglyLinkedList obj = new SinglyLinkedList();
		obj.insert(2);
		obj.insert(2);
		obj.insert(6);
		obj.insert(1);
		obj.insert(1);
		obj.insert(2);
		obj.insert(2);
		obj.insert(3);
		obj.insert(3);
		obj.insert(1);
		obj.insert(4);
		RemoveDuplicates o = new RemoveDuplicates();
		o.removeNodes(obj.head);
		
		o.traverse(obj.head);

	}

}
