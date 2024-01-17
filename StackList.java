package linkedList;

/**
 * File:    	StackList.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This class is an implementation of a stack datastructure using a LinkedList
 */
public class StackList implements Stack {
	private LinkedList list;
	
	/**
	 * This constructor makes an empty StackList
	 */
	public StackList() {
		list = new LinkedList();
	}
	
	/**
	 * This method checks if the stack is empty
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * This method adds an item to the stack
	 */
	public Object push(Object element) {
		list.addFront(element);
		return null;
	}

	/**
	 * This method pops an item from the stack
	 */
	public Object pop() {
		return list.getFront();
	}

	/**
	 * This method returns the item that will be popped next without removing it from the stack
	 */
	public Object peek() {
		Object front = list.getFront();
		list.addFront(front);
		return front;
	}

	/**
	 * This method returns the index of a given element, or returns -1 if no element is found
	 */
	public int search(Object element) {
		StackList storedElements = new StackList();
		int index = -1;
		Object current = null;
		
		// searches through the stack by comparing an item then moving it to a temporary stack
		while (!this.isEmpty() && !element.equals(current)) {
			current = this.pop();
			storedElements.push(current);
			index += 1;
		}
		
		// if the original stack is empty and there's no match, no element was found
		if (this.isEmpty() && !element.equals(current)) {
			index = -1;
		}
		
		// return all of the elements in storage back to the original stack
		while (!storedElements.isEmpty()) {
			this.push(storedElements.pop());
		}
		
		return index;
	}
	
	/**
	 * This method returns a string representation of the stack
	 */
	public String toString() {
		return list.toString();
	}
}