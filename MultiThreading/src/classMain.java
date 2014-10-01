
public class classMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread thread1 = new Class1();
		thread1.start();
		
		Class2 clsobj = new Class2();
		Thread thread2 = new Thread(clsobj);
		thread2.start();
		
		try {

			for (int i = 1; i < 10; i++) {
			System.out.println("Loop 1---> " + i);

			Thread.sleep(1000);
		}
			
			for (int i = 20; i < 30; i++) {
				System.out.println("Loop 2 --> " + i);
			
			}
			
			
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

