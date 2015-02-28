import java.util.*;

public class SubmissionQueue
{
	private Queue<Submission> queue;
	private static SubmissionQueue singletonQueue;

	public SubmissionQueue(){
		queue = new LinkedList<Submission>();
	}
	
	public static SubmissionQueue getSubmissionQueue()
	{
		if(singletonQueue == null)
			singletonQueue = new SubmissionQueue();
		return singletonQueue;
	}

	public void add(Submission s)
	{
		queue.add(s);
	}

	public Submission process()
	{
		return queue.remove();
	}

	public void printQueue()
	{
		Iterator<Submission> iter = queue.iterator();
		int index = 0;

		while(iter.hasNext())
		{	
			Submission iterSub = iter.next();
			System.out.println("Element " + index + " in queue: " + iterSub.getId());
			index++;
		}
	}

}