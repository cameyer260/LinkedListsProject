package linkedList;

/**
 * File:    	QueueList.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This class is an implementation of a queue datastructure using a LinkedList
 */
public class QueueList implements Queue {
	private LinkedList list;
	
	/**
	 * This constructor makes an empty QueueList
	 */
	public QueueList() {
		list = new LinkedList();
	}
	
	/**
	 * This method checks if the queue is empty
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * This method dequeues an item from the queue and returns it
	 */
	public Object dequeue() {
		return list.getFront();
	}

	/**
	 * This method enqueues an item to the end of the queue
	 */
	public Object enqueue(Object element) {
		list.addBack(element);
		return null;
	}

	/**
	 * This method returns but does not remove the last item in the queue
	 */
	public Object getBack() {
		Object back = list.getBack();
		list.addBack(back);
		return back;
	}

	/**
	 * This method returns but does not remove the next item in the queue
	 */
	public Object getFront() {
		Object front = list.getFront();
		list.addFront(front);
		return front;
	}
	
	/**
	 * This method returns a string representation of the queue
	 */
	public String toString() {
		return list.toString();
	}
}
