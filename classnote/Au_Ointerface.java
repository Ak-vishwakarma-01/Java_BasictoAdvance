/*
Interface connot inherits the class
Implemetns = using the elements of java interface in your calss
extends = Creating the subclass of the base class

multiple inheritance is not possible through classes in java but allowed through interfaces

class extends class
interface extends interface (inheritance)
class implements interfaces (inheritance)
class extends Class implements interfaces (inheriting class and interfaces together),extends comes before the implements 

Interface cannot be instantiated
*/

//interfaces are purely abstract all the methods are abstract in interfaces
interface Car // it is as same as class but it is provided multiple inheritance
{

}
// we can't inherite both the method with same name method(only one at once)
// with diff identifier

// we can't use fianl in the interface with the method
interface X {
  void demo();

  static void add(int a, int b) // Static method Never ingerited
  {
  }

  default void multiplly(int a, int b) {
  }

  public default void store() {
  }
}

interface Y {
  void test();
}

interface Z extends X, Y {

}

abstract class A {
  abstract void dummy();
}

class InterFaceDemo extends A implements X, Y {
  // total 3 abstract methods are inheriting in this class (demo, test, dummy)

  public void demo() { // without puplic we can't defince method of any interface class
    // Cannot reduce the visibility of the inherited method from X
    // If i will delete demo from the interface x then i can remove public
  }

  public void test() {
  }

  void dummy() {
  }

  public void multiplly(int x, int y) {
  }
}

/*
 * Car
 * brake();
 * accelerate();
 * 
 * class bmw{} class nano{}
 * 
 */

/*
 * interface X
 * {
 * abstract void text() m1
 * public default void demo(); m2
 * static final void dummy() {} m3
 * void check() {} m4
 * }
 * 
 * which of the following methods in the interface are not allowed?
 * m2,m3 and m4
 * m2 = if we write defalut or static then we need to give body to the methods
 * m3 = final is use when we need to prevent overriding and static method never
 * inherit and override that's why we can't use both
 * m4 = bydefault m4 is a abstract method and abstract method does'nt have body
 * 
 */

/*
 * interface A
 * {
 * int a = 10;
 * void demo();
 * public static void dummy() {sout("Static A");}
 * default void test(){sout("Deafalut A")}
 * }
 * interface B
 * {
 * int a=20;
 * void demo(int x);
 * public static void dummy(){Sout("Static B")}
 * default void test(){sout("Default B")}
 * }
 * class Myclass implemets A,B
 * {
 * //Minnummu How many methods must be overriddej?
 * void demo of A
 * void demo of B bocs both are overloaded
 * 
 * }
 */
interface M{
  int demo();
}
interface N{
  void demo();
}      // now we can't inherit both the calss(M and N) together