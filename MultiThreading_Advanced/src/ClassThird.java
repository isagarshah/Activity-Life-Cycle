
public class ClassThird extends Thread{
	
	
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
	try {
		
		System.out.println(Thread.currentThread().getName());
		
		for(;;){
			
			
			System.out.println("I am in child Thread");
			Thread.sleep(1000);
			
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	} finally {
		
		System.out.println("Thread 1 got killed");
	}
	
	}

	
	
}
