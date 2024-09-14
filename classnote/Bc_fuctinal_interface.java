
// which contain exatctly one abstract method is called functional interface
// which contain exatctly 0 abstract method is called Marker interface

// Lambda Expression represents the object of a Functional Interface.

@FunctionalInterface
interface X
{
    int sum(int a, double b);
}

public class Bc_fuctinal_interface {
    public static void main(String[] ak)
    {   
        // X ob1 = (int p, double q) -> {return (int)(p+q);};
        X ob1 = (int p, double q) -> (int)(p+q) ;
        // X ob1 = (p, q) -> p+q ; if both the perameter of same type int then we don't need to write the prameter type
        System.out.println(ob1.sum(5,1.5));

        X ob =  new X() 
        {
            public int sum(int x, double y) 
            {return 0 ;}
        };       
    }
}
