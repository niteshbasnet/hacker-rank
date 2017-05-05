
public class ThreadA implements Runnable {

	public void run() {
		System.out.println("Thread A");
	}

	public static void main(String[] args) throws InterruptedException {
		String[] messages = { "a,b,c,d" };

		for (int i = 0; i < messages.length; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException ex) {
				return;
			}
			System.out.println(messages[i]);
		}
	}

}
