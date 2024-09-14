import java.util.Scanner;

/*
Switch case work on the expression. only these expressions are allowed(byte, short, int, char, String, enum) long is not allowed in switch case
int x = 2, y=1; // we need to make it final so it become constant 
switch(input){
	default:Sout("It will print when no case will match")
	case x: 
	case x+1:   these three will give an error(constant expression is required ) so we need to make int final so we can't change it
	case y:
	case 3*y;   It will also give an error duplicate case label
}

 */

public class Ai_switch_for{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String in = sc.next();
		// switch (args[0]) {  //args[0] this is at the place of expression
		switch(in){
			case "monday":
				System.out.println(in + " is a Working Day");
			case "tuesday":
				System.out.println(in + " is a Semi-Working Day");
			case "wednesday":	
				System.out.println(in + " is a Happy Day!");
			case "firday":
				System.out.println(in + " is not a valid day of week");
        }  


 
        final int x = 2, y=1; // we need to make it final so it become constant 
        switch(x){
	        default: System.out.println("it will print when no case will match");
	        case x:
	        case x+1:
	        case y:  break; 
        }
        



        String ab = "abc";
        switch(ab){
			case "AAA":System.out.println(2);
			case "ABC":System.out.println(1);
		    case "BBB":System.out.println(3);break;
			case "":System.out.println(4);
		}







		int arr [] = {1,2,3,4,5,6,7,8,9};
			Ai_switch_for pk = new Ai_switch_for();
			System.out.println(pk.calcSum(arr));
	}





	public int calcSum(int[] arr) { // here we are defining int
		int sum = 0;
		// Fill in the missing code for the for-each statement given below
		 for(int value: arr ) {
			sum += value ;
		}
		return sum;
	}   




		/*
		long in =3;
		final byte b=0;

		switch(in){
			case b:System.out.println(0);
		    case b+1:System.out.println(1);break;
			case b+3:System.out.println(3);
			case b+2:System.out.println(2);break;
			default:System.out.println("?");
		}
		 */



	
	
}





/*

int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	for (int i=0; i<10;i++ ) {
		System.out.println(numArr[i]);
	}

Write a class PrintEvenNumbers with a public method printEvenNumbers that takes one parameter arr of type int[].
Write code using for-each loop to iterate over the arr if the number is even the program should print is even otherwise, it should print is not even.

public void printEvenNumbers(int[] arr) {
		//Write your code here
	for(int number:arr){
	   	if((number%2)==0){
	   	System.out.println(number+" is even");
	   	}else{
	   		System.out.println(number+" is not even");
	   	}
	  }
	}

Use for-each loop to iterate over the arr and the program should print is odd if the element is odd otherwise, it should print is not odd
public void printOddNumbers(int[] arr){
		for( int x: arr){
			if((x%2)==0){
				System.out.println(x+" is not odd");
			}else{
				System.out.println(x+" is odd");
			}
		}
	}
	*/
