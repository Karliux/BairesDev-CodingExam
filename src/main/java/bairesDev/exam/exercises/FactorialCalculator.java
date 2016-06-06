package bairesDev.exam.exercises;

import java.util.Stack;

public class FactorialCalculator {

	public static Double calculate(int i) {
		Stack<Double> factorialStack = new Stack<Double>();
		factorialStack.push(1d);
		if (i > 0) {
			for(int counter = 1; counter <= i; counter++){
				factorialStack.push(counter * factorialStack.peek());
			}
		}
		return factorialStack.pop();
	}
	
	public static void main(String args[]){
		
		System.out.println("Factorial of 6: " + FactorialCalculator.calculate(6));
		
	}

}
