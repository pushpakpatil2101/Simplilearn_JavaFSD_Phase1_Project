package arithmetic_calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int option;
		Double number1;
		Double number2;
		Scanner scan = new Scanner(System.in);
		String newline = System.lineSeparator();
		
		System.out.println("Choose an option to calculate"+newline+"1.Addition"+newline+"2.Substraction"+newline+"3.Division"+newline+"4.Multiplication");
		option = scan.nextInt();
		
		System.out.println("Enter First Number To Calculate");
		number1 = scan.nextDouble();
		
		System.out.println("Enter Second Number To Calculate");
		number2 = scan.nextDouble();
		
		
		//to print correction option
		if(option == 1)
		{
			System.out.println("You Choose Addition");
			System.out.println("Your addition is "+(number1+number2));
		}else if(option == 2)
		{
			System.out.println("You Choose Substraction");
			System.out.println("Your Substraction is "+(number1-number2));
		}else if(option == 3)
		{
			System.out.println("You Choose Multiplication");
			System.out.println("Your Multiplication is "+(number1*number2));
		}else if(option == 4)
		{
			System.out.println("You Choose Division");
			System.out.println("Your Division is "+(number1/number2));
		}else {
		    System.out.println("==Please choose Correct Option==");
		}
		scan.close();
	}

}
