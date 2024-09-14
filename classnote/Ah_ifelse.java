
public class Ah_ifelse {
	public static void main(String[ ] ak){
		
		
		
		
		

int x = -3,y=-1;
if(x>0)System.out.println('A'); //if we terminate with semicolon then there is null statement
else if(y<0)                             // there is no body in this elseif ladder
 if(y==0) System.out.println('B');    //
 else if(y>x) System.out.print('C');  //  these three will be nested inside the els if(bcos it has no body)
 else System.out.print('Z');	        //
else System.out.print('X');	



int p = 3,q=2;
if(p--<++q); // it means this satetment is closed
else if(q>p--)
    if(p != q) --p;
    else --q; /* this ladder is closed here*/ System.out.println(q); //if we remove this syout statement then this program will run
else if(p>0) p++;  // compilation error because this elseif has no if part
System.out.println(p);
    }
}
