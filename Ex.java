import java.util.Scanner;

public class Ex {
	
	public static void basicStuff()
	{
		System.out.print("hello world, ");
		System.out.print("My name is John doe, ");
		System.out.print("I am in grade 17th class 2, ");
		System.out.print("I am from a place on earth, ");
		System.out.print("I am 48 years old");
	}
	
	public static void basicCalculator(Scanner input)
	{
		int x = 0;
		int y = 0;
		
		System.out.println();
		System.out.print("Enter a first number: ");
		x = input.nextInt();
		System.out.print("Enter a second number: ");
		y = input.nextInt();
		System.out.println("Your result is: " + (x+y));
	}
	
	public static void enterUrAge(Scanner input)
	{
		int a;
		System.out.print("Enter your age: ");
		a = input.nextInt();
		System.out.println (a +" years. So young!!!");
	}
	
	public static void stringLengthsPractice(Scanner input)
	{
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		basicCalculator(input);
		enterUrAge(input);
		input.close();
	}

}
