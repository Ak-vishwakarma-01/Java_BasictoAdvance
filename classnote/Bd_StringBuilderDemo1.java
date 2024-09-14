
/*
String = Immutable
StringBuilder = mutable and non-synchronized 
StringBuffer =  mutable and Synchronized

int length();
int capacity();    both are different
*/

public class Bd_StringBuilderDemo1 {
    public static void main(String [] ak)
    {
        StringBuilder sb = new StringBuilder(); // no argumeted but still capacity will be 16 and length will be zero
        sb.length();        //=0
        sb.capacity();      //=16


        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.length();      //=5
        sb1.capacity();    //16 + 5 = 21
        

        //defining capacity inside the Stringbuilder
        StringBuilder sb2 = new StringBuilder(10); 
        sb2.length();    //=0
        sb2.capacity();  //=10



        StringBuilder sb3 = new StringBuilder('A');
        System.out.println(sb3.length()+"  "+sb3.capacity());
        //output = 0   65 bcos A is a character here not string
    
    
        StringBuilder sb4 = new StringBuilder(5);
        sb4.append("Hello");
        System.out.println(sb4.length()+"  "+sb4.capacity()); // output = 5   5
        sb4.append("Ankit"); // here capacity is 5 and we have filled it with Hello now we have to add Ankit so jvm will add minimum((previous capacity + 1)*2) = 12(capacity)
        // only first time it will do the previous process if the requirement is more than 12 then it will just increase the remaining space only upto the requirement(see the sb5 example)
        System.out.println(sb4.length()+"  "+sb4.capacity()); // output = 10  12
        sb4.append("af1");
        System.out.println(sb4.length()+"  "+sb4.capacity());


        StringBuilder sb5 = new StringBuilder(5);
        sb5.append("Hello");
        System.out.println(sb5.length()+"  "+sb5.capacity());
        sb5.append("ankit kumar"); // now here it will not add 1 more in old capacity and multiply with 2 it will increase the upto the requirements
        System.out.println(sb5.length()+"  "+sb5.capacity());
        // sb5.ensureCapacity(50); // it will make capacity 50 
        sb5.ensureCapacity(20); // now it will not make it 20 if we give 50 otherwise it will make ((old capacity + 1)*2) = 34 and if we give 16 at the place fo 20 then capacity will be same as 16 bxose it's completeing it's requirement        
        System.out.println(sb5.length()+"  "+sb5.capacity()); 
    
    
        StringBuilder sb6 = new StringBuilder("Hi"); // 16 + 2 =  18
        sb6.ensureCapacity(20);  // it will make it (18 + 1)*2 =  38
        sb6.ensureCapacity(40);  // it will make it (38 + 1)*2 =  78
        sb6.append("Ravi");
        System.out.println(sb6.capacity());
    }
}
