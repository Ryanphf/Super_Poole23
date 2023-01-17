

import pkg.SinglyLinkedList;

import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {

		SinglyLinkedList n = new SinglyLinkedList();
		n.insert(0,10);
		n.insert(1,11);
		n.insert(2,12);
		n.insert(3,13);
		n.insert(4,14);
		n.insert(5,16);
		n.insert(3,15);
		n.insert(0,8);
		n.insert(1,9);

		n.remove(2);

		n.printList();

		n.swap(0,3);

		n.printList();
	}
}
