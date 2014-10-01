
public class Class2 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		
	try {
		
		
		for (int i = 90; i < 100; i++) {
			System.out.println("Thread 2 --> " + i);
			Thread.sleep(1000);
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}	
	
	}

}
