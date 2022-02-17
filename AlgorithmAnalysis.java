package assignments;

/** COSC 2100–Fall2021
 *  Assignment#2
 *  <This class has two different methods of find the uniqueness of an array. This class also returns
 *  the time it takes to run the program. This class will be use to analyze the two codes>
 *  @author<Claire Kraft>*/

import java.util.Arrays;
import java.util.Random;

public class AlgorithmAnalysis {
	
	public static boolean algorithmAnalysis1(int[] array) {
		
		for(int i = 0; i < array.length-1; i++)
			for(int j = i+1; j < array.length; j++)
				if(array[j] == array[i])
					return false;
		return true;
		
	}
	
	public static boolean algorithmAnalysis2(int[] array) {
		Arrays.sort(array);
		for(int i = 0; i < array.length-1; i++)
			if(array[i] == array[i+1])
				return false;
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis(); 
		//long startTime = System.nanoTime();
		
		int number[]= new int[1000000];
		
		Random random = new Random();
		//int x = random.nextInt();
		//System.out.println(x);
		
		for(int x = 0; x> number.length; x++){
			number[x]= random.nextInt();
		}
		
		//long startTime = System.currentTimeMillis();
		//algorithmAnalysis1(number);
		algorithmAnalysis1(number);
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
		//long stopTime = System.nanoTime();
		//System.out.println(stopTime - startTime);
	}

}
