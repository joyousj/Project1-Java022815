package answers.JoySingharath;
//Finding the sum of the even-valued terms

public class P2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int fib = 1;
		int sum = 0;

		//While loop to check fib variable and executes the arguments
		while(fib <= 4000000)
		{
			fib = a + b;
			a = b;
			b = fib;

			//If fib exceeds 4000000, break out of the nested loop
			if(fib >= 4000000)
			{
				break;
			}
			else {
				
				//If fib remainder is zero, add sum and fib to find sum of even-valued terms
				if(fib % 2 == 0)
				{
					sum = sum + fib;
				}
			}
		}
		System.out.println("The sum of the even-valued terms is: " + sum);
	}

}

