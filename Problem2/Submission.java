/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.Observable;

public class Submission extends Observable
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;
	private boolean passed;

    // You may add attributes to this class if necessary

	public Submission()
	{
	    myRandom = new Random();
		lastErrorWasTimeout = false;
	}

    public void runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		passed = myRandom.nextBoolean();
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}
		
		setChanged();
		notifyObservers();
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}

	public boolean didPass()
	{
		return passed;
	}
}
