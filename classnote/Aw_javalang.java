
/*
Object - The Object class is the root class of all classes in Java.
System - The System class provides access to the standard input, output and error streams of the running Java program. It also has many other useful methods.
Wrapper Classes - Whenever we want to represent a primitive int value as an object, we use its wrapper class Integer. The java.lang package contains all the wrapper classes: Boolean, Byte, Character, Short, Integer, Long, Float and Double.
String, StringBuilder classes.
Math - The Math class contains many useful methods for numeric operations like the square root, power, trigonometric operations etc.
Class - The class called Class represents the loaded classes and interfaces in memory during runtime.
Other classes - The java.lang package also has many other useful classes like ClassLoader, Process, Runtime, Thread, Runnable, Throwable, Exception, Error, etc.

+Math.pow(base,exponent) power
Math.sqrt(base)          sqaure root

A space should be used between all binary operators and their operands except dot (.). Unary operators (-, -- and ++) must never be separated from their operands by a space. For example:
int total = num1 + num2;
for (int i = 0; i < namesArr.length; i++) {
	...
}





public boolean isPrimeNumber (int number) { //statement 1
	for(int i=2; i<=(number/2); i++) {//statement 2
		if ((number%i)==0) { //statement 3
			return false;
		}
	}
	return true;
}
In statement 1, there should not be a space between the method name and the opening parenthesis. isPrimeNumber (
In statement 2, there should be a space between for and the opening parenthesis that follows it.
In statement 2, there should be a space on either side of = (assignment operator) in the initialization expression int i=2;.
In statement 2, there should be a space on either side of / and <= operators in the condition expression i<=(number/2);.
In statement 2, there should be a space after the semicolon ; of the condition expression i<=(number/2);.
In statement 3, there should be a space on either side of % and == operators in the if's condition expression (number%i)==0.



Java compiler automatically converts primitive types to their corresponding wrapper classes when needed. This is called Autoboxing.
Similarly, when the conversion is from a wrapper class to its corresponding primitive type, it is called Unboxing.



public class AutoBoxingExample {	 
	public static void main(String[] args) {
		int num1 = 3; //statement 1
		System.out.println("Square of " + num1 + " is : " + calculateSquare(num1)); //statement 2
	}
	
	public static Integer calculateSquare(Integer number) { //statement 3
		return number * number;  //statement 4
	}
}
In statement 1, num1 is being autoboxed.
No, there is neither autoboxing nor unboxing in statement1.
In statement 2, in the method invocation calculateSquare(num1), num1 is being unboxed.
No, num1 which is primitive int is being autoboxed to Integer, because the method calculateSquare accepts a parameter of type Integer.
In statement 4, there is neither autoboxing or unboxing.
No, reference number which is of Integer type, will be unboxed to its primitive type (int) for the multiplication operator to work.
In statement 4, number is first unboxed and later the product is autoboxed gain before being returned.
Yes, since the return type of the method calculateSquare is Integer the product which would be in primitive int value will be autoboxed before being returned.
*/

public class Aw_javalang {
    
}
