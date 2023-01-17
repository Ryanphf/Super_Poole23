

import pkg.Node;

import java.lang.*;
import java.util.ArrayList;

class main {
	public static void main(String args[]) {
		/*
			Create an ArrayList of 100 Nodes
			Store random integers in each of them
			Print out all of the values
		*/

		ArrayList<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < 100; i++) {
			Node t = new Node((int)(Math.random()*10));
			nodes.add(t);
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(nodes.get(i).getData());
		}

	}
}
