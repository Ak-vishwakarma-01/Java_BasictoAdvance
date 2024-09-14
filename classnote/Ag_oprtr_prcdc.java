

public class Ag_oprtr_prcdc {
    public static void main(String[] args){
    
    char p = 65 ,q=2; // valid
    p++; // it will print B and this is valid
    // p = p + 1 ;  // but it is not valid bcos thsi is external opratn
    // p += q+2; // this is valid
    System.out.println(p);

    // int t=3,r=5,g=2;
    // if(t++<--r | --r > ++g) { // 1st r=4 and t=3 condition true then t=4(t++) , 2nd r=3 and g=3
    //     t++;   // t=5
    // } System.out.println(t+""+r); // output = 53   
    
    int x =3,y=5,z=2;
    if (x-->++y | --y > ++z){
        x++;
        System.out.println(x+""+y);
    }

    // int x = 5, y=3;
    // x+=y;// internal oprtn
    // x = x+y; // external oprtn

    // byte a = 5, b = 3;
    // byt3 c =  a+b;  // bcos + will convert a and b into int and we can't give int to byte

    }
}
