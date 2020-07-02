package greet;

public class Greeter {
	public void Greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		// greeter.Greet();
		
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
//		greeter.Greet(helloWorldGreeting);
		
		MyLamda myLamdaFunction = () -> System.out.println("Hellow world");
	
		Greeting functionalInterface = () -> System.out.println("Hellow world");
		
		
		//anonymous inner class
		Greeting innerClassInterface = new Greeting() {
			public void perform() {
				System.out.println("Hellow world");
			}
		};
		
		greeter.Greet(functionalInterface);
		greeter.Greet(innerClassInterface);
		
		
		
	}
	
}


interface MyLamda {
	public void foo();
}


