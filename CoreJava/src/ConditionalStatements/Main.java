package ConditionalStatements;


public class Main 
{
	
	//Question 1//
	static void findMax(double a, double b)
	{ 
		if (a > b)
	{ 
			System.out.println(a); 
	} 
	else if (b > a) 
	{ 
		System.out.println(b); 
	} 
	else 
	{ 
		System.out.println("Both numbers are equal");
	}
  }

	
	//Question 2//
	static double findmax(double a , double b, double c)
	{
		if(a>=b && a >=c)
		{
			return a;
		}
		else if(b>=a && b >=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	//Question 3//
	static String findYoungest(int rohan, int harsh, int anjali)
	{
		if(rohan<harsh && rohan<anjali)
		{
			return "Rohan is youngest with an age of" + rohan;
		}
		else if(harsh<rohan && harsh<anjali)
		{
			return "Harsh is the youngest with an age of " +harsh;
		}
		else
		{
			return "Anjali is the youngest with an age of " + anjali;
		}
	}
	
	//Question 4//
	static void checkNumber(int a)
	{
		if(a<1)
		{
			System.out.println("Negative Number");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}
		else {
			System.out.println("Positive Number");
		}
	}
	
	//Question 5//
	static Boolean isDivisible(double a)
	{
		if(a%5==0 && a%11==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	//Question 6//
	static String checkEvenOdd(double num)
	{
		if(num%2==0)
		{
			return "Even Number";
		}
		else {
			return "Odd Number";
		}
	}
	
	//Question 7//
	static String checkCharType(char ch)
	{
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
		{
			return "ALPHABET";
		}
		else if(ch>='0' && ch<='9')
		{
			return "DIGIT";
		}
		else {
			return "Special Character";
		}
	}
	//Question 8//
	static String checkVowelConsonant(char ch)
	{
		 if (ch == 'a' || ch == 'e' || ch == 'i'||
			 ch == 'o' || ch == 'u' ||
			 ch == 'A' || ch == 'E' || ch == 'I' ||
			 ch == 'O' || ch == 'U') 
		 {
			return "Vowel";
		 } 
		 else
		 {
		  return "Consonant";
		 }	
	}
	//Question 9//
	static String checkCase(char ch)
	{
		if(ch>='a'&& ch<='z')
		{
			return "LowerCase";
		}
		else if(ch>='A'&& ch <='Z')
		{
			return "UpperCase";
		}
		else {
			return"Not an Alphabet";
		}
	}
	//Question 10//
	static void calculateProfitOrLoss(int cp, int sp )
	{
		if(sp>cp)
		{
			System.out.println("Profit"+(sp-cp));
		}
		else if(cp>sp)
		{
			System.out.println("Loss"+ (cp-sp));
		}
		else
		{
			System.out.println("No Profit, No Loss");
		}
	}
	
	//Question 11//
	static String printWeekday(int day)
	{
		if(day==1)
		{
			return "Monday";
		}
		else if(day==2)
		{
			return "Tuesday";
		}
		else if(day==3)
		{
			return "Wednesday";
		}
		else if(day==4)
		{
			return "Thursday";
		}
		else if(day==5)
		{
			return "Friday";
		}
		else if(day==6)
		{
			return "Saturday";
		}
		else {
			return "Sunday";
		}
	}
	//Question 12//
	static String printMonthName(int month)
	{
		if (month == 1) 
		{
	        return "January";
	    }
		else if (month == 2) 
		{
	        return "February";
	    } 
		else if (month == 3)
		{
	        return "March";
	    } 
		else if (month == 4)
	    {
	        return "April";
	    } 
		else if (month == 5) 
		{
	        return "May";
	    }
		else if (month == 6) 
		{
	        return "June";
	    } 
		else if (month == 7) 
		{
	        return "July";
	    }
		else if (month == 8)
		{
	        return "August";
	    } 
		else if (month == 9) 
		{
	        return "September";
	    } 
		else if (month == 10)
		{
	        return "October";
	    } 
		else if (month == 11) 
		{
	        return "November";
	    } 
		else if (month == 12) 
		{
	        return "December";
	    } 
		else
		{
	        return "Invalid month";
	    }
	}
	//Question 13//
	static int calculateTotalAmount(int notesOf100, int notesOf500, int notesOf2000)
	{
		int totalAmount = (notesOf100 * 100)+(notesOf500 * 500 )+(notesOf2000 * 2000);
		
		if(totalAmount>10000)
		{
			System.out.println("Amount exceeds 10000");
		}
		else {
			System.out.println("Amount is within limit");
		}
		return totalAmount;
		
	}
	//Question 14//
	static double calculateTotalExpenses(int quantity , int pricePerItem)
	{
		double totalAmount = quantity*pricePerItem;
		
		if(quantity>100)
		{
			totalAmount= totalAmount-(totalAmount*10/100);
		}
		return totalAmount;
		
		
	}
	//Question 15//
	static boolean isValidTriangle(int angle1, int angle2, int angle3)
	{
		if(angle1+angle2+angle3 ==180)
		{
			return true;
		}
		else {
			return false;
		}
	}
	//Question 16//
	static boolean isValidTriangleSides(int a, int b, int c)
	{
		if(a+b>c && a+c>b && b+c>a)
		{
			return true;
		}
		else {
			return false;
		}
	}
	//Question 17//
	static String checkTriangleType(int a , int b , int c)
	{
		if(a==b && b==c)
		{
			return "Equilateral Triangle";
		}
		else if(a==b || b==c || a==c)
		{
			return "Isosceles Triangle";
		}
		else {
			return "Scalene Triangle";
		}
			
	}
	//Question 18//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		//Question 1//
		System.out.println();
		System.out.println("Question 1");
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

		//Question 2//
		System.out.println();
		System.out.println("Question 2");
		System.out.println(findmax(10, 20, 15));
		System.out.println(findmax(3.3, 7.1, 6.9));
		
		//Question 3//
		System.out.println();
		System.out.println("Question 3");
		findYoungest(25, 30, 22);
		System.out.println(findYoungest(25, 30, 22));
		
		//Question 4//
		System.out.println();
		System.out.println("Question 4");
		checkNumber(10);
		checkNumber(-5);
		
		//Question 5//
		System.out.println();
		System.out.println("Question 5");
		isDivisible(55);
		System.out.println(isDivisible(55));
		isDivisible(110);
		System.out.println(isDivisible(110));
		isDivisible(12);
		System.out.println(isDivisible(12));
		
		//Question 6//
		System.out.println();
		System.out.println("Question 6");
		checkEvenOdd(4);
		System.out.println(checkEvenOdd(4));
		checkEvenOdd(7);
		System.out.println(checkEvenOdd(7));
		
		//Question 7//
		System.out.println();
		System.out.println("Question 7");
		checkCharType('a');
		System.out.println(checkCharType('a'));
		checkCharType('1');
		System.out.println(checkCharType('1'));
		checkCharType('#');
		System.out.println(checkCharType('#'));
		
		//Question 8//
		System.out.println();
		System.out.println("Question 8");
		 System.out.println(checkVowelConsonant('a'));
		 System.out.println(checkVowelConsonant('b'));
		
		 //Question 9//
		 System.out.println();
		 System.out.println("Question 9");
		 checkCase('r');
		 System.out.println(checkCase('r'));
		 checkCase('Q');
		 System.out.println(checkCase('Q'));
		 checkCase('^');
		 System.out.println( checkCase('^'));
		 
		 //Question 10//
		 System.out.println();
		 System.out.println("Question 10");
		 calculateProfitOrLoss(500, 600);
		 calculateProfitOrLoss(700, 500);
		 calculateProfitOrLoss(800, 800);
		 
		 //Question 11//
		 System.out.println();
		 System.out.println("Question 11");
		 printWeekday(2);
		 System.out.println(printWeekday(2));
		 
		 //Question 12//
		 System.out.println();
		 System.out.println("Question 12");
		 printMonthName(10);
		 System.out.println(printMonthName(10));
		 
		 //Question 13//
		 System.out.println();
		 System.out.println("Question 13");
		 System.out.println("Total Amount:"+calculateTotalAmount(5, 8, 2));
		 
		 //Question 14//
		 System.out.println();
		 System.out.println("Question 14");
		 System.out.println(calculateTotalExpenses(150, 20));
		 
		 //Question 15//
		 System.out.println();
		 System.out.println("Question 15");
		 System.out.println(isValidTriangle(60, 60, 60) + " it is a valid triangle");
		 System.out.println(isValidTriangle(90, 75, 45));
		 
		 //Question 16//
		 System.out.println();
		 System.out.println("Question 16");
		 System.out.println(isValidTriangleSides(3, 4, 5));
		 
		 //Question 17//
		 System.out.println();
		 System.out.println("Question 17");
	     System.out.println(checkTriangleType(5, 5, 5));
	     System.out.println(checkTriangleType(6, 6, 8));
	     System.out.println(checkTriangleType(7, 8, 9));

		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
