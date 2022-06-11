package week1.day1;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 */
public static void main(String[] args) {
	
	int range=8;
	int firstNum= 0;
	int secNum=1;
	int sum;
	System.out.println(firstNum);
	for (int i=1; i<range; i++)
	{
		sum= firstNum+secNum;
		System.out.println(sum);
		firstNum=secNum;
		secNum=sum;
	}
		
}
}

