import java.util.Scanner;
public class QuestionOne{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number one: ");
	int firstInput = input.nextInt();

	System.out.print("Enter number two: ");
	int secondInput = input.nextInt();

	int firstSquare = firstInput * firstInput;
	int secondSquare = secondInput * secondInput;

	int sumSquare = firstSquare + secondSquare;
	int diiferenceSquare =  firstSquare - secondSquare;

	System.out.printf("The square of  %d is %d  %n ", firstInput, firstSquare);
	System.out.printf("The square of  %d is %d %n", secondInput, secondSquare);
	System.out.printf("The sum of their squares is   %d %n", sumSquare);
	System.out.printf("The difference of their squares is   %d %n", diiferenceSquare);





	}
}