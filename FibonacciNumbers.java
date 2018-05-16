import java.util.Scanner;
public class FibonacciNumbers {

	private int numberofNumbers;
	private int a = 1;
	private int b = 1;
	private int[] fbNumbers;
	private int currNumber;
	private int c;
	
public void getNumberFromUser() {
    Scanner input = new Scanner(System.in);
    System.out.println("How many Fibonacci numbers do you want?");
    numberofNumbers = input.nextInt();
    while (numberofNumbers < 2) {
    System.out.println("You need to generate at least two");
    numberofNumbers = input.nextInt(); }
    fbNumbers = new int[numberofNumbers];	
}

private int nextNumber() {
	c = b;
	b = b + a;
	a = c;
	return b;
}

public void createFibonacciNumbers() {
	fbNumbers[0]=1;//couldnt get it to print the first 2 values of the array correctly
	fbNumbers[1]=1;//this is the only solution i could come up with to make the output match 
	currNumber = 2;
	while (currNumber != numberofNumbers) {
		fbNumbers[currNumber]= nextNumber();
		currNumber++;
	}	
}
	
public void printFibonacciNumbers() {
System.out.println("The first "+numberofNumbers+" Fibonacci numbers in reverse order are: ");
currNumber = numberofNumbers;
while (currNumber != 0) {
System.out.println(fbNumbers[currNumber-1]);
currNumber--;
}
}
				
}