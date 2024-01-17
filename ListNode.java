package linkedList;

/**
 * File:    	ListNode.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This class has a reference to another ListNode, and a piece of data.
 *              It is used for storing data in a LinkedList data structure.
 */
public class ListNode {
	private Object   element;
	private ListNode next;
	
	/**
	 * This constructor makes a ListNode with a specified element and next node
	 */
	public ListNode(Object element, ListNode next) {
		this.element = element;
		this.next    = next;
	}
	
	/**
	 * This method returns the next ListNode
	 */
	public ListNode getNext() {
		return next;
	}
	
	/**
	 * This method sets the next ListNode to the inputted ListNode
	 */
	public void setNext(ListNode node) {
		this.next = node;
	}
	
	/**
	 * This method returns this ListNode's element
	 */
	public Object getElement() {
		return element;
	}
	
	/**
	 * This method sets this ListNode's element to the inputted Object
	 */
	public void setElement(Object element) {
		this.element = element;
	}
}
