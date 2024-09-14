import java.math.BigDecimal;
import java.math.MathContext;

public class Ap_bigDecimalandmathcontext {
    public static void main(String [] ak){
        BigDecimal big = new BigDecimal("342346532343534325454"); //It is use to store big decimal and float value
        System.out.println(big);
        MathContext math = new MathContext(4); //It's a math funciton class
        BigDecimal smal = new BigDecimal("34.3243223235443", math);
        System.out.println(smal); // output = 34.32

        //Float.isNaN()  and Double.isNan()  is to check a value that nu or not
        double x = 0d/0d;
        System.out.println(x==Double.NaN);
        System.out.println(x==Float.NaN);
        System.out.println(Double.isNaN(x));
        

        double p = Float.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(p);
    }
}
