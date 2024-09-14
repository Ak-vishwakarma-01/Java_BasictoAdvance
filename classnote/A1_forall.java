import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class A1_forall{
    public static void main(String[] ak){ // we make main fuction static so that jvm don't need to make any object to call this main funciton.
    int num = (int)Math.pow(10, 3)-1;
    System.out.println;
    // while(num%5 !=0) num--;
    }
}
/*
OAK LAUNCHED JAVA IN 1995
J2SE JAVA 2 STATNDARD EDDITION
J2EE JAVA 2 ENTERPRISES EDDITION
J2ME JAVA 2 MICRO EDDITION

JDK { JRE([JVM]+[SET OF LIBRARIES]+[OTHER FILES])+(TOOLS[DEVELOPMENT TOOLS,EG JAVAC,JAVA])}
JDK contains src also which contains all the course code of the librarires
JVM - it is responsible for the execution of java program
JDK>JRE>LIB>(rt jar files which contains all the compiled version of java class fiel and it is executable )

to compile and run we need jdk but if file is already compiled we need only jre


ALL IMPORTANT NEED OF WEBSITES (WEB APPLICATION)
1-SECURITY
2-PLATFORM INDEPENDENCE


obbligation:
keywords:- reserved Word(there are 50 keyword(reserved words) in java)
-Java is strictly case sensitive
-all keyword will be written in lower case
System is not a keyword**

Identifier:- is any name that we assign to any particulr component in code(to class, method, variable, constant)

allowed character to assign name
-A to Z, a to z, 0 to 9, $, _ 
-any identifier must not start with a digit.
-keyword shold not be an identifier
int do; wrong  bcos do is a keyword
int Do; wright

int _; we can't write like this bcos '_' is a keyword from source level 9 onwards,


CONVENTION:
1-Writing proper comment , normol comment describes the part of code but documetation comment describe the entire file
2-Proper indentation
3-Using Sgnificant names/Identifiers(int age, String dob, String roll_n;)
 -for class,  enum and interface every word's fist letter should be capital
 -for method(function) except firtt word every word's fist letter should be capital 

-class is a template(blueprint ) for creating the objects
-object is defined as an instance of an class which is having its own attributes and behavior
-class public {} this class is also can be compile and intantiated

***Studnet st1 = new Student();[Student st1; st1 = new Student()]  (new Student(); this is object st1 is reference variable)
   st1 is a Reference variable and new will allocate memory, constructor will see what is to be created and then create Student object (constructor will initialise the object)
   new student refer a template class and new will make a new memory and it returns the address of allocated memory to st1.
   and if we don't assign anything to st1 then compiler will assign null to this
   
   new Student(); anonymous object

   int arr[] = new int[]; arr is a reference variable 
   
namespace or package(folder where multiple calsses can be group together) is logical group 
   

class A {
    public int a; this public can be acceseed anywher either in same package or outside package
    private int b; private will be accessed only in A
    protected int c; it is accessed everyclass in same packages and also to the subclass in other packges
}
 */

 









// class Marks{
// 	int id;
// 	float javaMarks;
// 	float cMarks;
// 	float cppMarks;
// 	void setMarks(int i,float j,float k, float l)
// 	{
// 		this.id=i;
// 		this.javaMarks=j;
// 		this.cMarks=k;
// 		this.cppMarks=l;
// 	}
// 	void displayMarks(){
// 		System.out.println("Id : "+id+"\nJava marks : "+javaMarks+"\nC marks : "+cMarks+"\nCpp marks : "+cppMarks);
// 	}
// }
// class Result extends Marks{
//     // Marks sb = new Marks();  we can't make objects like this without main class
//     float total = 0, avg = 0;
//         void compute() 
//         {
//             total = (cMarks + cppMarks + javaMarks);
//             avg =(total/3);
//         }
//         void showResult()
//         {
//             System.out.println("Total : "+total+"\nAvg : "+avg);
//         }
// }
// class A1_forall{
//     public static void main(String[] ak){
//         Marks mk = new Marks();
//         mk.setMarks(56, 34, 56, 57);
//         mk.displayMarks();

//         Result rs = new Result();
//         rs.compute();
//         rs.showResult();
//     }
// }






// class Marks{
// int id;
// float javaMarks;
// float cMarks;
// float cppMarks;
// void setMarks(int i,float j,float k, float l)
// {
// this.id=i;
// this.javaMarks=j;
// this.cMarks=k;
// this.cppMarks=l;
// }
// void displayMarks(){
// System.out.println("Id : "+id+"\nJava marks : "+javaMarks+"\nC marks : "+cMarks+"\nCpp marks : "+cppMarks);
// }
// }
// class Result extends Marks{
// // Marks sb = new Marks(); we can't make objects like this without main class
// float total = 0, avg = 0;
// void compute()
// {
// total = (cMarks + cppMarks + javaMarks);
// avg =(total/3);
// }
// void showResult()
// {
// System.out.println("Total : "+total+"\nAvg : "+avg);
// }
// }
// class A1_forall{
// public static void main(String[] ak){
// Result rs = new Result();
// rs.setMarks(56, 34, 56, 57);
// rs.displayMarks();
// rs.compute();
// rs.showResult();
// }
// }






