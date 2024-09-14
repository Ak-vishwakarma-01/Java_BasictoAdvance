

public class Bd_StringBuilderDemo3 {
    public static void main(String [] ak)
    {
        StringBuilder s = new StringBuilder("Hello");
        s.insert(6, "World"); //we can insert it at nu 5 not at 6 that's why it is giving an error bcos length of hello is 5(0 - 4)
        //And this is not compiler error this is StringIndexOutOfBoundsException: String index out of range (run time error)
        System.out.println(s.capacity());


        // StringBuilder s1 = new StringBuilder("Hello");
        // // s1.replace(3,6,"World"); // helWorld
        // // s1.replace(7,9,"asgg"); // It will give rum time error
        // s1.delete(3,5);
        // s1.delete(4,9); // ti will also give same error  StringIndesOutOfBoundsException:
        // System.out.println(s1);        
    }
}
