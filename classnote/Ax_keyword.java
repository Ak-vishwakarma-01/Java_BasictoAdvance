
// super is use to chaining of parnet class constructor
class Parent 
{
    int x = 10;
    Parent() //if we write like this parent(int a) then default super will give an error and for removing this error we will add our own argumented super in chold class
    {   //super();  2
        System.out.println("Parent");
    }
    Parent(String n)
    {   
        System.out.println("Parent string wala");
    }
    void demo(){System.out.println("Parent Demo");}
}

class Ax_keyword extends Parent
{
    int x = 50;
    Ax_keyword()
    { //super();  1
        super("y"); // for the string constructor
        System.out.println("Child");
    }
    void demo() //overriding
    {   //super.demo();
        System.out.println("Child Demo"+x); //super.x 
    }    

    public static void main(String [] ak)
    {
        Ax_keyword c = new Ax_keyword(); // this will check is there const or not in child class id not then it will add default other wise it will check the 
        // first statement of the the child const if there is not this  or super key then it will add a super key with no arg in that cons as same is parent also
        c.demo();//it will print the method of child
    } 
}
//super.x      is use to exces the variable of parent class
//super.demo() is use to exces the method of parent class
//super();     is use to exces the constructor of the parent class with use of const of child class

