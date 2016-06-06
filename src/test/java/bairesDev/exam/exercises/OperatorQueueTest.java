package bairesDev.exam.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import bairesDev.exam.exercises.OperatorQueue.Person;

@RunWith(JUnit4.class)
public class OperatorQueueTest {
	
	OperatorQueue operatorQueue = new OperatorQueue();
	Person personA = operatorQueue.new Person("Albert","Addams");
	Person personB = operatorQueue.new Person("Bernard","Baker");
	Person personC = operatorQueue.new Person("Christina","Carter");
	
	@Test
	public void addFirstPersontoQueue() throws Exception{
		operatorQueue.enqueue(personA);
		
		assertEquals(1, operatorQueue.getQueue().size());
	}
	
	@Test
	public void addPeopletoQueue() throws Exception{
		operatorQueue.enqueue(personA);
		assertEquals(1, operatorQueue.getQueue().size());
		assertEquals(personA, operatorQueue.getQueue().peek());

		operatorQueue.enqueue(personB);
		assertEquals(2, operatorQueue.getQueue().size());
		//Same person have to be in the head of the queue
		assertEquals(personA, operatorQueue.getQueue().peek());
		
		operatorQueue.enqueue(personC);
		assertEquals(3, operatorQueue.getQueue().size());
		//Same person have to be in the head of the queue
		assertEquals(personA, operatorQueue.getQueue().peek());
	}
	
	@Test
	public void attendPersonInQueue() throws Exception{
		Person nowAttending;
		
		operatorQueue.enqueue(personA);
		operatorQueue.enqueue(personB);
		
		nowAttending = operatorQueue.dequeue();
		assertEquals(nowAttending, personA);
		//Second person is now in the head of the queue
		assertEquals(personB, operatorQueue.getQueue().peek());
		assertEquals(1, operatorQueue.getQueue().size());
		
	}
}
