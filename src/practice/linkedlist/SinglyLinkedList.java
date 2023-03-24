package practice.linkedlist;

public class SinglyLinkedList {

	public SingleNode head = null;
	SingleNode tail = null;

	public void insert(Integer value) {
		SingleNode node = getNode(value);

		if(tail==null) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			tail = tail.getNext();
		}
	}

	void insertStart(Integer value) {
		SingleNode node = getNode(value);

		if(head==null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			head = node;
		}
	}

	void insertPosition(int value, int pos) {
		if(head==null) {
			System.out.println("Empty List");
		}else {
			int count=0;
			SingleNode node = getNode(value);
			SingleNode temp=head;

			while(count<pos-1) {
				temp = temp.getNext();
				count++;
			} 
			
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}
	
	void searchNode(int val) {
		SingleNode temp = head;
		int pos = 0;
		if(temp == null) {
			System.out.println("Empty List");
		}else {
			while(temp != null) {
				pos++;
				if(temp.getValue() == val) {
					System.out.println("value " + temp.getValue() + " position " + pos);
					break;
				}
				temp = temp.getNext();
			}
			
			if(temp==null) {
				System.out.println("Not Found");
			}
		}
	}

	private SingleNode getNode(Integer value) {
		return new SingleNode(value, null);
	}

	void traverse(){
		if(head==null) {
			System.out.println("Empty List");
		}else {
			SingleNode temp= head;

			while(temp != null) {
				System.out.println(temp.getValue());
				temp = temp.getNext();
			}
		//	System.out.println(head.getValue() + " Head " + tail.getValue() +  " Tail");
		}
	}

	void deleteHead() {
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			head = head.getNext();
		}
	}
	
	void deleteValue(int value) {
		if(head == null) {
			System.out.println("Empty List");
		}else {
			SingleNode temp = head;
			
			while(temp.getNext() != null) {
				
				if(temp.getNext().getValue() == value) {
					temp.setNext(temp.getNext().getNext());
					break;
				}
				
				temp = temp.getNext();
			}
			
		}
	}
	
	void deleteTail() {
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			SingleNode temp = head;
			
			while(temp.getNext() != tail) {
				temp = temp.getNext();
			}
			
			temp.setNext(null);
			tail = temp;
			
			System.out.println(tail.getValue() + " " + tail.getNext());
		}
	}
	
	SingleNode getLast(SingleNode head) {
		
		SingleNode runner=head;
		
		while(runner.getNext()!=null && runner.getNext().getNext() != null) {
			runner=runner.getNext();
		}
		SingleNode temp = runner.getNext();
		runner.setNext(null);
		return temp;
	}
	
	void reverse(SingleNode head) {
		SingleNode head2=null;
		SingleNode current=null;
		while(head.getNext()!=null) {
			SingleNode temp = getLast(head);
			if(head2==null) {
				current=temp;
				head2=current;
			}else {
				current.setNext(temp);
				current=current.getNext();
			}
		}
		current.setNext(head);
		
		head=head2;           
		System.out.println("reversed list");
		traverseReversedList(head2);
	}
	
	void traverseReversedList(SingleNode head) {
		while(head!=null) {
			System.out.print(head.getValue()+" ");
			head=head.getNext();
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList obj = new SinglyLinkedList();

		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
//		obj.traverse();
//
//		obj.insertStart(18);
//		obj.traverse();
//		
//		obj.insertPosition(89, 2);
//		obj.traverse();
//		obj.insertPosition(10, 4);
//		obj.traverse();
//		
//		obj.searchNode(18);
//		
//		//obj.deleteHead();
//		//obj.traverse();
//		
//		//obj.deleteTail();
//		//obj.traverse();
//		
//		obj.deleteValue(89);
		System.out.println("before");
		obj.traverse();
		
		obj.reverse(obj.head);
	}
}
