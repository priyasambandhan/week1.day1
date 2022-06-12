package week1.day1;
public class PrimeNumber {
	//* Goal: To find whether a number is a Prime number or not
public static void main(String[] args) {
	int input=15;
	boolean isComposite = false;
	for (int i = 2; i <= input/2; i++) {
		
		if(input%i==0)
		{
			isComposite=true;
				System.out.println(" Besides 1 and same number, it is divisible by "+i);	
				break;
		}
		
	}
	if (isComposite==false) 
	{
		System.out.println("Prime");
		
	} 
	else 
	{
		System.out.println("Not Prime");
	}	
	
}
}
