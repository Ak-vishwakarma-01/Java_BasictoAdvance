
/*
class/interface/enum when defined inside any class/interface.
class Outer
{
    class Inner
    {
        Class InnerMost
        {

        }
    }
}
*/
class Person // it can't be private 
{
    class VoterId  //but nested class have any access modifier
    {
        
    }
    static class AadharCard
    {

    }
}


class Az_nested_class
{
    public static void main(String [] ak)
    {
        Person p = new Person();  
        // Person.VoterId x = new Person.VoterId(); //it will not work bcos it is non static
        //first we need to make object of outer class then only i can create the object of nonstatic inner class
        Person.VoterId x = p.new VoterId(); // it means the object of the inner class gets created inside the object of outer class

        Person.AadharCard ob = new Person.AadharCard();  //bcos static nested class can only accessed with name of the parent class
        
    }  
}