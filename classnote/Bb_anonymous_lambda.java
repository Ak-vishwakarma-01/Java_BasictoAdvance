

//ANONYMOUS = It can extend exactly one class OR implement exactly one interface.
// Marker interface is a interface which does not contain any abstract method  

abstract class X { abstract void demo(); }

class Important
{

    // void veryImportant()      // statement 1
    // {
    //     System.out.println("Very Impotant Task done!");
    // }


    void veryImportant(X ob)  // statement 2
    {
        System.out.println("Very Impotant Task done!");
    }
}


// class Dummy extends X      // statement 2  we can use anonymoys class at the place of this class
// {
//    void demo() {} // durning meking the subclass of an abstract class we need to give body(override) to every abstract method
// }


public class Bb_anonymous_lambda {
    public static void main(String [] ak)
    {
        Important ob = new Important();
        // ob.veryImportant();   // statement 1
        

        // ob.veryImportant(); // statement 2 //now here we have to give the object of X but we can't make the object of X bcos it is abstract class
        // but we can create the object of the sub class
       

        // Dummy ob1 =  new Dummy(); // statement 2
        // ob.veryImportant(ob1);   // now it will work

        //annonymous class
        ob.veryImportant(new X() {   // instatiation at the time of declration, It is the object of the subclass of X 
        int p=1;   
        void demo(){System.out.println(p);} // declare all the abstract method
        void test() { }
        
        } );
    }
}
