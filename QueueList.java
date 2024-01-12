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
		return list.getBack();
	}
	
	public Object getFront() {
		return list.getFront();
	}
	
	public String toString() {
		return list.toString();
	}
}
