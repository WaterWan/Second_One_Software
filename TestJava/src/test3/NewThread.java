package test3;

public class NewThread implements Runnable {
	Thread t;

	public NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted/");
		}
		System.out.println("Exiting child thread.");
	}

}
