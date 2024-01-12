package linkedLists;

public interface Queue {
	boolean isEmpty();
	Object deQueue();
	Object enQueue(Object e);
	Object getBack();
	Object getFront();
}
