package test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public void longCalculation() {
		try {
		    // Attendre 2 secondes
			//Thread.sleep(2000);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Set<Integer> digitsSet(int number) {
		Set<Integer> ints = new HashSet<>();
		 int[] stream = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		 for(int i : stream) {
			 if(!ints.contains(i)) {
				 ints.add(i);
			 }
		 }
		return ints;
	}

}
