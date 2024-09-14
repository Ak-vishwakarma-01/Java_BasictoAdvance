
/*utility classes - Which classes is provided to everybody
1-Date class
2-Java.utill* package it is also a utility class
ISO8601
YYYY-MM-DD
Ii8N
L10N Localization (Locale-It is a area where some convention is follows) 

//1st January 1970  00:00 Hrs
*/
public class Bf_UtilityClass1 {
    public static void main(String [] rk)
    {
        long l = System.currentTimeMillis(); //returns a value long value and declared as native(who is depended) it takes something form operating system
        System.out.println(l); // it will give the time from this date (1st January 1970  00:00 Hrs) now
        // if we pass the value this l then date calss will let us know the date
        System.out.println(new java.util.Date(l));
        java.util.Date date =  new java.util.Date(); // without importing the java.util.Date class
        System.out.println(date); // but it gives mixed value

        try{Thread.sleep(20000);}
        catch(Exception ex) {}

        java.util.Date date1 =  new java.util.Date(l);
        System.out.println("old time "+date1);
        System.out.println(new java.util.Date());

    }  
}
