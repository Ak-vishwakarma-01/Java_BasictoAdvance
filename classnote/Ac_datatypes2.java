
/*
Every floating point number in java is double  (12.3f now it will be float either(f or F))
In java boolean can have only true or false(only lower case). when we assign 0 or 1 to float it will give an error of incompatible type
range of byte = 2^(b-1) to 2^(b-1) - 1

narrowint(explit typcasting)
<<------------------------------------------------------------------
byte->short->int->long->float->double  based on procesor and sequence
-------------------------------------------------------------------->>
widening(implicit typecasting)

int x = 65;
char y = x ; it is an incompatible type error
char y = (char)x ; it is right and char y= 65; it is also right

int.MAX_VLAUE     It will print the maxmm vlue of both the datatype
float.MAX_VLAUE

If any datatype in the form of string then we can convert into that actual datatyp with use of parser method




**We can include an underscore ('_') in numeric literals to show grouping of digits.

Note: Underscore is only for programmer's readability, it is completely ignored during computations.
Underscore cannot be used before a suffix like F (used in float), L (used in Long) or D (used in Double).
Underscore cannot be used before or between a radix prefix used for binary or octal or hex numbers
int x = 0xA_B -> Correct!
int x = 1_____________0 -> Well it is valid!

long mySalary = 900_000L;// Which is equal to 900000 (Nine Hundred Thousand)
long magicNumberInHex = 0xCAFE_BABE; 

The default value of a primitive boolean is false
the default value of a reference of type Boolean is null

In Java true is a special value and not equal to the value of numeral 1

Boolean.parseBoolean(String s) which can be used to convert a string value representing one of the two logical states of being true or false into their corresponding boolean value
boolean x = Boolean.parseBoolean("true");
boolean y = Boolean.parseBoolean("false");

In Java, the char data type denotes a 2byte(16-bit) unsigned integer (between 0 and 65535), which represent the Unicode values between '\u0000' and '\uffff' 
Both char and Character can be used interchangeably
A character literal must be wrapped in single quotes and it cannot span multiple lines.
The default value of a primitive char is 0, when not initialized. However, the default value of a reference of type Character is null
Since char is a 16-bit integer type, it can be interchangeably used with int.

isLetter()
isDigit()
isLetterOrDigit()

isUpperCase()
isLowerCase()
toUpperCase()
toLowerCase()
isWhitespace() 

byte default value = 0
short default value = 0
int default value = 0
long default value = 0
boolean default value = false
double default value = 0.0
float default value = 0.0
fro character and all other reference type the value is null. 

Autoboxing: Automatic conversion of primitive type to object.
Unboxing: Auromatic conversion from object to primitive type.


*/


public class Ac_datatypes2 {
   public static void main(String ak[]){
   
      System.out.println("value 1: " +ak[0]+"/nvalue 2 :" +ak[1]);
      //after printing this the command line input bcomes string so if we run the next line then it will not add just simply print
      System.out.println(ak[0] + ak[1]);
      System.out.println(Integer.parseInt(ak[0]) + Integer.parseInt(ak[1])); // here we have changed from string to original type by wrapper class
      // but if we give input 5.2 in command line then it will not convert it into integer it will give an axception numberformatexception
/*
      C:\All codes\java code\classnote>javac Ac_datatypes2.java

      C:\All codes\java code\classnote>java Ac_datatypes2 12 3
      value 1: 12
      value 2: 3
      123
      15 
      
*/
      int val = Integer.parseInt(ak[0]);
      double val1 = Double.parseDouble(ak[1]);
      System.out.println(val + val1); // it will also work during command line arguments
      

      // byte b = 7;
      // long l= 35;
      // int x = 3;
      // int rsult = b*x -l; // error = typemismatch it will convert byte to int and total(b*x - l) become long and then long connot narrowing to int by itself so we neee to do it explicitly 
      // possible lossy conversion from long to int.
   
      byte a= 5;
      byte b = 3;
      byte c = a+b ; // type mismatch cannot convert from int to byte(when we add it(a,b) + operator convert it in niteger) becos operator works on integer type
   
   
      
   }
}
/*

package q10862;
import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalUsage {
	public static void main(String[] args) {
		MathContext mathContext = new MathContext(5);
		BigDecimal x = new BigDecimal("3.145", mathContext);
		BigDecimal y = new BigDecimal("1.792", mathContext);
		BigDecimal sum =x.add(y,mathContext); //fill
		BigDecimal difference = x.subtract(y,mathContext); //fill
		BigDecimal product = x.multiply(y,mathContext); //fill
		BigDecimal quotient = x.divide(y,mathContext) ; //fill
		System.out.println("sum = " + sum);
		System.out.println("difference = " + difference);
		System.out.println("product = " + product);
		System.out.println("quotient = " + quotient);
	}
}

use to print default valus

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
It makes your program memory efficient (i.e., it saves memory).
public class Demo {
   static boolean val1;
   static double val2;
   static float val3;
   static int val4;
   static long val5;
   static String val6;
   public static void main(String[] args) {
      System.out.println("Default values.....");
      System.out.println("Val1 = " + val1);
      System.out.println("Val2 = " + val2);
      System.out.println("Val3 = " + val3);
      System.out.println("Val4 = " + val4);
      System.out.println("Val5 = " + val5);
      System.out.println("Val6 = " + val6);
   }
}

public class Demo {
   boolean t;
   byte b;
   short s;
   int i;
   long l;
   float f;
   double d;
   zvoid Display() {
      System.out.println("boolean (Initial Value) = " + t);
      System.out.println("byte (Initial Value) = " + b);
      System.out.println("short (Initial Value) = " + s);
      System.out.println("int (Initial Value) = " + i);
      System.out.println("long (Initial Value) = " + l);
      System.out.println("float (Initial Value) = " + f);
      System.out.println("double (Initial Value) = " + d);
   }
   public static void main(String[] args) {
      Demo d = new Demo();
      System.out.println("Displaying initial values...");
      d.Display();
   }
}
*/