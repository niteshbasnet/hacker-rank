package cracking.datastructure.stackandqueues;

public class StackAndQueueSolutions {

	public static void main(String[] args) {

//		MyQueue myQueue = new MyQueue();
//		myQueue.add(1);
//		myQueue.add(2);
//		myQueue.add(3);
//		myQueue.add(4);
//		myQueue.add(5);
//
//		System.out.println("Remove: " + myQueue.remove());
//		System.out.println("Remove: " + myQueue.peek());

		String a = null;
		String b = ";test";
		String c = a + b;
		
		String[] d = c.split(";");
		
		for (String string : d) {
			System.out.println(string);
		}
	}
}
