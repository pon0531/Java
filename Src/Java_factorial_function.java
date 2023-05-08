
public class Java_factorial_function {
	static int factorial_function(int n)
	{
		int factorial_final = 1;
		for(int i = 1;i<=n;i++)
			factorial_final*=i;
		
		return factorial_final;
	}

	static int factorial_function_2(int factor)
	{
		int factorial_final = 1;

		while(factor > 0)
		{
			factorial_final *= factor--;
		}

		return factorial_final;
	}
	static int factorial_function_recur(int n)
	{
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;

		return n*factorial_function_recur(n-1);
	}
	public static void main(String[] args) {

		int n = (int) (Math.random()*10);

		System.out.println("Fatorial(" + n+")=");
		System.out.println(factorial_function(n));
		System.out.println(factorial_function_2(n));
		System.out.println(factorial_function_recur(n));
	}
}
