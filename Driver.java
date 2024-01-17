package linkedList;

/**
 * File:    	Driver.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This class tests the StackList and QueueList classes by adding
 *              terms to them and printing them.
 */
public class Driver {
	/**
	 * This is the main method that tests the StackList and QueueList classes.
	 */
	public static void main(String[] a11) {
		StackList stackList = new StackList();
		QueueList queueList = new QueueList();
		
		stackList.push("Bill");
		stackList.push("Fred");
		stackList.push("Joe");
		stackList.push("Henrietta");
		stackList.push("Mr. M");
		stackList.push("Noman");
		
		queueList.enqueue("Bill");
		queueList.enqueue("Fred");
		queueList.enqueue("Joe");
		queueList.enqueue("Henrietta");
		queueList.enqueue("Mr. M");
		queueList.enqueue("Noman");
		
		System.out.println(stackList.toString());
		System.out.println(queueList.toString());
	}
}
