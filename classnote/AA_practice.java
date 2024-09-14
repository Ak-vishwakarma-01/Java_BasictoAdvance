class x{
    public static void main(String[] ak){
        System.out.println("x");
        
    }
    void demo(){}
    static void test(){}
}

class y{
    public static void main(String[] ak){
        System.out.println("y");
    }
}

class z{
    public static void main(String[] ak){
        System.out.println("z");
    }
}

class p{

}

/*
in the upper code we must compile with the file name but we can run with any class which is having main function whithout main function it will give an error like in p
C:\All codes\java code\classnote>javac Aa_practice.java

C:\All codes\java code\classnote>java x
x

C:\All codes\java code\classnote>java y
y

C:\All codes\java code\classnote>java z
z

C:\All codes\java code\classnote>java p
Error: Main method not found in class p, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

 */


public class AA_practice {
    public static void main(String[] ak){
        int arr[] = {21,34,9,12,76,32,45};
        AA_practice x = new AA_practice();
        // System.out.println(x.findDiff(arr));
        x.findDiff(arr);

    }

    private char[] findDiff(int[] array) {
        return null;
    }
}
