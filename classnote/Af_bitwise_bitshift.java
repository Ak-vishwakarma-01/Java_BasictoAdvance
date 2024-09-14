//Bit-wise operator: ~,&,|,>>(rigth shift),>>>(unsigned right shift),<<(left shift)
public class Af_bitwise_bitshift {
    public static void main(String[] args){
        
        int x = 22 << 1;
        System.out.print(x);
        

        x = 19;  // 00--00 00010011    19
        short y=5;   // 00--00 00000101    5
        System.out.println(~x+"\n"+(x&y)+"\n"+(x|y)+"\n"+(x^y)); // ~ it will invert the bit
        // 11--11 11101100  ~  it's msd is 1 so it's a negative nu that's why we have to take 2's complemetn otherwise not 
        // 2's compliment  00--00 00010100 from going to right to left when we get 1 except that 1 we will invert all the value 
        //^ this is exor if both the bit are same then 0 otherwise 1
        

        //11101100   -ve number so from going to right to left when we get 1 except that 1 we will invert all the value left side of the 1 
        //00010100   so this is 2's complement now this nu is -20


        
        x = 7 ; y = 9 ; // 7 = 00000111    9= 00001001
        System.out.println(~(x|y)); // 7|9 = 00001111  then we will made it ~(00001111) = 11110000 then 2's complement bocs we have 1 in last and 
                                    // it is negative so 00010000 we leave the last one(from right side) as it is when we make 2's complement = -16
        //num<<bits  :binary left shift        multiplied 2^bits
        //num>>>bits  :unshigned right shift   divided by 2^bits
        //num>>bits  :binary right shift       divided by 2^bits in this case if msb is 0 then it will put all shift bits as 0 and vice verca
        
        /*
        21>>>2 
        00000000 --- 000010101 >>> 2  the last 0 and 1 will shift and to beggining as a zero
      00 00000000 --- 0000101   == 5
        

        -21>>>2         00000000 --- 00010101 ==21
        2's complement  11111111 --- 11101011 >>>2 taking 2's complement to make it -ve the last 2 value 11 will shift to beggining as a zero
                        00  11111111 ---111010  (-21/4 = -6)  again take 2's complement and then that is the answer
                        00  00000000 ---000110  == -6
        

        27<<2; // number multiplied by 2^bits
        00000000 -- 00011011      27 then for left shift we add zero in the beggining as much nu we have to shift
          000000 -- 0001101100    108 ans;
        

        unshigned right shift  
        27>>>2   27 = 00000000 -- 00011011 >>> 2 now we will cut this 11 from the last and will add it into beggining as a zero
                  00 00000000 -- 000110 = 6       : 27/4==>6 
        

        -15 >>> 2;   0000 -- 00001111  taking 2's complement to make it -ve 1111 -- 11110001
               and we will shift last two nu in the begginig as a 0 but in the begining it is one so we will also make it one
               1111--11111100 ...ans
        
               
        which of the following shift operator can be used to multiply a negative integer by 8(left shift << either it is positive or negative)
     
        */
    }
}
