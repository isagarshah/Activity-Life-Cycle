
public class ClassMain2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Thread thread1 = new Thread(){
			
		public void run() {
			
			try {
				
				for (int i = 800; i < 810; i++) {
					System.out.println("Thread 1 -->" + i);
					Thread.sleep(500);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		};	
			
		};
		
		thread1.start();
		
		
		
		Runnable obj2 = new Runnable() {
			
			public void run() {
				try {
					for (int i = 700; i < 710; i++) {
						
						System.out.println("Thread 2 --> "+ i);
						Thread.sleep(500);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};
		
		Thread thread2 = new Thread(obj2);
		thread2.start();
		
		
		
		
		
		try {
			
			for (int i = 900; i < 910; i++) {
				System.out.println("Main " + i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
