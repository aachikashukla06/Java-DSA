package MethodLogical;


public class Methods 
{
	//QUESTION 1//
	static int speed(int distance, int time)
	{
		return distance/time;
	}
	//Question 2//
	static int distance(int speed, int time)
	{
		return speed*time;
	}
	//Question 3//
	static int time(int distance , int speed)
	{
		return distance/speed;
	}
	
	//Question 4//
	static int area(int length, int breadth)
	{ 
		return length*breadth;
		
	}
	
	//Question 5//
	static int Perimeter( int lenght, int breadth )
	{
		return 2*(lenght+breadth);
	}
	
	//Question 6//
	static double AreaTriangle(double base, double height)
	{
		return 0.5*base*height;
	}
	//Question 7//
	static double parallelogram(int base, int height)
	{
		return base*height;
	}
	//Question 8//
	static double circle(double radius)
	{
		return 3.14*(radius)*(radius);
	}
	//Question 9//
	static double circumference(int radius)
	{
		return 2*3.14*radius;
	}
	
	//Question 10//
	static double area(int side)
	{
		return side*side;
	}
	//Question 11//
	static int perimeterOfSquare(int side)
	{
		return 4*side;
	}
	//Question 12//
	static int sum(int n1, int n2)
	{
		return n1+n2;
	}
	
	//Question 13//
	static int difference(int d1, int d2)
	{
		return d1-d2;
	}
	//Question 14//
	static int product(int p1, int p2)
	{
		return p1*p2;
	}
	//Question 15//
	static int quotient(int d1, int d2)
	{
		return d1/d2;
	}
	//Question 16//
	static int remainder(int x, int y)
	{
		return x%y;
	}
	//Question 17//
	static int average(int a1, int a2)
	{
		return (a1+a2)/2;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Question 1");
		speed(150, 3);
		System.out.println(speed(150, 3));

		System.out.println("Question 2");
		distance(80, 5);
		System.out.println(distance(80, 5));
		
		System.out.println("Question 3");
		time(180, 60);
		System.out.println(time(180, 60)+" hours");
		
		System.out.println("Question 4");
		area(12, 8);
		System.out.println(area(12, 8));
		
		System.out.println("Question 5");
		Perimeter(15, 10);
		System.out.println(Perimeter(15, 10));
		
		System.out.println("Question 6");
		AreaTriangle(20, 12);
		System.out.println(AreaTriangle(20, 12));
		
		System.out.println("Question 7");
		parallelogram(18, 7);
		System.out.println(parallelogram(18, 7));
		
		System.out.println("Question 8");
		circle(10);
		System.out.println(circle(10));
		
		System.out.println("Question 9");
		circumference(14);
		System.out.println(circumference(14));
		
		System.out.println("Question 10");
		area(9);
		System.out.println(area(9));
		
		System.out.println("Question 11");
		perimeterOfSquare(25);
		System.out.println(perimeterOfSquare(25));
		
		System.out.println("Question 12");
		sum(345, 278);
		System.out.println(sum(345, 278));
		
		System.out.println("Question 13");
		difference(950, 475);
		System.out.println(difference(950, 475));
		
		System.out.println("Question 14");
		product(48, 15);
		System.out.println(product(48, 15));
		
		
		System.out.println("Question 15");
		quotient(144, 12);
		System.out.println(quotient(144, 12));
		
		System.out.println("Question 16");
		remainder(100, 7);
		System.out.println(remainder(100, 7));
		
		System.out.println("Question 17");
		average(56, 84);
		System.out.println(average(56, 84));
		
		System.out.println("Question 18");
		
		
	}

}
