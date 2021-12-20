package com.bridgelabz.linkedlist;

public class AppendLinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void appNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {

		} else {

			tail.next = newNode;

			tail = tail.next;
		}
	}

	
	public void display() {
		
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		AppendLinkedList node = new AppendLinkedList();
		node.appNode(56);
		node.appNode(30);
		node.appNode(70);

		node.display();
	}
}


