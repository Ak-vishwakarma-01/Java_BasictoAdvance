
/*
Based on the Number of Operands:
Unary operator: [++,--,!,+,-] , x++, --y, -a, !p;
Binary operator
Ternary Operator: If then else[?:] condition ? statement1 : statement2; if condition is true then statement1 will print otherwise statement2
                                               statement must be single not multipel satatemnt  

Based on type of operands:
+
&
arithmetic: +,-,*,/,%
Relational:<,>,==,!=,<=,>=
Logical:!,&,|,^,&&,||
Bit-wise operator: ~,&,|,>>(rigth shift),>>>(unsigned right shift),<<(left shift)

In Java, we have 5 arithmetic operators(binary): 
+	        Used for addition and string concatenation
-	        Used for subtraction
*	        Used for multiplication
/	        Used for division
%	        Remainder/Modulus operator for finding remainder

Relational operator: 
<, >, ==, !=, <=, >=

logical operator:
!, &, |, ^, &&(shortcircuit and), || (shortcicuit or)

Bit-wise operator:
~, &, |, ^, >>, >>>, <<

Operator	Description
+	Unary Plus, used for indicating a positive value
-	Unary Minus, subtracts from zero.
++	Increment operator. Increments the value by one.
--	Decrement operator. Decrements the value by one.
!	Negation operator. Negates a boolean value.
According to Java coding conventions, no space should be provided between a unary operator and operand.

In Java, = is the assignment operator
every operetor in java works on minimmum on int level


int x = 3 , y = 4;
!:   !(x>y) it will give true
&:   x>0 & y<3  false bcos one is false and one is true.
|:   x<0 | y>2  true bcos one is true.


&& in short circuit and when 1st condition is false then it will not go to the 2nd condition.
|| in short circuit or  when 1st condition is true  then it will not go to the 2nd condition.
if(x !=0 && y/x > 0)

*/

public class Ae_arith_ratio_logica {
    public static void main(String[] ak){
        int x = 5 , y = 3;
        // int z = x--<++y ? --x : y++; // here first y++ first assign the value then increment
        int z = x-- > ++y ? --x < y++ ? x : ++x : ++y ; // before going to next statement or condition we will update all the vlaue of first conditon
        // before going to first statement then x becom 4 and y is also 4 then --x < y++ now x =3 and y is also 4 then 3 < 4 it is true then z = 3 = x and y= 5 
        System.out.println(z);

        int a = 3 , b = 2 ;
        int c = a-- != ++b ? --a: ++a < b-- ? --a : ++b; 
        System.out.println(""+a+b+c);

        
        int p =3, q=5, r=2;
        if(p-- < ++q | --q > ++r ) 
        p++;
        System.out.println(p+" "+q); //here the ans is 53 but if we have used the ||  then it would be 43 becos 1st is true then it would not go to the 2nd conditon
    

        // x +=y(internal oprtn);   x = x + y (external operation); both give same value but both are not same
        char m = 65;
        // m = m+1 ; //incompatible types: possible lossy conversion from int to char
        m += 1; // but this will work bcos it takes 1 inside the m then add it and in upper code it take m outside and add 1 then it is trying to put that updated value into m aging and now this updated value become an integer
        m++; // also work
 
        
    }
}
