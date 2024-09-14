
//redefining the parent class method in child class is called mthod overriding
//Overriding same name same parameter and accessibility can be inhance 
public class At_inheritance_demo1
{
    public static void main(String[] ak){
        bmw ob = new bmw();
        ob.buy(); //if ther is no buy methed in bmw then it will print buy of parent class car

        Car ok = new bmw();
        ok.buy(); // ok is a reference of Car but it is a object of bmw
        // during compile time it will go to class car and check that ther exists any mehtod buy or not so if we delete buy from class Car then it will give an error
        // during runtime it will check which object is this the ok then it will go to the boject class bmw then it will print buy of bmw
        //during runtime it will change according to the object       
    }
}
abstract class Car
{
    Car()
    {
        System.out.println("Car");
    }
    void buy() // for calling this fuction we need object of this class but using inheritance we can call it
    {
        System.out.println("Car can not be bought");
    }
    abstract void brake();
}

class bmw extends Car
{   
    bmw(){System.out.println("bmw"); } 

    void brake(){  // to inheriting the class car we must have all abstract method of class car with body in this child class otherwise we need to make this class abstract
        System.out.println("bmw brake");   // and we can also declare it after the @override
    }
    @Override //override innotation , now it will force you to follow the defenetion of overriding it will not let you make any other method after defing this, first we need to overide a function form parent class
    
    public void buy(){System.out.println("buy in bmw");}
    // @FunctionalInterface
}

//overriding is an example of runtime binding method
