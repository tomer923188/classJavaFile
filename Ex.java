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
	
	public static void stringTask1(Scanner input)
	{
		System.out.print("Enter your string: ");
		String st = input.next();
		int length = st.length();
		int min = length;
		int max = length;
		for(int i = 1; i < 6; i++)
		{
			System.out.print("Enter your string: ");
			String str = input.next();
			System.out.println("The length of your string is: " + str.length());
			length = str.length();
			if (length < min)
				min = length;
			if (length > max)
				max = length;
		}
		System.out.println("Longest string is: "+max+" shortest string is: "+min);
	}
	
	public static void stringTask2(Scanner input)
	{
		System.out.print("Enter your first string: ");
		String first = input.next();
		System.out.print("Enter a full number: ");
		int n = input.nextInt();
		int counter = 0;
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter a string: ");
			String str = input.next();
			if (str.equals(first))
			{
				counter++;
			}
		}
		System.out.println(counter+" strings were equal to first");
	}
	
	public static void stringTask3(Scanner input)
	{
		System.out.print("Enter your first string: ");
		String first = input.next();
		System.out.print("Enter a full number: ");
		int n = input.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter a string: ");
			String str = input.next();
			if (str.compareTo(first) > 0)
				System.out.println("after");
			if (str.compareTo(first) < 0)
				System.out.println("before");
			if (str.compareTo(first) == 0)
				System.out.println("same");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//basicCalculator(input);
		//enterUrAge(input);
		//stringTask1(input);
		stringTask2(input);
		input.close();
	}

}
