
/*lambda is used only for functional interface
charsequence is a parent of string stringbuffer and stringbuilder
Runnable is a functional interface

*/
public class Be_lambda {
    static public void main(String [] ak)
    {
        A ob = (x , y) -> x*y; // we don't need to write int here bcos both the parameter are of type int
        // Here lambda is object of a and anonymous method of functional interface A(multiply)
        System.out.println(ob.multiply(5, 10));


        A  ob1 = (p , q) -> p+q;
        System.out.println(ob1.multiply(5,9));

        //multithreading
        Runnable r1 = () -> {
            for(int i =1; i<11;i++ )
            {
                System.out.println(i);
                try{Thread.sleep(700); }
                catch(Exception ex)   {}
            }
        };
        Thread t1 = new Thread();
        t1.start();

        

        Runnable r2 = () -> {
            for(int i =65; i<92;i++ )
            {
                System.out.println((char)i);
                try{Thread.sleep(700); }
                catch(Exception ex)   {}
            }
        };
        Thread t2 = new Thread();
        t2.start();
        
        
    }
}


@FunctionalInterface
interface A
{
    int multiply(int a , int b);
}