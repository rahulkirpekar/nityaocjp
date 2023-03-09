package exceptiontopic.throwtopic;

// checked Exception
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
