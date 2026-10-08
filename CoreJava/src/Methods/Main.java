package Methods;



public class Main 
{   //Question 1//
	static String hello(String name)
	{
		return name;
	}
	
	//Question 2//
	static float add(float v1,float v2)
	{
		return v1+v2;
	}
	
	//Question 3//
	static int subtraction(int a, int b)
	{
		return a-b;
	}
	
	//Question 4//
	static int multiplication(int a, int b)
	{
		return a*b;
	}
	
	//Question 5//
	static int division(int a, int b)
	{
		return a/b;
	}
	
	
	//Question 6//
	static int modulus(int a, int b)
	{
		return a%b;
	}
	
	//Question 7//
	int calculateTotalCricketBalls(int children,int balls)
	{
		return children*balls;
	}
	
	//Question 8//
	int calculateCupCakesPerBox(int cupcakes, int boxes)
	{
		return cupcakes/boxes;
	}
	
	//Question 9//
	int calculateTotalWorkers(int postOffice, int workers)
	{
		return postOffice*workers;
	}
	
	//Question 10//
	int calculateTotalPizzaSlices(int members, int slices)
	{
		return members*slices;
	}
	
	//Question 11//
	int calculateRequiredAeroplanes(int passengers, int totalPassengers)
	{
		return totalPassengers/passengers;
	}
	
	//Question 12//
	int calculateNumberOfForests(int treesInOne, int TotalTrees)

	{
		return TotalTrees/treesInOne;
	}
	
	//Question 13//
	int calculateTotalNotebooks(int students, int books)
	{
		return students*books;
	}
	
	//Question 14//
	int calculateBooksPerShelf(int totalBooks, int shelves)
	{
		return totalBooks/shelves;
	}
	
	//Question 15 //
	int calculateTotalMinutes(int hours, int minutesPerHour)
	{
		return hours*minutesPerHour;
	}
	
	//Question 16//
	int calculateTotalKilometers(int trips, int distancePerTrip)
	{
		return trips*distancePerTrip;
	}
	//Question 17//
	double calculateTotalCost(int items, int cost)
	{
		return items*cost;
	}
	
	//Question 18//
	static double calculateTotalChocolates(int boxes, double chocolates)
	{
		return boxes*chocolates;
	}
	//Question 19//
	static int calculateTotalScore(int game, int score)
	{
		return game*score;
	}
	
	//Question 20//
	static Boolean isNumberOdd(int number)
	{
		return number%2!=0;
	}
	
	//Question 21//
	static Boolean isNumberEven(int number)
	{
		return number%2 == 0;
	}
	
	//Question 22//
	static Boolean compare(int num1, int num2)
	{
		return num1<num2;
	}
	
	//Question 23//
	static Boolean compare1(int num1, int num2  )
	{
		return num1==num2;
	}
	
	//Question 24//
	static Boolean compare2(int num1, int num2)
	{
		return num1>=num2;
	}
	
	//Question 25//
	Boolean compare3(int num1, int num2)
	{
		return num1>=num2;
	}
	
	//Question 26//
	static int calculateDistance(int speed, int time)
	{
		return speed*time;
	}
	
	//Question 27//
	 double calculateTime( double distance,double speed)
	{
		return (distance/speed)*60;
	}
	 
	 double calculateSpeed(double distance , double time)
	 {
		 return (distance/time);
	 }
	 
	 

	 //Question 29//
	 static int calculateTravelTime(int distance, int speed)
	 {
		 return (distance/speed);
	 }
	 
	 //Question 30//
	 static int calculateAverageSpeed(int totalDistance, int TotalTime)
	 {
		 return totalDistance/TotalTime;
	 }
	
	 //Question 31//
	 int calculateRelativeSpeed(int speed1, int speed2)
	 {
		 return speed1-speed2;
	 }
	
	 //Question 32//
	 static double calculateTotalTravelTime(double distance1, double speed1, double distance2, double speed2)
	 {
		 return (distance1/speed1) + (distance2/speed2);
	 }
	 
	 //Question 33//
	 double calculateFuelEfficiency(int distance, int fuelConsumed)
	 {
		 return (distance/fuelConsumed);
	 }
	 
	 
	 //Question 34//
	 static double calculateAcceleration(double initialSpeed, int finalSpeed, int time)
	 {
		 return (finalSpeed-initialSpeed/time);
	 }
	 //Question 35//
	 double calculateTripCost(int distance, int costPerKilometer)
	 {
		 return distance*costPerKilometer;
	 }
	 //Question 36//
	 static double calculateSimpleInterest(double principal, double rate, double time)
	 {
		 return (principal*rate*time)/100;
	 }
	 //Question 37//
	 static double calculateSimpleInterest1(int principal, int rate, int timePeriod)
	 {
		 return (principal*rate*timePeriod)/100;
	 }
	 //Question 38//
	 static double calculateSimpleInterest2(int principal, int annualRate, int TimePeriod)
	 {
		 return principal*annualRate*TimePeriod/100;
	 }
	 //Question 39//
	 static double calculateSimpleInterest3(int principalAmount, int AnnualRate, int TimePeriod)
	 {
		 return (principalAmount*AnnualRate*TimePeriod)/100;
	 }
	 //Question 40//
	 static double calculateSimpleInterest4(double principal, double rate, double timePeriod)
	 {
		 return (principal*rate*timePeriod)/100;
	 }
	 
	 
	 
	 
	 
	 
	public static void main(String[] args)
	{
		System.out.println("Question 1");
		hello("Hello Aanya");
		System.out.println(hello("Hello Aanya"));
		
		
		System.out.println("Question 2");
		add(10.2f,12.5f );
		System.out.println(add(10.2f,12.5f ));
		
		System.out.println("Question 3");
		subtraction(5, 10);
		System.out.println(subtraction(5, 10));
		
		
		System.out.println("Question 4");
		multiplication(45,50);
		System.out.println(multiplication(45,50));
		
		System.out.println("Question 5");
		division(2, 10);
		System.out.println(division(10,2));
		
		System.out.println("Question 6");
		modulus(2, 10);
		System.out.println(modulus(58, 2));
		
		System.out.println("Question 7");
		Main obj = new Main();
		obj.calculateTotalCricketBalls(7, 4);
		System.out.println(obj.calculateTotalCricketBalls(7, 4));
		
		System.out.println("Question 8");
		Main obj2 = new Main();
		obj2.calculateCupCakesPerBox(27, 3);
		System.out.println(obj2.calculateCupCakesPerBox(27, 3));
		
		System.out.println("Question 9");
		Main obj3 = new Main();
		obj3.calculateTotalWorkers(4, 10);
		System.out.println(obj3.calculateTotalWorkers(4, 10));
		
		System.out.println("Question 10");
		Main obj4= new Main();
		obj4.calculateTotalPizzaSlices(5, 4);
		System.out.println(obj4.calculateTotalPizzaSlices(5, 4));
		
		
		System.out.println("Question 11");
		Main obj5= new Main();
		obj5.calculateRequiredAeroplanes(60,180);
		System.out.println(obj5.calculateRequiredAeroplanes(60,180));
		
		System.out.println("Question 12");
		Main obj6 = new Main();
		obj6.calculateNumberOfForests(6, 42);
		System.out.println(obj6.calculateNumberOfForests(6, 42));
		
		System.out.println("Question 13");
		Main obj7= new Main();
		obj7.calculateTotalNotebooks(18, 5);
		System.out.println(obj7.calculateTotalNotebooks(18, 5));
		
		System.out.println("Question 14");
		Main obj8 = new Main();
		obj8.calculateBooksPerShelf(100,5);
		System.out.println(obj8.calculateBooksPerShelf(100,5));
		
		
		System.out.println("Question 15");
		Main obj9 = new Main();
		obj9.calculateTotalMinutes(3, 60);
		System.out.println(obj9.calculateTotalMinutes(3, 60));
		
		System.out.println("Question 16");
		Main obj10= new Main();
		obj10.calculateTotalKilometers(10,15);
		System.out.println(obj10.calculateTotalKilometers(10,15));
		
		
		
		System.out.println("Question 19");
		calculateTotalScore(5, 40);
		System.out.println(calculateTotalScore(5, 40));
		
		System.out.println("Question 20");
		isNumberOdd(9);
		System.out.println(isNumberOdd(9));
		
		System.out.println("Question 21");
		isNumberEven(14);
		System.out.println(isNumberEven(14));
		
		System.out.println("Question 22");
		compare(25, 30);
		System.out.println(compare(25, 30));
		
		System.out.println("Question 23");
		compare1(90, 90);
		System.out.println(compare1(90, 90));
		
		
		System.out.println("Question 24");
		compare2(89,98);
		System.out.println(compare2(89,98));
		
		System.out.println("Question 25");
		Main comp = new Main();
		comp.compare3(32,15);
		System.out.println(comp.compare3(32,15));
	
		System.out.println("Question 26");
		calculateDistance(60, 4);
		System.out.println(calculateDistance(60, 4));
		
		System.out.println("Question 27");
		Main obj15= new Main();
		obj15.calculateTime(90,60);
		System.out.println(obj15.calculateTime(90,60));
		
		
		System.out.println("Question 28");
		Main obj16= new Main();
		obj16.calculateSpeed(125,5);
		System.out.println(obj16.calculateSpeed(125,5));
		
		System.out.println("Question 29");
		calculateTravelTime(300, 100);
		System.out.println(calculateTravelTime(300, 100));
		
		System.out.println("Question 30");
		calculateAverageSpeed(450, 9);
		System.out.println(calculateAverageSpeed(450, 9));
		
		System.out.println("Question 31");
		Main Obj17 = new Main();
		Obj17.calculateRelativeSpeed(80, 60);
		System.out.println(Obj17.calculateRelativeSpeed(80, 60));
		
		System.out.println("Question 32");
		calculateTotalTravelTime(150, 50, 200, 100);
		System.out.println(calculateTotalTravelTime(150, 50, 200, 100));
		
		System.out.println("Question 33");
		Main obj18= new Main();
		obj18.calculateFuelEfficiency(600,40);
		System.out.println(obj18.calculateFuelEfficiency(600,40));
		
		System.out.println("Question 34");
		calculateAcceleration(0, 60, 10);
		System.out.println(calculateAcceleration(0, 60, 10));
		
		System.out.println("Question 35");
		Main obj19 = new Main();
		obj19.calculateTripCost(250,50);
		System.out.println(obj19.calculateTripCost(250,50));
		
		System.out.println("Question 36");
		calculateSimpleInterest(1500, 4, 2);
		System.out.println(calculateSimpleInterest(1500, 4, 2));
		
		System.out.println("Question 37");
		calculateSimpleInterest1(2000, 6, 5);
		System.out.println(calculateSimpleInterest1(2000, 6, 5));
		
		System.out.println("Question 38");
		calculateSimpleInterest2(800, 7, 3);
		System.out.println(calculateSimpleInterest2(800, 7, 3));
		
		System.out.println("Question 39");
		calculateSimpleInterest3(300, 5, 6);
		System.out.println(calculateSimpleInterest3(300, 5, 6));
		
		System.out.println("Question 40");
		calculateSimpleInterest4(1500, 8, 7);
		System.out.println(calculateSimpleInterest4(1500, 8, 7));
		
		
	}

}
