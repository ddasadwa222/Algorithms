package Ch_1_4_Analysis_Of_Algorithms;

import edu.princeton.cs.algs4.StdOut;

/*
 * 思路 :
 * 
 * 我们使用 steque 负责 pushLeft 和 pushRight 以及 popLeft
 * 由于 popRight 操作需要将 steque 的所有元素倒入 stack 中，因此每次 popRight 时，假如 stack 为空，
 * 就把所有元素倒入 stack, 在 pushLeft, pushRight popLeft 时，每次都判断若 steque 为空，就将 stack 
 * 的所有元素倒入 steque 中 
 * 
 * 
 * 
 */
public class Practise_1_4_30 {
	static class Node<T> {
		T item;
		Node<T> next, prev;
		Node() {}
		Node(T item, Node<T> prev, Node<T> next) {
			this.item = item;
			this.prev = prev;
			this.next = next;
		}
		Node<T> insertAfter(T item) {
			Node<T> n = new Node<T>(item, this, next);
			if (next != null)
				next.prev = n;
			next = n;
			return n;
		}
		Node<T> insertBefore(T item) {
			Node<T> n = new Node<T>(item, prev, this);
			if (prev != null)
				prev.next = n;
			prev = n;
			return n;
		}
		T delete() {
			T del = item;
			item = null;
			if (next != null)
				next.prev = prev;
			if (prev != null)
				prev.next = next;
			return del;
		}
	}
	static class Stack<T> {
		private int size;
		private Node<T> header = new Node<T>();
		private Node<T> tailer = new Node<T>();
		{
			header.next = tailer;
			tailer.prev = header;
			header.prev = tailer.next = null;
		}
		boolean isEmpty() { return size == 0; }
		int size() { return size; }
		void push(T item) {
			size++;
			header.insertAfter(item);
		}
		T pop() {
			if (isEmpty())
				throw new RuntimeException("pop from a empty stack");
			size--;
			return header.next.delete();
		}
	}
	static class Steque<T> {
		private int size;
		private Node<T> header = new Node<T>();
		private Node<T> tailer = new Node<T>();
		{
			header.next = tailer;
			tailer.prev = header;
			header.prev = tailer.next = null;
		}
		boolean isEmpty() { return size == 0; }
		int size() { return size; }
		void push(T item) {
			size++;
			header.insertAfter(item);
		}
		T pop() {
			if (isEmpty())
				throw new RuntimeException("pop from a empty stack");
			size--;
			return header.next.delete();
		}
		void enqueue(T item) {
			size++;
			tailer.insertBefore(item);
		}
	}
	static class Deque<T> {
		private Steque<T> steque = new Steque<T>();
		private Stack<T> stack = new Stack<T>();
		void stequeAllToStack() {
			while (!steque.isEmpty())
				stack.push(steque.pop());
		}
		void stackAllToSteque() {
			while (!stack.isEmpty())
				steque.push(stack.pop());
		}
		void pushLeft(T item) {
			if (steque.isEmpty())
				stackAllToSteque();
			steque.push(item);
		}
		void pushRight(T item) {
			if (steque.isEmpty())
				stackAllToSteque();
			steque.enqueue(item);
		}
		T popLeft() {
			if (steque.isEmpty())
				stackAllToSteque();
			return steque.pop();
		}
		T popRight() {
			if (stack.isEmpty())
				stequeAllToStack();
			return stack.pop();
		}
	}
	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<Integer>();
		deque.pushLeft(1);
		deque.pushLeft(2);
		deque.pushLeft(3);
		deque.pushLeft(4);
		deque.pushLeft(5);
		deque.pushRight(6);
		deque.pushRight(7);
		StdOut.println(deque.popRight());
		StdOut.println(deque.popLeft());
		StdOut.println(deque.popRight());
		StdOut.println(deque.popLeft());
		StdOut.println(deque.popRight());
		StdOut.println(deque.popLeft());
		StdOut.println(deque.popRight());
	}
	// output
	/*
	 *  7
		5
		6
		4
		1
		3
		2

	 */
}
