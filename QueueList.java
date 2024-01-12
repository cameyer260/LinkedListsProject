package linkedLists;

public class QueueList implements Queue {
	private LinkedList list;
	
	public QueueList() {
		list = new LinkedList();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public Object deQueue() {
		return(list.getFront());
	}
	
	public Object enQueue(Object e) {
		list.addBack(e);
		return e;
	}
	
	public Object getBack() {
		Object e = list.getFront();
		list.addFront(e);
		return e;
	}
	
	public Object getFront() {
		Object e = list.getFront();
		list.addFront(e);
		return e;
	}
	
	public String toString() {
		return list.toString();
	}
}
