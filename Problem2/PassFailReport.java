import java.util.Observer;
import java.util.Observable;

public class PassFailReport implements Observer
{
	private int counter;
	private Submission testCase;

	public PassFailReport()
	{
		counter = 0;
	}

	@Override
	public void update(Observable obj, Object arg)
	{
		testCase = (Submission)obj;
		if(testCase.didPass())
		{
			counter++;
		}
	}

	public void printReport()
	{
		System.out.println("***Begin Pass/Fail Report***");
		System.out.println("The submission contained " + counter + " passing test cases.");
		System.out.println("***End Pass/Fail Report***\n");
	}
}