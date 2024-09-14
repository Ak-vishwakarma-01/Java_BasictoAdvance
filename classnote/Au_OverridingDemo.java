abstract class fruit
{
    abstract void eat();
}


class Apple extends fruit //concrete
{
    void eat() {System.out.println("Eating apple");} //override = redfining parent class method in child class with same name same parameter
}


class greenapple extends Apple
{
    // public void eat() // we can't make it private
    // {
    //     System.out.println("Eating Green Apple");
    // }
    

    @Override
    void eat() // we can increase the accesibility of the overriden method but we can't reduce
    {
        System.out.println("Eating Green Apple"); // if this class would not be presetn then it would print eat method of Apple
    }
}
class Au_OverridingDemo
{
    public static void main(String[] rk)
    {
        greenapple ob = new greenapple();
        ob.eat();           // Eating Green Apple
   
        Apple ok = new Apple();
        ok.eat();          // Eating apple

        Apple on = new greenapple();
        on.eat();         // Eating Green Apple
    }
    
}

