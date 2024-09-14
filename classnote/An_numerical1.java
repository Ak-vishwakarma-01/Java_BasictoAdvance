
import javax.swing.filechooser.FileNameExtensionFilter;

public class An_numerical1 {
    public static void main(String[] args){
        // long in=3;
        // final byte b=0;
        // switch(in){ // long is not allowed to switch as an input
        //     case (b) : System.out.print(0);
        //     case (b-1) : System.out.print(1);break;
        //     case (b+3) : System.out.print(3);
        //     case (b+2) : System.out.print(2);break;
        //     default : System.out.print("?");
        // }


        // for(int i = 0;i<5;i++){
        //     System.out.println(i);
        //     break;
        //     System.out.println("Bye"); // unreachable statement EITHER WE HAVE TO REMOVER BREAK OR THEIS PRINT STATEMENT
        // }
        // while(false) {System.out.println("x");} // it will throw an error and will never executet
        // if (false) System.out.println("False"); // not an error unreachable port
        

        // int [] marks  = {5,6,13,8,32,14,5};
        // for(int i :marks)// traversing some(marks) collection it will print each element or we can say fetch vlue one by one 
        // {
        //     if (i%2==1) System.out.println(i);
        // }
       

        // String in ="abc";
        // switch(in){
        //     case "AAA" :System.out.println(2);
        //     case "ABC" :System.out.println(1);
        //     case "BBB" :System.out.println(3); break; // no output because there is no mathing
        //     case "" :System.out.println(4);
        // }
        int [] ak_vish = {23,43,54,56,43,78,54};
        int  ak = 43,ak2 = 54;    
        An_numerical1 obj = new An_numerical1();
        obj.printIndex(ak_vish,ak );
        obj.countElement(ak_vish,ak);
    }
    public int printIndex(int[] ankit, int ak) { // this method must return a value of type int
		int ak_index = 0;
	     for(int i = 0; i <ankit.length;i++){

	     	if(ankit[i]==ak){
                System.out.print("First match of the element "+ak+" index is: ");
                ak_index = i;
                break;
	     	}
	     }
        System.out.print(ak_index+"\n");
	    return 0 ;
    }

    int countElement(int[] ankit, int ak_vish) {
            //Write your code here
            int nu_elem = 0;
            for (int i = 0;i<ankit.length;i++){
                if(ankit[i]==ak_vish){
                    nu_elem +=1;
                }
            }
            System.out.print(nu_elem);
            return nu_elem;
        }



        
    	public int[] reverseArray(int ankit[]){ // reverse an array
            int x = ankit.length;
            int [] store = new int[x];
            int j =0;
            for (int i = ankit.length-1; i>=0; i--){
                store[j]  = ankit[i];
                j++;
            }
            return store;
        }
        //ADDITION OF MATRIX:
        public int[][] add(int[][] matrix1, int[][] matrix2) {
            int row1 = matrix1.length;
            int row2 = matrix2.length;
            int col1 = matrix1[0].length;
            int col2 = matrix2[0].length;
                            //if(row1!=row2){
                            //	return null;
                            //}
            int [][] sum= new int[row1][col1];
            
               for(int i = 0 ; i<row1;i++){
                   for(int j = 0;j<col1;j++){
                       if(row1==row2 && col1==col2){
                     sum[i][j]= matrix1[i][j] + matrix2[i][j];	 
                     }else{
                         return null;
                     }
                 }
            }
       return sum;     
      }
}
