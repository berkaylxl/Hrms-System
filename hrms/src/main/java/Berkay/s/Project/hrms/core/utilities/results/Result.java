package Berkay.s.Project.hrms.core.utilities.results;

public class Result {
	private Boolean success;
	private String message;
	
	public Result(boolean success)
	{
		this.success=success;
		
	}
	
	public Result(String message,boolean success)
	{
		this(success);
		this.message=message;
	}
	public boolean isSuccess()
	{
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}

	
}
