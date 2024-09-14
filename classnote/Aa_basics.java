
/*



access modifier is not allowded with local variable.
private and protected are not allow to the outer class.
default can only used with in the package.


In computers we normally use four different numbering systems - Decimal, Binary, Octal and Hexadecimal.

--and we start any number form 0 then it become octal and when 0x then hexadecimal and when 0b then binary 

Decimal = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
--For example, Three Hundred and Twenty One is represented as 321, where
--321 = (3 * 10^2) + (2 * 10^1) + (1 * 10^0)
--321 = (3 * 100) + (2 * 10) + (1 * 1)
        [100's]      [10's]      [units]

Binary = In a Binary number system we use 0's (zeros) and 1's (ones) as the only symbols
--In Binary System, decimal 3 is represented as 0b111
--0b111 = (1 * 22) + (1 * 21) + (1 * 20) = (4 + 2 + 1)


Octal = In Octal System (base-8) a total of 8 digits (0, 1, 2, 3, 4, 5, 6 and 7) 
--In Octal System, Decimal 8 is represented as 10
--8 = (1*81) + (0*80) = (8) + (0)
--In Octal System, Decimal of 10 is written as 012
--Yes, 10 = 12 , i.e. (1 * 81) + (2 * 80)


Octal Number  ->   2   4   6
Binary Number ->  010 100 110
Hence, 0246 is (010100110)2.

Binary Number ->    1 101 100
Binary Number ->  001 101 100  // After prefixing zeros in the left most group
Octal Number  ->   1   5   4

Hexadecimal = 0 to 9 respectively and alphabets A, B, C, D, E and F (or a, b, c, d, e and f) 
              are used to represent values from 10 to 15 respectively.
21 = 0x15 = (1 * 161) + (5 * 160) = (16) + (5)
160 = 0xA0 = (10 * 161 + (0 * 160) = (160) + (0)
3460 = 0xD84 = (13 * 162) + (8 * 161) + (4 * 160) = (13 * 256) + (8 * 16) + (4 * 1) = (3328) + (128) + (4)
 
--**To convert a hex number to an octal(3 bits), we will first convert the hex(4 bits) number to binary and then to octal.
Hex Number    ->    5    A    F    6
Binary Number ->  0101 1010 1111 0110
Binary Number ->  0101101011110110
Binary Number ->   0 101 101 011 110 110
Binary Number ->  000 101 101 011 110 110 // After prefixing zeros in the left most group
Octal Number  ->   0   5   5   3   6   6
Octal Number  ->   055366

Octal Number  ->   2   4   6
Binary Number ->  010 100 110
Binary Number ->  010100110
Binary Number ->     0 1010 0110
Binary Number ->  0000 1010 0110 // After prefixing zeros in the left most group
Hex Number    ->    0    A    6
Hex Number    ->   0X0A6




1 byte     = 8 bits
1 kilobyte = 1024 bytes
1 megabyte = 1024 kilobytes
1 gigabyte = 1024 megabytes
1 terabyte = 1024 gigabytes
1 petabyte = 1024 terabytes


*/

public class Aa_basics {
        public static void main(String[] args) {
                String[] elements = { "abc", "xyz", "pqr" };
                String first = (elements.length > 0) ? elements[0] : null; 
                System.out.println(first); 
                
                Boolean test = new Boolean(true);
		Integer x = 343;
		Integer y = new Test().go(test, x);
		System.out.println(y);
	}
	        int go(Boolean b, int i) {
		if (b)
			return (i / 7);
		return (i / 49);
                /*
                No. The statement
                if (b) return (i / 7);
                gets executed. It translates to 343 / 7, i.e. 49.
                49
                */
        }
}
