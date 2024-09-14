
/*
this keyword is use to call the constructor of the same class and also reference to the corrent object of that class
super:- reference to the parent object
and these both(this,super) are not static so we can't use it in static scope
and these two must be the first statement inside the constructor
*/
public class Aq_this_super {
    static public void main(String[] ak){
        Demo ob = new Demo();
        Student s =new Student("Ankit",1);
        System.out.println(s);
    }    
}
class Demo{
    // default value is assigned by object class constructor(java.lang.Object()) if it is a instance variable
    // and if it is a static member then default vlaue is provided by static block which is declard in java.lang.Object
    Demo()
    {   this(1,3); // constructor chaining (first it will call the two parameterized constructor[professional then lovely])
        System.out.println("Lovely "); 
    }
    Demo(int x)
    {
       //super();It will check every constructor of your class and if there is not this and super at the first statement then compiler will put a super with no parameter
       // super will call the parent class and here there is no parent class then bydefault it consume the object class as a parent class
       System.out.println("University ");
    }
    Demo(int x,int y)
    {   this(5);// the control will transefer form here to 1 parameterized construcor
        System.out.println("Professional ");
    }

    /*
    Demo()    
    {   this(5);
         System.out.println("Lovely "); 
    } 
    Demo(int x)
    {  this(3,4);
       System.out.println("University ");    // this will give an error bcos here it is forming a loop
    }                                         recursive constructor invocation
    Demo(int x,int y)
    {   this();
        System.out.println("Professional ");
    }



    Demo()
    {   this(5,5);
         System.out.println("Lovely "); 
    }
    Demo(int x)
    {  
       System.out.println("University ");    // this will give an error bcos here it is forming a loop
    }
    Demo(int x,int y)
    {   this();
        System.out.println("Professional ");
    }
    */
}

class Student{
    int roll;
    String name;
    /*  
    Student(String x,int roll_num){
       name = x;
       roll = roll_num;
    }*/

    // but if we write like this (this keyword is being used in name conflict)
    Student(String name,int roll_num){
        this.name = name;  //this.name mean class's name
        this.roll = roll_num;  //this.roll mean class's roll
     }

    public String toString() // when we print the object of the class then this toString method will be printed
    {
        return "my name is "+name;
    }
}    