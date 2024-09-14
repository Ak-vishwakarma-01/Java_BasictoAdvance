
/*

In java by default every integer is int but every float is double 
Abstraction = like println , print their function hides behind

abstract >- keyword
abstract method :- is a method without the body which is usually qalified wiht abstract keyword.
abstract class  :- is a class which is qualified with abstract keyword
:-if your class contains any abstract method, then the class MUST be declared ABSTRACT.

we use keyword extends to inherit the class
when we inherit the class cunstroctor never inherited
*/

abstract class XYZ{  
    // void demo(){}
    abstract void demo();
    //only one will be allowed either the body or the abstract keyword
    //private members and constructors can never be inherited whenever we inherite a class
    
    private abstract void memo(); //The abstract method memo in type XYZ can only set a visibility modifier, one of public or protected
    // abstract is used so that inherited class can be implemented
    public abstract void tru();
}

// Now a is ineriting the class XYZ [The type A must implement the inherited abstract method of XYZ]
class A extends XYZ{
    void demo(){ System.out.println("my demo"); }

    // void tru();   //it must have public modifier 
    public void tru() { }  // if we deleter upper line then it will work
}


class B extends XYZ{
    void demo(){
        System.out.println("B");
    }
    public void tru() { }
}
// inheriting name demo every class would have this method(demo) during inheriting the class

/*
Which of the following is an invalid abstract method?
1-abstract void demo();
2-private abstract void demo();
3-void demo();
4-Bothe 2 & 3
*/

//abstract class can have or can't have abstract method
//abstract calss can't be Instantiated(making object of that class)
abstract class Car //final clas Car then it can't be inherited then we would need to remove bmw
{
    double mileage;
    Car()
    {
        System.out.println("");
    }
    void accelerate()
    {
        System.out.println("Accelerating....");
    }
    abstract void breake();  // if we write this abstract method then we have to declare bmw also abstract
    abstract void drive();   // the visivility of abstract method either public of protected

}
// to inheriting the class car we must have all abstract method of class car with body in this child class otherwise we need to make this class abstract
class bmw extends Car{
    void drive()
    {
        System.out.println("Driving BMW");
    }
    void breake(){ // now this class be intatiate  bcos we are giving body and calling dirve also 
     }
    public static void main(String[] ak){
        bmw ob = new bmw();  
        ob.accelerate(); // bcos main is a static and accelration is a non satatic.
    }
    Car ok = new bmw();  // parent refrence(class) can hold the refernce of child class
    // bmw kk = new Car(); // bcos child refrence(class) can't hold the reference of parent class
}


class At_abstraction_overloading {
    public static void main(String[] ak){
        
    }
}

//  numerical
// class Abc {
//     void ABC() {}
//     Abc(int a){ }
//     int Abc() {return 1; }
//     void Abc() { }
    
//     for oveloading only wee need to look at the name of the method and nu of paramete don't need to look at the initializer.
//     here last two line have error bcos both have same name but not oveloaded.
   
// }

/*
Compile time binding ()
-overloading is an ex of CTB


run time binding

Can an abstract parent class have non-abstract children?
4- Yes--an abstreact parent can have both abstract and non- abstract children. TRUE





*/
class overloading{
    void demo(long l){
        System.out.println("Long");
    }

    void demo(short l){
        System.out.println("Short");
    }
    void demo(float){
        System.out.println("Float");
    }

    public static void main(String [] ak){
        overloading ob = new overloading();
        ob.demo(5); // it will go for long bcos bydefault every integer is int and there is no int so it will go for widening
        
        float x = (float)234523.234;
        ob.demo(x);  // it will give an compiler error bocs by defalut every decimal is double and there is only float and double will never go for float bocos it's narrowing.
        
        byte p = (byte)3425.425;
        ob.demo(p);
    }
}


