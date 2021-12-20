package com.bridgelabz.linkedlist;

public class AddedLinkedList {
	Node head;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("Empty Linked List");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		AddedLinkedList node = new AddedLinkedList();
		node.addNode(70);
		node.addNode(30);
		node.addNode(56);
		
		node.display();
	}
}


