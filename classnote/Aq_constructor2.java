
/*
public class Student {  = The public type Student must be defined in its own file
0-default constructor It is provided by the compiler if there is not any constructor in the class
1-default const is non argumented constructor 
2-it's visibilty depend on the class if it's public then it is also bublic if it is default then it is also default.

*/
class Student{
  /*constructor can not be static and can not be final bcos it can't be inherited
    OVERLAODING:- neccessary and sufficient condition is "same name,different parameter(type/number)" (for both method or constructor)
    */ 
    int roll;
    String name;
    double cgpa;
    //privet means accesible only within the class
    private Student() { }
    protected Student(String n) {name = n;}    // parameterized constructor = so default constructor will not be provided
    public Student(int roll){} // this is overloaded (don't need to see string or int)
    // private Student(int c){}                 // this is not overloaded becos both are int(roll and c) 
    // private Student(int c , int k){}         // this is overloaded bcos ther are two int parameter

}
 class Aq_constructor2{  
    public static void main(String[] ank){    
        // if any const provided by ourside then compiler will not provide default const then default const will be removed by compiler
        Student s = new Student("Ankit"); // If I remove Ankit from that then it will give an erro bcos the Student const is private and here default will not work  
        System.out.print(s.roll+"\t"+s.name+"\t"+s.cgpa);
        
        Demo obj = new Demo();  //it will call default or without aurgumented constructors
        obj.Demo(); 
    }
}
class Demo { 

    void Demo(){System.out.println("Demo");} //this is method bcos it is rturn type
    Demo(){System.out.println("Demo");} // this is constructor
    
    // now it wil compile
    // void demo(){System.out.println("Demo");} 
    // void demo(){}      // this both will also not compile bcos both are same 
    // int demo(){return 1;} // is is alos not allowed with the void 
    

}


/*
public static void main(Sring[] ank) <- method header{
    this is method body
    main(Sring[] ank) <- this is method signature
    if same name and different signature then it is called overloading
    signature = it includes name and prameter list return type never included in signature
}
    RetType-Identifier-(parameter list)  every method need to be in this sequnce only
    int add we can't write like this add int

    and all the thing we can change
    final static public
    or static final public 
    or public static final

*/

// class Abc
// {   // find error
//     void ABC(){}  //l1  method
//     Abc(int a){} //l2
//     int Abc() {return 1;} //l3  method bcos of int
//     void Abc(){}  //l4    it is also method 
//     // bcos l3 and l4 both are same name method without overloading
//     // when method name are same then we need to overload


//    void demo(int a){}
//    int demo(int x,int y){return 1;}
//    void demo(float f){} 
//    // All these three method are overloaded
// }


//when we call any constroctor or any fuction then compile time binding is done
//runtime binding (runtime polymorphism)
// class Overloading{
//     void demo(long l)
//     {
//         System.out.println("long");
//     }
//     void demo(short l)
//     {
//         System.out.println("short");
//     }
//     void demo(float l)
//     {
//         System.out.println("float");
//     }
//     public static void main(String[] ak){
//         Overloading ob = new Overloading();
//         ob.demo(5); //compile time binding is done
//         //bydefault float is double
//         //it will not go to short
//         //then long>float  so it will go for long
//         ob.demo(5.45464);//byte then it will go for byte
//         ob.demo(3343254);

//         //it will go for bidning with the nearest one
//     }
// }