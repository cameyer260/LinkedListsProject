package linkedList;

/**
 * File:    	Stack.java
 * Authors: 	Joey Johnson, Paul Manning, Chris Meyer
 * Class:   	AP CSA, 3rd Hour
 * Date:    	January 17, 2024
 * 
 * Description: This interface lays out a set of methods for stack-like classes to implement
 */
public interface Stack {
	boolean isEmpty();
	Object push(Object element);
	Object pop();
	Object peek();
	int search(Object element);
}
