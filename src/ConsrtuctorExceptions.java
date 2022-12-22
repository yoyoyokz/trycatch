
public class ConsrtuctorExceptions extends Exception  {

	private int ErrorValue;

	public ConsrtuctorExceptions(int ErrorValue,String message ) {
		super(message);
		this.setErrorValue(ErrorValue);
		
		
	}
	
	


	public int getErrorValue() {
		return ErrorValue;
	}

	public void setErrorValue(int errorValue) {
		ErrorValue = errorValue;
	}
}