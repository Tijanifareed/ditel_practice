import java.util.Scanner;
public class QuestionTwo{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter The number: ");
		int number = input.nextInt();
		

		if (number > 100 || number * number > 100){
			System.out.print("Number is greater than hundred");
		}else if (number < 100 || number * number < 100){
			System.out.print("Number is less than hundred");
		}else{System.out.print("Number is equal to hundred");
		}
		


	}
}