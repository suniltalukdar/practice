package practice.linkedlist;

public class DoublyLinkedList {

	DoublyNode head=null;
	DoublyNode tail=null;

	void insertAtBegin(int value) {
		DoublyNode temp = new DoublyNode();		
		temp.data = value;

		if(head==null) {
			head = temp;
			tail = temp;
			temp.next = null;
			temp.prev = null;
		}else {
			temp.next  = head;
			head.prev  = temp;
			head = temp;
		}
	}
	
	void insertAtEnd(int value) {
		DoublyNode temp = new DoublyNode();		
		temp.data = value;

		if(head==null) {
			head = temp;
			temp.next = null;
			temp.prev = null;
		}else {
			DoublyNode runner = new DoublyNode();	
			runner = head;
			
			while(runner.next != null) {
				runner = runner.next;
			}			
			runner.next = temp;
			temp.prev = runner;
			temp.next = null;			
		}
	}
	
	 void insertAtGivenPosition(int value, int pos) {
		 DoublyNode temp = new DoublyNode();
		 temp.data = value;
		 DoublyNode current = head;
		 int count = 0;
		 
		 while(count != pos-1) {
			 current = current.next;
			 count++;
		 }
		 
		 temp.next = current.next;
		 current.next = temp;
		 temp.next.prev = temp;
		 temp.prev = current;
		 
		// System.out.println(temp.next.data + " prev");
	 }

	void traverse() {
		DoublyNode temp = head;

		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" ");
	}

	void reverseTraversal() {
		DoublyNode curr = head;
		
		while(curr.next !=null) {
			curr = curr.next;
		}
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.prev;
		}
	}
	
	void deleteHead() {
		if(head != null) {
			head = head.next;
			head.prev = null;
		}else {
			System.out.println("Empty List");
		}
	}
	
	void deleteLastNode() {
		DoublyNode temp = head;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		temp.next.prev = null;
		temp.next = null;
	}
	
	void deleteSpecificValue(int val) {
		DoublyNode temp = head;
		
		if(head.data == val) {
			deleteHead();
		}else {
			while(temp != null && temp.data != val) {
				temp = temp.next;
			}
			
			if(temp != null) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				temp.next = null;
				temp.prev = null;
			}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList obj = new DoublyLinkedList();

		obj.insertAtBegin(2);
		obj.insertAtBegin(6);
		obj.insertAtBegin(1);
		System.out.println(obj.head.data + " head");
		System.out.println("Insert Begining");
		obj.traverse();
		
		obj.insertAtEnd(9);
		obj.insertAtEnd(10);
		obj.insertAtEnd(8);
		System.out.println("Insert End");
		obj.traverse();
		
		System.out.println("Insert position");
		obj.insertAtGivenPosition(89, 1);
		obj.traverse();
		
		System.out.println("Reverse Traversal");
		obj.reverseTraversal();
		System.out.println();
		obj.traverse();
		System.out.println("Delete Head");
		obj.deleteHead();
		obj.traverse();

		System.out.println("Delete Last");
		obj.deleteLastNode();
		obj.traverse();
		obj.reverseTraversal();
		System.out.println();
		System.out.println("Delete value");
		obj.deleteSpecificValue(2);
		obj.traverse();
		obj.reverseTraversal();
	}

}
