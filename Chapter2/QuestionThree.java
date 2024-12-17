import java.util.Scanner;
public class QuestionThree{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number one: ");
	int firstInput = input.nextInt();

	System.out.print("Enter number two: ");
	int secondInput = input.nextInt();

	System.out.print("Enter number three: ");
	int thirdInput = input.nextInt();


	int sum = firstInput + secondInput +thirdInput ;
	int average = sum / 2;

	int product = firstInput * secondInput * thirdInput;

	int smallest =  0;
	if(firstInput < secondInput && firstInput < thirdInput){
		smallest = firstInput;
	}
	else if(secondInput < firstInput && secondInput < thirdInput){
		smallest = secondInput;
	}else{
		smallest = thirdInput;
	}

	int largest =  0;
	if(firstInput > secondInput && firstInput > thirdInput){
		largest = firstInput;
	}
	else if(secondInput > firstInput && secondInput > thirdInput){
		largest = secondInput;
	}else{
		largest = thirdInput;
	}



	System.out.printf("The sum is  %d %n ", sum);
	System.out.printf("The average is  %d %n", average);
	System.out.printf("The product is   %d %n", product);
	System.out.printf("The smallest is   %d %n", smallest);
	System.out.printf("The largest is   %d %n", largest);






	}
}