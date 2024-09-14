
/*
:

cmd line input it stores of the String[] of the class
addition(+) = concanitation

any variable we define inside a block is called local variable
we can't use access modifire with local vairable not even private

parent class(outer class only public or default)
but nested calss can be public, private, default(with in the package)
java.io.PrintStream package have print, printf, println

If we make any variable final it will be constant.
If we make any function final it can't be overridden.
If we make any class final it can't be inherited

public static final is called global constant( public satatic final java.io.Printstream out/err)
System.err is used for error messeges


int x = 023;
print(x) it will give output 19 bcose in the beginning it is 0 so it bcome octal and bse is 8 so(8*2 + 3)
same rule for binary(0b) and hexadiceimal(0x)
*/

public class Aa_commandline {
  public static void main(String args[]){
    // System.err.println(args[0]); // I will get an error bcos i haven't passed any input to String[] thats the size of the array is zero
    // System.out.print(args[1]);
    // System.out.println(args[2]);
    System.out.println(args[0] + args[1]); //it will add(cancatenation) the num if we give input like in line nu 43
    /*
    C:\All codes\java code\classnote>javac Aa_commandline.java
    C:\All codes\java code\classnote>java Aa_commandline
    
    */
  }   
}
