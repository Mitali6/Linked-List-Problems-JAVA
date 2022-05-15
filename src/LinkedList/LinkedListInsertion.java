package LinkedList;

public class LinkedListInsertion {
	
	Node head;
	
	public LinkedListInsertion() {
		head = null; 
	}
	
	public void printLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void insertAtBeginning(int key) {
		Node temp = new Node(key);
		temp.next = head;
		head = temp;
	}

	public void insertAtEnd(int key) {
		Node temp = head;
		if(temp != null) {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(key);
		} else {
			head = new Node(key);
		}
	}

	public void insertInBetween(int insertAfterKey, int key) {
		Node temp = head;
		if(head == null) {
			System.out.println("Node can't be inserted as Linked List is empty");
		} else {
			while(temp != null && temp.data != insertAfterKey) {
				temp = temp.next;
			}
			if(temp != null) {
				Node newNode = new Node(key);
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.out.println("Node doesn't exist");
			}
		}
	}

}
