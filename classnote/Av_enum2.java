

enum fruit{
    Mango(60),Banana(40),Litchi(120);
    int price;
    fruit(int x){ } //constructor should have body
}

public class Av_enum2 {
    public static void main(String [] ak)
    {
        fruit [] fr = fruit.values();
        System.out.println(fr[1].price);
    }
}
