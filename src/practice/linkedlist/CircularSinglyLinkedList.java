package practice.linkedlist;

public class CircularSinglyLinkedList {
	SingleNode head=null;
	SingleNode tail=null;
	

	
	void insert(int val) {
		SingleNode node = new SingleNode();
		node.setValue(val);
		
		if(head==null) {
			head = node;
			tail = node;
			tail.setNext(head);
		}else {			
			tail.setNext(node);
			tail = node;
			tail.setNext(head);
		}
	}
	
	void insertFront(int val) {
		SingleNode node = new SingleNode();
		node.setValue(val);
		
		if(head==null) {
			head = node;
			tail = node;
			tail.setNext(head);
		}else {
			node.setNext(head);
			head = node;
			tail.setNext(head);
		}
	}
	
	void traverse() {
		SingleNode temp = head;
		while(temp != tail) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
		System.out.println(temp.getValue());
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList obj = new CircularSinglyLinkedList();
		obj.insert(2);
		obj.insert(1);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);

		obj.traverse();
		obj.insertFront(89);
		obj.traverse();
		System.out.println(obj.tail.getNext().getValue() + "next value");
		System.out.println("head " + obj.head.getValue());
	}

}
