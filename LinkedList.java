package linkedLists;

public class LinkedList {
	private ListNode start;
	
	public LinkedList() {
		start = null;
	}
	
	public void addFront(Object e) {
		start = new ListNode(e, start);
	}
	
	public Object getFront() {
		Object e = start.getElement();
		start = start.getNext();
		return e;
	}
	
	public Object getBack() {
		Object a;
		if(start != null) {
			ListNode current = start;
			
			while(current.getNext() != null) {
				if(current.getNext().getNext() == null) {
					a = current.getNext().getElement();
					current.setNext(null);
					return a;
				}
				current = current.getNext();
			}
		}
		
		return null;
	}
	
	public void addBack(Object e) {
		if(start != null) {
			ListNode current = start;
			
			while(current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(new ListNode(e, null));
		} else {
			start = new ListNode(e, null);
		}
	}
	
	public boolean isEmpty() {
		if(start == null) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "Linked List: ";
		ListNode temp = start;
		while(temp != null) {
			if(temp.getElement() == null) {
				s += "null";
			}
			s += temp.toString();
			if(temp.getNext() != null) {
				s+= "->";
			}
			temp = temp.getNext();
		}
		return s;
	}
}
