import java.util.*;

public class SubmissionTest
{
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java SubmissionTest [# of tests to run]");
			System.exit(-1);
		}

		int numberOfTests = Integer.parseInt(args[0].toString());
		Submission test = new Submission();
		PassFailReport pfr = new PassFailReport();
		TimeoutErrorReport ter = new TimeoutErrorReport();

		test.addObserver(pfr);
		test.addObserver(ter);

		for(int i = 0; i < numberOfTests; i++)
		{
			test.runTestCase();
		}

		pfr.printReport();
		ter.printReport();

	}
}