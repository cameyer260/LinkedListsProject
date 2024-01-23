/**
 * Author: Christopher Meyer
 * Group: Shane, Joey
 * Project: Expression.java
 * Date: 1/23/24
 * Description: This class acts as a postfix calculator.
 * The user may edit the string in the main method to act 
 * as the calculator input. The calculate method is 
 * then called on the string which calculates the answer. 
 * This answer is then printed out in the console.
 */

package linkedLists;

public class Expression {
	private static StackList sl;
	private static String input;
	private static double output;
	private static boolean isNumber;
	
	/**
	 * This method is called on the String input in the main method.
	 * It's purpose is to calculate an answer to return as a double,
	 * which is then printed out in the main method.
	 * @param s
	 * @return
	 */
	private static double calculate(String s) {
		//separate string into an array of strings with each number/operator
		String[] sa = s.split(" ");
		
		//iterates through the array of strings sa
		//first checks if the string is an operator,
		//then checks if it is a number
		//if number-> add to StackList
		//if operator-> calculate the solution then -> add to StackList sl
		for(int i=0; i<sa.length; i++) {
			if(sa[i].equals("+")) {
				//pop pop add push
				//the object that is "popped" off is converted to a string, then a double
				double n1 = Double.parseDouble(sl.pop().toString());
				double n2 = Double.parseDouble(sl.pop().toString());
				double n3 = n2 + n1;
				sl.push(n3);
			}
			if(sa[i].equals("-")) {
				//pop pop subtract push
				double n1 = Double.parseDouble(sl.pop().toString());
				double n2 = Double.parseDouble(sl.pop().toString());
				double n3 = n2 - n1;
				sl.push(n3);
			}
			if(sa[i].equals("*")) {
				//pop pop multiply push
				double n1 = Double.parseDouble(sl.pop().toString());
				double n2 = Double.parseDouble(sl.pop().toString());
				double n3 = n2 * n1;
				sl.push(n3);
			}
			if(sa[i].equals("/")) {
				//pop pop divide push
				double n1 = Double.parseDouble(sl.pop().toString());
				double n2 = Double.parseDouble(sl.pop().toString());
				double n3 = n2 / n1;
				sl.push(n3);
			}
			isNumber = true;
			//if this try catch block runs into an error(cannot covert string to double)
			//then the string is not a number
			//if the string is not a number, we don't add it to StackList, we just skip over it
			try {
				Double num = Double.parseDouble(sa[i]);
			} catch(NumberFormatException e) {
				isNumber = false; 
			}
			if(isNumber == true) {
				sl.push(sa[i]);
			}
		}
		return Double.parseDouble(sl.pop().toString());
	}
	
	/**
	 * main method
	 * instantiates StackList sl
	 * instantiates input string
	 * calls calculate method on the input string and then prints out the solution
	 * @param args
	 */
	public static void main(String args[]) {
		sl = new StackList();
		input = "5 5 * 7 +";
		output = calculate(input);
		System.out.println(output);
	}
}
