 
/*
nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), nextBoolean(),
String next()[read a word]
String nextLine()[Read the Line]
next().charAt(0)[Read a character]
*/

import java.util.*; // use to use all classes from util package
import java.util.Scanner; // it is having only scanner class
public class Ao_scanner {
    public static void main(String[] ank){
        // java.util.Scanner ck  = new java.util.Scanner  if we don't import the scanner calss
        Scanner sc = new Scanner(System.in); // input stream(reading) form the source (it will read it from console that's why we are using System.in)
        //it provides us methods to read the input 
        //At the place of System.in i can place a file name to read from that file also
        System.out.print("\nEnter your Roll Number: \t");
        int roll = sc.nextInt(); // it will skip name userinput bcos when we press enter, it looked into the buffer and will not wait and tking input into the buffer
        
        sc.nextLine(); // now it will take input of name also we can use flush also (it is use to clear the buffer)

        System.out.print("\nEnter your Name: \t");
        String name = sc.nextLine(); // sc will read the input

        System.out.print("\nEnter your age: \t");
        int age = sc.nextInt();
                                                                      // these all are non-static
        System.out.print("\nEnter your cgpa: \t");
        double cgpa = sc.nextDouble(); // if we give wrong datatype of value to anyinput it will show InputMismatchException

        System.out.print("\nDo you want to ca on sunday(y/n): \t");
        Boolean yn = sc.nextBoolean();
        char ca = sc.next().charAt(0);
        
    }
}
