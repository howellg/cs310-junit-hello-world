package edu.jsu.mcis.cs310;

public class Main {

	public static void main(String[] args) {
   	 
    	Main m = new Main();
    	StringBuilder message = new StringBuilder(m.getGreeting());
    	System.out.println(message);
    	System.out.println(m.reverse(message));
   	 
	}
    
	public StringBuilder getGreeting() {
    	return new StringBuilder("Hello, World!");
	}
        public StringBuilder getUserMessage() {
            return new StringBuilder("Hello Everyone!");
        }
    
	public StringBuilder reverse(StringBuilder message) {
    	return message.reverse();
	}
        
        public StringBuilder reverseUserMessage(StringBuilder userMessage) {
            return userMessage.reverse();
        }
}
