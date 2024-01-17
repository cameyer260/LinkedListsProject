package linkedList;

/**
 * File:    	LinkedList.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This class is an implementation of a linked list data structure
 *              that also provides multiple methods for adding items to the list.
 */
public class LinkedList{
	private ListNode start;
	
	/**
	 * This constructor makes an empty linked list
	 */
	public LinkedList() {
		start = null;
	}
	
	/**
	 * Checks if the list is empty by checking that the starting node is a null pointer
	 */
	public boolean isEmpty() {
		return start == null;
	}
	
	/**
	 * Returns and removes the element value of the first node.
	 * Returns null if there is no first element.
	 */
	public Object getFront() {
		if (start == null) {
			return null;
		}
		
		Object temp = start.getElement();
		
		start = start.getNext();
		
		return temp;
	}
	
	/**
	 * Returns and removes the element value of the last node, or returns
	 * null if the list is empty.
	 */
	public Object getBack() {
		if (start == null) {
			return null;
		}
		
		ListNode current = start;
		ListNode last = null;
		
		while (current.getNext() != null) {
			last = current;
			current = current.getNext();
		}
		
		Object lastElement = current.getElement();
		
		if (last != null) {
			last.setNext(null);
		} else {
			start = null;
		}
		
		return lastElement;
	}
	
	/**
	 * Adds an object to the front of the linked list
	 */
	public void addFront(Object element) {
		start = new ListNode(element, start);
	}
	
	/**
	 * Adds an object to the back of the linked list
	 */
	public void addBack(Object element) {
		if (start != null) {
			ListNode current = start;
			
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(new ListNode(element, null));
		} else {
			start = new ListNode(element, null);
		}
	}
	
	/**
	 * Returns a string representation of the linked list, representing
	 * "links" as arrows
	 */
	public String toString() {
		ListNode current = start;
		String temp = "";
		
		while (current != null) {
			Object currentElement = current.getElement();
			
			temp += currentElement;
			
			if (current.getNext() != null) {
				temp += "->";
			}
			current = current.getNext();
			
		}
		return temp;
	}
}