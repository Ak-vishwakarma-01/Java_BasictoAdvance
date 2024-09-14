
/*
1-Constructor is used to intialize the newly created object with default vlaues.
2-A constructor is used to create instances of a class.
3-A constructor is a special method which does not have a return type.


*/
class Aq_constructor1 {
    Aq_constructor1() // constructor does'nt have return type
    {
        System.out.println("A");
    }
    {  // initializer or anonymous block it will be copied in the beggining of every constructor
        System.out.println("B");
    }    
    static
    {      // static block it will be executed before the main fuction so first c will be printed
        System.out.println("C");
    }
    void Aq_constructor() // this is mathod bcos it is a return type (void) with the same name of the class(method can have any name but it must be a return type)
    {
        System.out.println("D");
    };
    
    public static void main(String[] ank){
        Aq_constructor1 a = new Aq_constructor1();
        System.out.println("E");                                                                       //output will be CBAE
    }
}
