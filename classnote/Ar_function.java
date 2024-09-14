
/*
Similarly, the output of a function need not always be printed to a console, the function could store the output to a file, or a database or even return the calculated value to be used for further processing.

There are five things to identify method:
Method Name 
Method Body 
Method Parameters - [optional]
Method Return Type - indicates what type of value is returned, if the method returns nothing, then void is used as the return type.
Modifiers - [optional] modifiers constitute one or more keywords that inform how the method can be used. We will learn more about them later.

public int sum(int num1, int num2) {
	return num1 + num2;
}
sum is the method name.

int which is before the method name sum is the return type of the method.
the keyword public used before the int return type is part of the method modifiers.


The list of variables/references that are present in the method declaration are called parameters.
When the method is invoked the actual values passed are called arguments.
*/

public class Ar_function {
    public static void main(String ak []){
		
	}
	int demo(byte b){  //m4
		return 0;
	} 

	private void demo(int b){ } //m3

	public boolean demo(char c, int id){ return false; } //m2

	void Demo(String s){ } //m4

	// M1, M2 and M3 are overloaded
	
}

class A {
	int A(){return 1;} // void A(){} is also a method
	
	private A(){ } //this is const bcos this is not return type
}
