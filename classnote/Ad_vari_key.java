

/*
there is no garbage(we have default value when we not assign anything to any value) in java here we have cleaner which is called garbage collection process its a automatic process
-default value is not provided to the local variable(if i have created a local variable and not initialised it then it's not an error but without initialising using it this is an error)

**-In java memory(memory area) allocation is not don by os it is done by jvm
**-and the memory are three types(stack, heap and class area)
**-in stack fuction calls and local variable are stored
**-object are getting created in heap.
**-and all the static member are getting created in the class area

Variables : int [] arr; Student s; String str; (arr,s,str = these all are reference variable in java String is a class)
int x; char c; (x and c primitive datattype)

local Variable: it can be declared in a block but not in class, it may be loop,if-else,method,consturctor,switch-case or any other block then it is called local variable


Instance Variavle(property of an object ):  any variable which is declraed in body of a class is calles instance variable.
Every object have it's own instance of variable.


Class varable(property of a class): which is declared in the body of a class but it is qualified with static keyword.
class variable created at once and that will be shared to every obect, that's why we use static becose it is shared to every class object.
Ex. university name, branch name, group or section

                                Local Variable                            Instance Variable                                     Class Variable
Default Value                         NO                                      Yes                                                   Yes
Access Modifier                  NOt Allowed                                Allowed                                               Allowed      
*/

public class Ad_vari_key { // class is a template(blueprint ) for creating the objects
    int x; // here x is called instance variable = (property of an object)
    static int y; // Class variavle bcos it is qualified with the static keyword (property of class) and it will be shared to every object(same value)
    static public void main(String[] args){ // String[] args this is also called a local variable
        for (int i = 0;i<5;i++){
            System.out.println(i);
            int x=0;
        }
        Student s1 = new Student();// instance varible(name, cgpa) gets inintialized by this constructor(Student();) and static variabe gets initalized by the static block
        s1.University = "LPU";
        Student s2 = new Student();
        // now s2 also have the same value(LPU)
        int[] x={2,24,3,4};
        System.out.println(x.length);

    }    
}

//static block assing the default value to static members, it is not a constructor and it happens before the main function if its outside of main function
class Student{
    String name;
    double cgpa;
    static String University; // it will be created in class area 
    
}
