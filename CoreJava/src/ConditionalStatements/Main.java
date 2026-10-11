package ConditionalStatements;

public class Main 
{
	static void findMax(double a, double b)
	{ if (a > b)
	{ System.out.println(a); 
	} 
	else if (b > a) 
	{ System.out.println(b); 
	} 
	else 
	{ System.out.println("Both numbers are equal");
	}
  }

	

	public static void main(String[] args) 
	{
		findMax(10, 20);
		findMax(7.5, 3.2);
		findMax(12, 12);
		findMax(-5, -3); 
		findMax(0, 0);
		findMax(15.5, 15.5);
		findMax(2.5, 7.5);
		findMax(100, -50);
		findMax(1, -1); 
		findMax(10.0, 10.1);

	}

}
