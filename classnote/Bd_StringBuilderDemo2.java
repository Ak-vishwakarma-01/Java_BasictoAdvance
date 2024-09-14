

public class Bd_StringBuilderDemo2 {
    public static void main(String [] ak)
    {
        // StringBuilder sb =  new StringBuilder("This is a Car");
        // sb.insert(7,"AAA"); // This isAAA a 
        // System.out.println(sb);

        // StringBuilder sb1 =  new StringBuilder("I like java programming");
        // sb1.delete(7,12); //I like programming or (7,12)
        // sb1.replace(7, 12,"Python"); // output = I like pythonamming : bcos index is increasing that's why it deletes some letter
        // System.out.println(sb1);
        

        String str = "ankna";
        StringBuilder sb2 =  new StringBuilder(str); // bcos we can't use reverse method in a normal string
        sb2.reverse();
        String rev =sb2.toString();
        if(str.equals(rev)) System.out.println(str + " is  a palindrome");
        else System.out.println(str + " is Not a palindrome"); // everytime it will give non palindrome when we use equals with sb2 without changing toString() here
        

        if(str.compareTo(rev)==0) System.out.println(str + " is  a palindrome");
        else System.out.println(str + " is Not a palindrome");
    }
}
