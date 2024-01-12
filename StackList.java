package linkedLists;

public class StackList implements Stack {
	private LinkedList list;
	
	public StackList() {
		list = new LinkedList();
	}
	
	public Object push(Object o) {
		list.addFront(o);
		return o;
	}
	
	public Object pop() {
		Object o = list.getFront();
		list.getFront();
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int search(Object o) {
		ListNode next = new ListNode(list.getFront(), null); //PICK UP HERE
		int i = 1;
		while(next != null) {
			if(next.getElement().equals(o)) {
				return i;
			}
			next = next.getNext();
			i++;
		}
		return -1;
	}
	
	public Object peek() {
		Object e = list.getFront();
		list.addFront(e);
		return e;
	}
	
	public String toString() {
		return list.toString();
	}
}
