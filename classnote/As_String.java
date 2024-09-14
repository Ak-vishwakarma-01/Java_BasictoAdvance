
/*
if a data member declared final then it can't be modefied it becomes constant
final class then this class can't be inherited;
final method then it can't be overrided;


1-Every String is an OBJECT(it is an class not a datatype in java.lang package we don't need to import this)
2- a=String(immutable), b=StringBuilder(mutable), c=StringBuffer(mutable,Synchronized)  in java.lang package
Immutable = once if we have create a string then we can't change with in the created(same) object we can do modification but we need a new object(mutable=vice versa)
Synchronization(Thread-safe)= when we access one string at two place at same time then it will be not allowed(any process at two palace at one time) 



String s1 =new String("Hello");  it creats object every time s1 is pointing Hello
String s2 =new String("Hello");  s2 also creats a new object which pointing another Hello
String s3 ="Hello";    this is called string literal(first it will check is there any string with same if there is not then it will create )
String s4 = "Hello"; now s4 will check and it will find hello in s3 then s4 create reference variable then it will point s3's "hello"
s1.equals(s3); true  it compare only the content what we have written
s2.equals(s1); true
s1==s2; false  different addresses(and (==) it compares the address)
s3==s4; true    same addresses   both pontig the same hello
String s5 = s1.toUpperCase();
s3==s5; flase
s2==s5; false  bcos it is creating a new object in the memory so it should have a differetn reference variable




Methods in string class:

1 =int length() // gives the nu of character which are the present in the string including (specl char, space , everything)
String s = new String("Hello Java");
System.out.peintln(s.length());             == nu of character including space 11
String s2 = new String("HeLLo JAVA");

2 = equals(),equalsIgnoreCase()
System.out.peintln(s.equals(s2));           == false
System.out.peintln(s.equalsIgnoreCase(s2)); == true // Ignore the cases

this methos is inherited from comaprable Interface
3 = compareTo() returns three value either 0 or +1 or -1 it also compares 2 string
Integer a=20,b=30;
System.out.peintln(a.compareTo(b)); == -1 bcos calling object(a) is small
String s3 = new String("Hello JAVA");
String s4 = new String("HeLlo JAVA");
System.out.peintln(s3.compareTo(s4)); == 32

s1= Hello JAVA             //compareTo() it's compare the characters of both string 
s2= HeLlo JAVA           suppose 1st l is capital then here it will missmatch   (l - L = 32) differentiationg sky value of l and L

String s1 = new String("Banana");  
String s2 = new String("Baby");
System.out.peintln(s1.compareTo(s2)); == (n-b)=12

s1 = Hello
s2 = Hello World
it will give nu of left character so it will give -6 if s1 would have more character then it will give +6

4 = startsWith()  endsWith() indexOf() lastIndexOf()
String s1 = "this is an island"
print(s1.startsWith("this")); boolean = yes/no
s2 = Somebody is asked to ask the reason of being late?
print(s2.endsWith("?") && s2.startsWith("Why")); will give boolean value

indexOf() will check what is the first occurence of the string
s1 = this is a cake and cake is very tasty
print(s1.indexOf("cake")); it will give the starting index of cake(first)=10
print(s1.lastIndexOf("cake")); it will give the first index of last cake = 19
print(s1.indexOf("cake",10)); it will count from 11 not before 10
print(s1.lastIndexOf("cake",11)); 


String s1 = new String("Hello");
String s2 = s1.toUpperCase(); it will make a new string and then store to s2


String str = "Hello";
str.toLowerCase(); it will become garbage because we are not storing it any where
String s2 = str.toLowerCase();
String str = str.toLowerCase(); it will replace the Hello with hello and it will become garbage(reference is pointing new object)
print(str);==Hello



charAt()  find chatacter at any particular index and it must be in the range of string
String s1 = "Hello Ravi Kant Sahu"; 
print(s2.charAt(19)); ==u
print(s2.charAt(0)); == H
print(s2.charAt(23)); error == StringIndexOutOfBoundException
char x[] = s1.toCharArray(); // It will copy all the character of s1 into a character array
s1 = s1.replace("Hello","Bye").raplace("Kant","Sahu");

String s = "Ravi Kant Sahu";
s.substring(7); // return the string form the index 7 till the end == nt Sahu
s.substring(3,8) // starting index and ending index(exclusive(not be included)) so 3(0 to 2) to 7;

s1 = "     ankit kumar vihswakarma     ";
trim(); method will remove the spaces from the beggining and from the ending

String s1 = "Hello-Ravi-Kant-Sahu";
String s1[] = s1.split("-",3); it will only first two token n - 1(3-1=2)
it will print = Hello 
                Ravi
                Kant-Sahu    and put it in a string array


String s1 = "--Hello-Ravi-Kant-Sahu----";
String s1[] = s1.split("-");
s1 = s1.replace("Ravi","viky")
The toString() is a special method because when the object is involved in the string concatenation then the toString() method returns the String representation of that object. Hence a toString() method's return type is String and it does not take any parameters.



The state information of an instance of Student class is stored in its instance fields.

These fields are usually marked as private.

These fields are initialized using the constructor. Hence, after the values are initialized, getXXX and setXXX methods are written to retrieve and modify their values.

A setXXX method is called a setter method. For a field named age, the setter method would be written as:
public void setAge(int age) {
 	this.age = age;
}
A getXXX method is called a getter method. For a field named age, the getter method would be written as:
public int getAge() {
 	return age;
}
These getter and setter methods are also called as accessor methods
*/

public class As_String {
    public static void main(String[] ank){
        String s1 = "this is a cake and cake is very tasty";
        System.out.print(s1.indexOf("cake")+"\n"+s1.lastIndexOf("cake")+"\n"+s1.lastIndexOf("cake",19)); // output give 10 19 19
        /*Given a sentence to be in in present continous Tense convert it into past continous 
          s.replace("is","was").replace("am","was").replace("are","were");
          s.replace("is ","was").replace("am ","was").replace("are ","were"); 
          s.replace(" is "," was ").replace(" am "," was ").replace(" are "," were ");
          last one is rigth
          */
    }
}
