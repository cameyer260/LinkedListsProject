package linkedList;

/**
 * File:    	Queue.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This interface lays out a set of methods for queue-like classes to implement
 */
public interface Queue {
	boolean isEmpty();
	Object dequeue();
	Object enqueue(Object element);
	Object getBack();
	Object getFront();
}
