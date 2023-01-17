

import pkg.*;
import pkg.Stack;

import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		Stack stack = new Stack();

		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);

		stack.DisplayStack(stack);

		System.out.println();
		System.out.println(stack.peek());

		stack.pop();

		System.out.println();

		System.out.println(stack.peek());

		System.out.println();

		stack.push(14);

		stack.DisplayStack(stack);
	}
}
