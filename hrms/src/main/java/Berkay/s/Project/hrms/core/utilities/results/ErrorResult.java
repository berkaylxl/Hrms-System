package Berkay.s.Project.hrms.core.utilities.results;

public class ErrorResult extends Result{

	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message)
	{
		super(message,false);
	}

}
