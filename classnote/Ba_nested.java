
/*non static nested class can can be accessed as with static and non static member of outer class even it is privated nested class
Local variable =  is a variable which is defined inside a local class
*/

class Outer
{
    int x = 5;
    static int y = 25;
    
    void demo()
    {
        int a  = 10; // loval variable , we can't use any access modifier with local variable(except final) bcos it is only usable in block 
        // MyLocal ob = new MyLocal() ; // this is not possible 

        // a++; // now a is not effectively final, if we will access it in myLocal then it will give error(only final or effectively final Local variavle can be accessed)
        
        class MyLocal{ // same with local class we can use access modifier except final     
            /*any non static nested class inside a block is called LOCAL CLASS and i can make it inside if else block
             And local class can never be static  
             and the object of local class can only be created only in the block in which it is created
             */
             void show()
            {
                System.out.println(x+ " " + y+" "+ a); // this class can access static and non static member of outer class
            }
        } 
        
        MyLocal ob = new MyLocal() ; // this is possible 
        ob.show();

    }
    class Inner // this is non-static nested(inner) class not a local class
    {

    }
    static class Nested{}  // static nested class

}

public class Ba_nested {
    public static void main(String [] ak)
    {
        Outer ob =  new Outer();
        ob.demo();
    }
}

