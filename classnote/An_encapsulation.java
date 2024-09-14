/*
Encapsulation is a feature in object-oriented languages, like Java where we can selectively hide the data and members, so that they are not accidentally corrupted by code.

it's like capsule that capsule hide some crystle and powder type of medicine
putting content inside capsule of a class ({opening and closing braces}) it protects the data from unauthorized(uncertified,unliscenced,undecided,unallowed) accessed
package q1234    q1234 it is keyword
package don't allow to create obj of class without importing the package 
and we can't access any where alse we access it inside the same file not in another even if 

import k20bg;  // we can't use two packages for single class or in single file
class Student  
{

}
If anyone want's to use the feature of the class student in another file but the same package(folder) then he need to import the package k20bg(import k20bg.*)
there are two ways to use features of the class
1 = Instantiation (create the obj of class(student) and access it's features)
2 = Inheritance
(when we write final class student then it will not be inherited only instatiation)
(abstract class Student then we can't make any object of that class) not instatiation only inheritance.
abstract final class Student is not possible (compilation error)
without importing we can use like(k20bg.Studnet) 
java.util.Scanner sc = new java.util.Scanner   //if we don't import the Scanner class
*/ 


/*
one class can not be in two packages


In Java related classes and interfaces can be stored together in folders known as packages.
For example in Java, all the common classes like String, System etc which we have used are in a package called java.lang.

There are many such packages in Java, for example:
java.util - this package contains utility and data structure related classes like Date, ArrayList, HashSet, etc., which we will learn later.
java.io - this package contains classes which help in reading input and writing output to files and streams.
java.net - this package contains networking related classes.
If we want to use a Date class which is in java.util package in our class, we need to inform Java compiler that we are interested in using the Date class of java.util package.

This can be done in the below three ways, either by using an import statement or fully qualified class name:
By importing all class of java.util package - import java.util.*; - this statement should occur above the class declaration.
By importing only the required class of java.util package - import java.util.Date; - this statement should occur above the class declaration.
By directly using the fully qualified name of the class in the declaration statement - java.util.Date date = new java.util.Date(); - we need not have an import when we do this.
Note: java.lang package which contains all commonly used Java classes is by default imported. Which means for using a String or an Integer or the System class and the like, one need not import the java.lang package.

*/
