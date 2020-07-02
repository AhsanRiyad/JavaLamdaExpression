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
		greeter.Greet(helloWorldGreeting);
		
		
	
	}
	
}
