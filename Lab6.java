import java.util.Scanner;

public class Lab6 {

	private int value1;
	private int value2;
	private int gcf;
	private int c;
		
  public void getValues(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter value1:");
    value1 = input.nextInt();

    while (value1 <= 0) {
      System.out.println("Enter value1 that is greater than 0:");
      value1 = input.nextInt();
    }


    System.out.println("Enter value2:");
    value2 = input.nextInt();

    while (value2 <= 0) {
      System.out.println("Enter value2 that is greater than 0:");
      value2 = input.nextInt();
    }
    
  }
	
	public void CalculateGCF() {
		   int a=value1;
		   int b=value2;
		   
		   while(b != 0) {
		   c = a % b;
		   a = b;
		   b = c;		    
		   }  
		   gcf = a;  
}  
  
  public void display() {
	  
   System.out.println("The greatest common factor of "+value1+" and "+value2+" is "+gcf);
	
}
  
  
  
}