package greet;

public class RunnableExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hellwo world");
				
			}
			
		});
		
		myThread.run();
		
		
		
		Thread lamdaThread = new Thread( ()->System.out.println("hellow lwo") );
		
		lamdaThread.run();
		
	}
	
	

}
