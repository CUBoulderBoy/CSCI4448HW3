public class SubmissionQueueTest
{
	public static void main(String[] args)
	{
		//Create three new assignments with class "Submission"
		Submission assignment1 = new Submission();
		Submission assignment2 = new Submission();
		Submission assignment3 = new Submission();

		//Create three new submission queues with class "SubmissionQueue"
		//This also tests the SubmissionQueue as a singleton
		SubmissionQueue subQueue1 = SubmissionQueue.getSubmissionQueue();
		SubmissionQueue subQueue2 = SubmissionQueue.getSubmissionQueue();
		SubmissionQueue subQueue3 = SubmissionQueue.getSubmissionQueue();

		//Add each assignment to each subQueue
		subQueue1.add(assignment1);
		subQueue2.add(assignment2);
		subQueue3.add(assignment3);

		System.out.println("subQueue1: ");
		subQueue1.printQueue();

		//Test the process() method for "SubmissionQueue"
		System.out.println("\nAssignment 4 is processed from subQueue3 using 'process()':");
		Submission assignment4 = subQueue3.process();
		System.out.println("Assignment 4 has id: " + assignment4.getId());
		System.out.println("Assignment 1 has id: " + assignment4.getId());

		if(assignment4 == assignment1)
			System.out.println("Assignment 1 and Assignment 4 are equal!");

		System.out.println("\nsubQueue3: ");
		subQueue1.printQueue();

		System.out.println("\nTesting the subQueues to verify Singleton 'Submission Queue' is working:");
		if(subQueue1 == subQueue2 && subQueue2 == subQueue3)
			System.out.println("\tAll queues equal!");

		//Here are all of the assignment ID's:
		System.out.println("Here are all assinments by ID: ");
		System.out.println("\tAssignment1 has id: " + assignment1.getId());
		System.out.println("\tAssignment2 has id: " + assignment2.getId());
		System.out.println("\tAssignment3 has id: " + assignment3.getId());
		System.out.println("\tAssignment4 has id: " + assignment4.getId());


	
	}
}