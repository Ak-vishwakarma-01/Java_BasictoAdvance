import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class A1_11 {
    static Boolean flag = false;
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
static int H = sc.nextInt();
 if(B>0&&H>0)
    {
        flag = true;
    }else
    {
        System.out.print("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}// end of main

}// end of class

/*
 * 
 * 3.2 Reference Types
 * Java is an object-oriented language. An object is a collection of variables
 * and associated methods that is described by a class. The concepts in this
 * section that relate to objects are discussed in detail in Object-Orientation
 * Java Style.
 * 
 * The name of a class can be used as a type, so you can declare an object-type
 * variable or specify that a method returns an object. If you declare a
 * variable using the name of a class for its type, that variable can contain a
 * reference to an object of that class. Such a variable does not contain an
 * actual object, but rather a reference to the class instance, or object, the
 * variable refers to. Because using a class name as a type declares a reference
 * to an object, such types are called reference types. Java also allows the use
 * of an interface name to specify a reference type. In addition, array types in
 * Java are reference types because Java treats arrays as objects.
 * 
 * The two main characteristics of objects in Java are that:
 * 
 * Objects are always dynamically allocated. The lifetime of the storage
 * occupied by an object is determined by the program's logic, not by the
 * lifetime of a procedure call or the boundaries of a block. The lifetime of
 * the storage occupied by an object refers to the span of time that begins when
 * the object is created and ends at the earliest time it can be freed by the
 * garbage collector.
 * 
 * Objects are not contained by variables. Instead, a variable contains a
 * reference to an object. A reference is similar to what is called a pointer in
 * other languages. If there are two variables of the same reference type and
 * one variable is assigned to the other, both variables refer to the same
 * object. If the information in that object is changed, the change is visible
 * through both variables.
 * 
 * Java references are very similar to pointers in C/C++, but they are not at
 * all related to the C++ notion of a reference. The main difference between
 * Java references and C++ pointers is that Java does not allow any arithmetic
 * to be done with references. This, coupled with Java's lack of any way to
 * explicitly deallocate the storage used by reference type values, guarantees
 * that a reference can never point to an illegal address.
 * 
 * The formal definition of a reference type is:
 * 
 * It is possible to cause a reference variable to contain a reference to
 * nothing by assigning the special value represented by the keyword null to the
 * variable. The value null can be assigned to any reference variable without a
 * type cast.
 * 
 * Java does not allow reference types to be cast to primitive data types or
 * primitive data types to be type cast to reference types. In particular,
 * unlike C/C++, there is no conversion between integer values and references.
 * 
 * The only operation that Java provides for reference-type variables is the
 * ability to fetch the referenced object. However, Java does not provide an
 * operator to fetch the object referenced by a reference variable. Instead, the
 * object fetch operation is performed implicitly by the following operations:
 * 
 * A field expression that accesses a variable or method of a class or interface
 * object
 * A field expression that accesses an element of an array object
 * A type comparison operation that uses the instanceof operator
 * References Array Types; ClassOrInterfaceName 4.1.6; Class Types; Field
 * Expressions; Interface Types; null; Object-Orientation Java Style; Primitive
 * Types; The instanceof Operator
 ***********************************************************************************************************************************************************************************
 * 
 * 
 * 
 * Class Types
 * The name of a class can be used to specify the type of a reference. If a
 * variable is declared as a class type, the variable either contains null or a
 * reference to an object of that class or a subclass of that class. It is not
 * allowed to contain any other kinds of values. For example:
 * 
 * class Shape { ... }
 * class Triangle extends Shape { ... }
 * ...
 * Shape s;
 * Triangle t;
 * ...
 * s = t;
 * This example declares a class called Shape and a subclass of Shape called
 * Triangle. The code later declares a reference variable called s that can
 * contain a reference to a Shape object and another variable called t that can
 * contain a reference to a Triangle object. The value of s can be assigned to
 * the value of t because an object is not only an instance of its declared
 * class, but also an instance of every superclass of its declared class. Since
 * instances of the Triangle class are also instances of its superclass Shape,
 * the Java compiler has no problem with s = t.
 * 
 * However, saying t = s generates an error message from the compiler. Java does
 * not allow a reference variable declared as a class type to contain a
 * reference to a superclass of the declared class. The assignment t = s is
 * illegal because Shape is a superclass of Triangle. The assignment can be
 * accomplished if s is first cast to a reference to Triangle:
 * 
 * t = (Triangle)s;
 * The cast operation ensures that the object referenced by s is a class type
 * that is either Triangle or a descendant of Triangle. When you cast an object
 * reference to a subclass of the reference type, you are saying that you want
 * to treat the object being referenced as an instance of the specified
 * subclass. If the compiler cannot determine whether the argument of a cast
 * will be of the required type, the compiler generates runtime code that
 * ensures that the argument really is an instance of the specified subclass. At
 * runtime, if the class of the object being referenced is not an instance of
 * the specified subclass, a ClassCastException is thrown.
 * 
 * References Casts; Classes; Class Declarations; Object Allocation Expressions;
 * Runtime exceptions
 * 
 * Specially supported classes
 * Java provides special support for the String and StringBuffer classes. All
 * string literals are compiled into String objects. The result of a string
 * concatenation operation is a String object. An intermediate StringBuffer
 * object is used to compute the result of a concatenation operation. Because
 * operations on strings are generally based on the length of the string, Java
 * does not automatically supply a NUL character (\u0000) at the end of a string
 * literal. For the same reason, it is not customary for Java programs to put a
 * NUL character at the end of a string.
 * 
 * Java also provides special support for the Object class. This class is the
 * ultimate superclass of all other classes in Java. If a class is declared
 * without its superclass being specified, the language automatically specifies
 * Object as its superclass.
 * 
 * The throw statement in Java is special, in that it requires the use of a
 * Throwable object.
 * 
 * References Object; String; StringBuffer; String Concatenation Operator +;
 * String literals; The throw Statement; Throwable
 *******************************************************************************************************************************************************************************************************************
 * 
 * 
 * 
 * Interface Types
 * The name of an interface can be used to specify the type of a reference. A
 * reference variable declared using an interface name as its type can only
 * reference instances of classes that implement that interface. For example,
 * Java provides an interface called Runnable. Java also provides a class called
 * Thread that implements Runnable. This means that the following assignment is
 * allowed:
 * 
 * Runnable r;
 * r = new Thread();
 * The Java compiler does not allow a value to be assigned to a variable
 * declared using an interface type unless the compiler can be sure that the
 * object referenced by the value implements the specified interface. Casting a
 * reference variable to an interface type allows the variable to be assigned to
 * that interface type, because the cast operation provides its own guarantee
 * that the object implements the specified interface. Unless the compiler is
 * able to determine the actual class of the object that will be referenced at
 * runtime, the cast produces code that verifies at runtime that the object
 * being cast really does implement the specified interface. At runtime, if the
 * object being cast does not implement the required interface, a
 * ClassCastException is thrown.
 * 
 * References Casts; Interfaces; Interface Declarations; Object Allocation
 * Expressions; Runtime exceptions
 *************************************************************************************************************************************************************************
 * 
 * 
 * 
 * 
 * Array Types
 * An array is a special kind of object that contains values called elements.
 * Array elements are similar to variables in that they contain values that can
 * be used in expressions and set by assignment operations. Elements differ from
 * variables, however, in that they do not have names. Instead, they are
 * identified by non-negative integers. The elements in an array are identified
 * by a contiguous range of integers from 0 to one less than the number of
 * elements in the array. The elements of an array must all contain the same
 * type of value; the type of the array is specified when the array is created.
 * 
 * An array-type variable is declared as follows:
 * 
 * int [] a;
 * This declaration specifies that the variable a refers to an array of int
 * values. Java actually allows two styles of array declarations: the one shown
 * above and a style that is more like that used in C/C++. In other words, you
 * can put the square brackets after the variable name instead of after the
 * type:
 * 
 * int a[];
 * Technically, all arrays in Java are one-dimensional. However, Java does allow
 * you to declare an array of arrays, which is a more flexible data structure
 * than a multi-dimensional array. The additional flexibility comes from the
 * fact that the arrays in an array of arrays do not have to be the same length.
 * Because arrays of arrays are typically used to represent multi-dimensional
 * arrays, this book refers to them as multi-dimensional arrays, even though
 * that is not precisely correct.
 * 
 * A multi-dimensional array is declared using multiple pairs of square
 * brackets, as in the following examples:
 * 
 * int [][] d2; // Refers to a 2-dimensional array
 * int [][][] d3; // Refers to a 3-dimensional array
 * When you declare a variable to refer to a multi-dimensional array, the number
 * of dimensions in the array is determined by the number of pairs of square
 * brackets. Whether the brackets follow the type name or the variable name is
 * not important. Thus, the above variables could have been declared like this:
 * 
 * int [] d2[], // Refers to a 2-dimensional array
 * d3[][]; // Refers to a 3-dimensional array
 * The actual length of each dimension of an array object is specified when the
 * array object is created, not when the array variable is declared. An array
 * object is not created at the same time that an array variable is declared. An
 * array object is created with the new operator. Here are some examples:
 * 
 * int j[] = new int[10]; // An array of 10 ints
 * int k[][] = new float[3][4]; // An array of 3 arrays of 4 floats
 * The arrays contained in an array of arrays can also be of different lengths:
 * 
 * int a[][] = new int [3][];
 * a[0] = new int [5];
 * a[1] = new int [6];
 * a[2] = new int [7];
 * Although the first new operator is creating a two-dimensional array, only the
 * length of one dimension is specified. In this case, just the array of arrays
 * is created. The subarrays are created by the subsequent new operators.
 * 
 * The expression used to specify the length of an array does not have to be a
 * constant. Consider the following example:
 * 
 * int[] countArray(int n){
 * int[] a = new int[n];
 * for (int i=0; i<n; i++) {
 * a[i]=i+1;
 * }
 * return a;
 * }
 * The number of elements in an array object is fixed at the time that the array
 * object is created and cannot be changed.[2] Every array object has a public
 * variable called length that contains the number of elements in the array. The
 * variable length is final, which means that its value cannot be changed by
 * assignment.
 * 
 * [2] The standard class java.util.Vector implements an array-like object with
 * a length that can be changed.
 * 
 * The Java notion of arrays is fundamentally different than that of C/C++.
 * Subscripting a Java array does not imply pointer arithmetic, so there is no
 * danger of an out-of-range index accessing memory that shouldn't be accessed.
 * Array objects in Java detect out-of-range subscripts; when they do they throw
 * an ArrayIndexOutOfBoundsException. And unlike C/C++, arrays of type char are
 * not strings in Java. Instead, Java uses the String class to support strings.
 * 
 * Although array objects are reference types, array objects are different from
 * other kinds of objects. The Object class is the parent class of all array
 * objects, but array objects do not really belong to a class of their own. An
 * array object inherits all of the variables and methods of the Object class.
 * Every array also defines the variable length, but there is no class
 * declaration for an array type.
 * 
 * References Variable initializers; Array Allocation Expressions; Index
 * Expressions; Object; String
 * 
 * 
 */