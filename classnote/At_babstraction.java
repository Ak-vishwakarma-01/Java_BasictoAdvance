class Car // final clas Car then it can't be inherited then we would need to remove bmw
{
    double mileage;

    Car() {
        this(43);
        System.out.println("this is constructor of Car: ");
    }

    void accelerate() {
        System.out.println("Accelerating....");
    }

    Car(int a) {

        System.out.println("this is argumented constructor of class Car: ");
    }

}

// to inheriting the class car we must have all abstract method of class car with body in this child class otherwise we need to make this class abstract
class bmw extends Car {
    void drive() {
        System.out.println("Driving BMW");
    }

    void breake() { // now this class be intatiate bcos we are giving body and calling dirve also
    }

    public static void main(String[] ak) {
        bmw ob = new bmw();
        ob.accelerate(); // bcos main is a static and accelration is a non satatic.
    }

    Car ok = new bmw(); // parent class can hold the refernce of child class
    // bmw kk = new Car(); // bcos child class can't hold the reference of parent class
    
}

public class At_babstraction {
    public static void main(String[] ak) {
        Car c1 = new Car(); // when we are making an object of the Car then it calls the class car there is no argumented constructor it always call that constructor
        // c1.accelerate();
    }
}
