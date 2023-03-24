package practice.linkedlist.followup;

import practice.linkedlist.SingleNode;
import practice.linkedlist.SinglyLinkedList;

public class SortedListMerge {

	SingleNode mergeList(SingleNode head1, SingleNode head2) {
		SingleNode prev = head1;
		SingleNode next = head2;
		SingleNode temp1 = head1;
		SingleNode temp2 = head2;
		while(temp1.getNext() != null) {
			System.out.println("temp1 "+temp1.getValue());
			if(temp1.getValue()>temp2.getValue()) {
				next = temp2.getNext();
				temp2.setNext(temp1);
				prev.setNext(temp2);
				temp2 = next;
			}else {
			prev = temp1;
			temp1 = temp1.getNext();
			}
		}
		
		return head1;
	}
	public static void main(String[] args) {
		SortedListMerge t = new SortedListMerge();
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.insert(1);
		obj.insert(4);
		obj.insert(7);
		
		SinglyLinkedList obj1 = new SinglyLinkedList();
		obj1.insert(2);
		obj1.insert(3);
		obj1.insert(8);
		
		SingleNode test = t.mergeList(obj.head, obj1.head);
		
		while(test != null) {
			System.out.println(test.getValue());
			test = test.getNext();
		}

	}

}
