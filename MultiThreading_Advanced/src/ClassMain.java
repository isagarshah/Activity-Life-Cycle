
public class ClassMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			
			Thread thread1 = new ClassThird();
			thread1.setName("Thread 1");
			thread1.start();
			
			System.out.println(Thread.currentThread().getName());
			
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("I am in parent");
				Thread.sleep(1000);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
			System.out.println("Main Thread got killed");
		}
				
				
		
	}

}
