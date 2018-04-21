package Chapter20Generics;

public class InvalidSubscriptException extends Exception {
	String cause;
	public InvalidSubscriptException(String cause){
		this.cause = cause;
	}
	public String toString(){
		return "InvalidSubscriptException: " + cause;
	}
}
