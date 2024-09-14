/*
Inheritance is a way by which a class can inherit what is already there in another existing class.

We can classify inheritance into two kinds:
Implementation Inheritance (or code inheritance)
Interface Inheritance (or inheritance of behaviour or contract)

Java, we use extends keyword when we want a class to inherit (extend) from another class. For example:
class A {	
	...
}
class B extends A {
	...
}
In the above code B extends A. B is called the subclass of A. A is called the super class of B.





class W { // statement 1
}
class X { // statement 2
	...
}
class Y extends X { // statement 3
	...
}
class Z1 extends W, Y { // statement 4
	...
}
class Z2 extends Y { // statement 5
	...
}
As per statement 5, Z2 is the subclass of Y, X and Object.



class A {	
	public int aValue = 1;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 2;
	public int getBValue() {
		return bValue;
	}
}
In the above code, class B also contains the inherited feild aValue and the inherited method getAValue()
*/


public class At_inheritance_demo2 {
    
}
