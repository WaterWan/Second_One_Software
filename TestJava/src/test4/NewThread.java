package test4;

public class NewThread implements Runnable {
	String name;
	Thread t;
	
	public NewThread(String threadname) {
		this.name = threadname;
		this.t = new Thread(this, this.name);
		System.out.println("New Thread: " + t);
		t.start();
		
	}
	
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + " exiting.");
	}

}
