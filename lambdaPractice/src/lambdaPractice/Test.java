package lambdaPractice;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(7);
		arrList.add(8);

		// Using lambda expression to print all elements

		System.out.println("all---");
		arrList.forEach(n -> System.out.println(n));

		// Using lambda expression to print even elements
		System.out.println("ODDS---");
		arrList.forEach(n -> {
			if(n%2 == 1)
				System.out.println(n);
		});

		
		System.out.println("evens---");
		arrList.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});

	}

}
