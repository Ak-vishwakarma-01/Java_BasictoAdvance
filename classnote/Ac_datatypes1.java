/*


*/

public class Ac_datatypes1 {
    public static void main(String[] args){
        int x = Integer.parseInt("B", 16);
              //parses the string literal "B" using base-16 and returns decimal 11 as a int
        int y = Integer.parseInt("747");
              //parses the string literal "747" using base-10 and returns decimal 747 as an int//Note that we need not pass the radix when we want to convert to decimal (or base-10)
        boolean b = 5<3; // false
        byte a=5;
        byte d=3;    
        byte k= (a+d);
        System.err.println(k); // it is use to print error but we can also use this  
        // byte a=5;
        // byte d=3;    will throw an error you can go byte to int(by + operator) but not go to int to byte
        // byte k=a+d;
        
        long x = Long.parseLong("C", 16);
        //parses the string literal "C" using base-16 and returns decimal 12 as a long
        long y = Long.parseLong("380");
        //parses the string literal "380" using base-10 and returns decimal 380 as a lon

        short x = Short.parseShort("A", 16);
//parses the string literal "A" using base-16 and returns decimal 10 as a short
short y = Short.parseShort("3203");
//parses the string literal "3203" using base-10 (by default) and returns decimal 3203 as a short

byte x = Byte.parseByte("111", 2);
//parses the string literal "111" using base-2 and returns decimal 7
byte y = Byte.parseByte("23", 10);
//parses the string literal "23" using base-10 (by default) and returns decimal 23

byte num1 = 3;
Byte num2 = 4;
Byte total = (byte)(num1 + num2);
byte valueOfNum2 = (byte)(total - num1);

float f = Float.parseFloat("4.5");
//parses the string literal "4.5" and returns a float value of 4.5f 

float num3 = 3.0f;
Float num4 = 4.2f;
Float tota = num3 + num4;
float valueOfNum = total - num3;
   
double num1 = 3.4d;
Double num2 = 1.2d;
Double total = num1 + num2;
double valueOfNum2 = total - num1;

Double y = Double.parseDouble("380.234d");
//parses the string literal "380.234d"

float x = 3.4f;
double y = 5.1d;
float sum = (float)(x + y);
  }
}
/*
The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, 
--comparison, format conversion and hashing. It can handle very large and very small floating point 
--numbers with great precision but compensating with the time complexity a bit

How do you initialize a big decimal in Java?
The best way to create a BigDecimal object with an initial decimal value is via a string, like this: 
--BigDecimal value = new BigDecimal("0.01"); Here, value has a value of exactly 0.01. If the initial 
--value is an integer, you can safely pass it to the constructor.
*/
