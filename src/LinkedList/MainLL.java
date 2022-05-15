package LinkedList;

public class MainLL {

	public static void main(String[] args) {
		
		LinkedListInsertion list = new LinkedListInsertion();
		list.head = new Node(2);
		list.head.next = new Node(3);
		list.head.next.next = new Node(4);
		System.out.println("Initial list:");
		list.printLinkedList();
		list.insertAtBeginning(1);
		System.out.println("List after inserting a new node at beginning:");
		list.printLinkedList();
		list.insertAtEnd(6);
		System.out.println("List after inserting a new node at end:");
		list.printLinkedList();
		list.insertInBetween(4, 5);
		System.out.println("List after inserting a new node in between:");
		list.printLinkedList();
		
	}
}
