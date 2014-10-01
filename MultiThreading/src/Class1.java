
public class Class1 extends Thread{
	
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
	try {
		
		for (int i = 40; i < 50; i++) {
			System.out.println("Thread 1 -->" + i);
			
			Thread.sleep(1000);
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}

}
