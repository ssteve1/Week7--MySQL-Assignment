package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException(String errorMessage) {
		super (errorMessage);
		
	}
	public DbException(Throwable cause) {
		super (cause);
	}
	
	public DbException (String message, Throwable cause) {
		super(message, cause);
	}
	

}
