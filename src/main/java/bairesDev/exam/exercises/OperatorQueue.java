package bairesDev.exam.exercises;

import java.util.LinkedList;
import java.util.Queue;

public class OperatorQueue {
	
	/*For problem num. 2, LinkedList data structure implementing Queue interface was chosen,
	 * as it maintains FIFO order and has required behavior
	 * such as add and poll */
	
	private Queue<Person> queue;
	
	public OperatorQueue(){
		queue = new LinkedList<OperatorQueue.Person>();
	}

	public void enqueue(OperatorQueue.Person person) {
		queue.add(person);
	}
	
	public Person dequeue() {
		return queue.poll();
	}
	
	public String toString(){
		StringBuilder queueDesc = new StringBuilder();
		queueDesc = queueDesc.append("Queue size: " + queue.size() + ".");
		if(queue.size() > 0){
			queueDesc = queueDesc.append(" People in queue: ");
			queueDesc = queueDesc.append(queue.toString());
		}
		return queueDesc.toString();
	}
	
	
	public static void main(String[] args) {
		OperatorQueue operatorQueue = new OperatorQueue();
		
		Person personA = operatorQueue.new Person("Albert","Addams");
		Person personB = operatorQueue.new Person("Bernard","Baker");
		Person personC = operatorQueue.new Person("Christina","Carter");
		
		System.out.println(operatorQueue.toString());
		//Adding people to queue
		System.out.println("Adding " + personA + " to queue. ");
		operatorQueue.enqueue(personA);
		System.out.println("Adding " + personB + " to queue. ");
		operatorQueue.enqueue(personB);
		
		System.out.println(operatorQueue.toString());
		
		//First person is taken
		System.out.println("Now attending: " + operatorQueue.dequeue() + ". ");
		System.out.println(operatorQueue.toString());
		
		//Adding another person to queue
		System.out.println("Adding " + personC + " to queue. ");
		operatorQueue.enqueue(personC);
		System.out.println(operatorQueue.toString());
		
		//Second person is taken
		System.out.println("Now attending: " + operatorQueue.dequeue() + ". ");
		System.out.println(operatorQueue.toString());
		
		//Last person is taken
		System.out.println("Now attending: " + operatorQueue.dequeue() + ". ");
		System.out.println(operatorQueue.toString());

	}
	
	public Queue<Person> getQueue() {
		return queue;
	}


	public void setQueue(Queue<Person> queue) {
		this.queue = queue;
	}

	class Person{
		private String name;
		private String lastName;
		
		public Person(String name, String lastName){
			this.name = name;
			this.lastName = lastName;
		}
		
		public String toString(){
			return name + " " + lastName;
		}
		
	}

}
