package question3;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {


		ArrayList<Integer> array = new ArrayList<>();
		
	
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
	
		List<Integer> oddNumbers = array.stream().filter(temp -> temp%2!=0).toList();
		
		
		List<Integer> squareNumbers = oddNumbers.stream().map(temp -> temp*temp).toList();
		
	
		int sum = squareNumbers.stream().mapToInt(temp -> temp).sum();
	
		
		System.out.println("INPUT : "+array);
		System.out.println("ODD NUMBERS : "+oddNumbers);
		System.out.println("SQUARE NUMBERS : "+squareNumbers);
		System.out.println("SUM : "+sum);
		
	}

}
