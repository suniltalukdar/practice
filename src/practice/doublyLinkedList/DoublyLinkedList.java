package practice.doublyLinkedList;

class Node{

    int data;
    Node prev;
    Node next;
    public Node(int data) {
	this.data = data;
	this.prev=null;
	this.next=null;
    }
}

public class DoublyLinkedList {

    public void insert(Node head, int data) {
	Node temp = new Node(data);
	if(head == null) {
	    head = temp;
	}else {
	    while(head.next != null) {
		head = head.next;
	    }
	    head.next = temp;
	    temp.prev = head;
	}
    }
    
    public void traverse(Node head) {
	if(head==null) {
	    System.out.println("Empty List");
	}else {
	    while(head!=null) {
		System.out.println(head.data);
		head = head.next;
	    }
	}
    }
    
    public static void main(String[] args) {
	Node head = new Node(1);
	DoublyLinkedList obj = new DoublyLinkedList();
	obj.insert(head, 2);
	obj.insert(head, 3);
	obj.insert(head, 4);
	obj.insert(head, 6);
	obj.traverse(head);
    }

}
