import java.util.Observer;
import java.util.Observable;

public class TimeoutErrorReport implements Observer
{
	private int counter;
	private Submission testCase;

	public TimeoutErrorReport()
	{
		counter = 0;
	}

	@Override
	public void update(Observable obj, Object arg)
	{
		testCase = (Submission)obj;
		if(!testCase.didPass())
		{
			if(testCase.wasTimeoutError())
				counter++;
		}
	}

	public void printReport()
	{
		System.out.println("***Begin Timeout Error Report***");
		System.out.println("The submission contained " + counter + " timeout errors.");
		System.out.println("***End Timeout Error Report***\n");
	}
}