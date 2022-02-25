package arithmetic;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		double num1,num2,res;
		char op;
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers:");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		System.out.println("enter operater (+,-,*,/):");
		op= input.next().charAt(0);
		switch(op) 
		{
		case '+' : 
			res= num1 + num2;
			break;
		case '-' : 
			res= num1 - num2;
			break;
		case '*' : 
			res= num1 * num2;
			break;
		case '/' : 
			res= num1 / num2;
			break;
		 default :
			 System.out.println(" Incorrect Operator");
			 return;
		}
		System.out.println("result is:");
	System.out.println(num1 +" " + op +" "+num2 + "=" + res);

	}

}
