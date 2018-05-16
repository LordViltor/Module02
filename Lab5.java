import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		String operator;
				
		System.out.println("Simple Calculator");
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("First number:");
		a = input.nextDouble();
		while (a <= 0) {
		      System.out.println("Please pick a non-zero number:");
		      a = input.nextDouble();
		}
		System.out.println("Please enter an operator:");
		operator = input.next();
 
		while (!operator.equals("*") && !operator.equals("-") && !operator.equals("%") && !operator.equals("/") && !operator.equals("+") ) {
		      System.out.println("Please enter a valid operation:");
		      operator = input.next();
		}

		
		System.out.println("Second number:");
		b = input.nextDouble();
		while (b <= 0) {
		      System.out.println("Please pick a non-zero number:");
		      b = input.nextDouble();
		}
		double ans = 0;

		
		if (operator.equals("*")) {
		     ans = (a*b);  
		    }
		else 
		if (operator.equals("/") ) {
		     ans = (a/b);    
		    }
		else 
		if (operator.equals("+")) {
		     ans = (a+b);  
		    }
		else 
		if (operator.equals("-")) {
		     ans = (a-b);  
	        }
		else
		if (operator.equals("%")) {
		     ans = (a%b);  
		    }

		System.out.println(a+" "+operator+" "+b+" = "+ans);

		
	}

}
