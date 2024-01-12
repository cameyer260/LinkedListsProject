package linkedLists;

public class Tester {
	
	public static void main(String args[]) {
		//linked lists
		StackList sl = new StackList();
		QueueList ql = new QueueList();
		
		//elements to add/remove... etc.
		String a = "Bill";
		String b = "Fred";
		String c = "Joe";
		String d = "Henrietta";
		String e = "Mr. M";
		String f = "Norman";
		
		//add elements to all lists
		sl.push(a);
		sl.push(b);
		sl.push(c);
		sl.push(d);
		sl.push(e);
		sl.push(f);
		
		ql.enQueue(a);
		ql.enQueue(b);
		ql.enQueue(c);
		ql.enQueue(d);
		ql.enQueue(e);
		ql.enQueue(f);
		
		//print lists
		System.out.println(sl.toString());
		System.out.println(ql.toString());
		
		
	}
}
