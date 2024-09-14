
public class An_numerical2 {
    public static void main(String[] ank){
        // sum of element of an array
        int array[] = {2,3,5,6,3,76,32,45};
        An_numerical2 x = new An_numerical2();
        System.out.println(x.sum(array));
    }
    // sum of all element of an array
    public long sum(int[] arr) {
        long add = 0;
        for(int i = 0 ;i<arr.length-1;i++){
            add += (long)arr[i] ;
        }
        return add; 
    } 
    // Multiplication of matrix
    public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        /*Return the result if the matrix1 coloumn size is equal to matrix2 row size and print the result.
        * @Return null.
        */
        // Write your logic here for matrix multiplication
    
        int row1 = matrix1.length; int col1 = matrix1[0].length;
        int row2 = matrix2.length; int col2 = matrix2[0].length;
        
        int multi[][] = new int[row1][col2];
           for(int i = 0 ;i<row1;i++){
                for(int j = 0;j<col2;j++){
                    for(int k = 0;k<row2;k++){
                        if(col1==row2){
                        multi[i][j] += (matrix1[i][k])*matrix2[k][j];
                    }else{
                        return null;
                    }
                 }
          }
        }
        return multi;
    } 
     
    

    /**
	 * Compute if the given elemetn is present in the array only one time
	 * 
	 * 
	 * return true if it is present else return false
	 */
	
	public boolean elementFinder(int[] arr, int element) {
		int count = 0 ;
		for(int i =0;i<arr.length;i++){
			if(element==arr[i]){
				count++;
			}
		}
		boolean x = false;
		if(count==1){
			x = true;
		}
		return x;
	}



    //public method elementFinder that takes one parameter arr of type int[] and returns true if the first four elements in the arr contains number 4 else returns false.
    public boolean elementFinder(int[] arr) {
		boolean x = false;
		for(int i = 0 ;i<arr.length;i++){
			if((4==arr[i]) && (i<4)){
				x = true;
			}
		}
		return x;
	}
    


    // Write a class SequenceCheck with a public method sequenceCheck that takes one parameter arr of type int[] and returns true if 6, 9, 12 present consecutively in the arr. The return type of sequenceCheck should be boolean.
    public boolean sequenceCheck(int[] arr) {
		boolean x = false;
		for(int i=0;i<arr.length;i++){
			
			if((6==arr[i])&&(9==arr[i+1])&&(12==arr[i+2])){
				x = true;
				break;
			}
		}
		return x;
	}



    //public method sequenceCheck that takes one parameter arr of type int[] and returns true if the elements 1,2,3 are present in the arr.The returen type of sequenceCheck should be boolean.
    public boolean sequeCheck(int[] arr) {
		boolean x = false;
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if(1==arr[i] || 2==arr[i] || 3==arr[i]){
				count++;
			}
		}
		if(count==3){
			x = true;
		}
		return x;
	}



    //public method findMiddle that takes one parameter arr of type int[] and print the middle element in the arr
    //     arr length is even it should print the middle two numbers
    // arr length is odd it prints the middle element
    public void findMiddle(int[] arr) {
		int len = arr.length;
		if((len%2)==0){
			System.out.println(arr[(len/2)-1]+"\n"+arr[(len/2)]);
		}
		if((len%2)!=0){
			System.out.println(arr[(len/2)]);
		}
	}



    //public method sequenceCount that takes one parameter arr of type int[] and returns the sequence count 1,1 in the arr. The return type of sequenceCount should be int.
    //Enter no of elements in the array:
    // 7
    // Enter elements in the array seperated by space:
    // 1 -1 1 1 1 2 3 1
    // 2
    public int sequenceCount(int[] arr) {
		int size = arr.length;
		int count=0;
		for(int i=0; i<size-1; i++)
		{
			if(arr != null && arr[i] == 1 && arr[i+1] == 1)
			{
				count++;
			}
		}
		return count;
	}
	




	// public method checkElement that takes three parameters one is arr of type int[] other are arg1 and arg2 are of type int and returns true if arr contains either arg1 or arg2 elements only.
    public boolean checkElement(int[] arr, int arg1, int arg2) {
		boolean x = true;
		
		for(int i = 0; i<arr.length; i++){
			if((arg1!=arr[i]) && (arg2!=arr[i])){
				x=false;
				break;
			}
		}
		return x;
	}
   //public method findDiff that takes one parameter arr of type int[] and returns the difference between largest and smallest elements in the arr.
   // first we need to sort the elments of this arr



 /*public method checkAlternate that takes two parameters one is arr of type int[] and second one is arg of type int and returns true the element arg is present at every odd position of the arr. The return type of checkAlternate is boolean.

Assumptions:
arr is never null
Here is an example:
Enter no of elements in the array:
5
Enter elements in the array seperated by space:
32 65 32 84 32
Enter the arg element to find:
32
true*/
public boolean checkAlternate(int[] arr, int ank){
	boolean x = true;
	for(int i =0; i<arr.length-1; i+=2){
		if(ank!=arr[i]){
			x=false;
			break;
		}
	}
	return x;
}


// public method checkElement that takes two parameters one is arr of type int[] and second one is arg of type int and returns true if every pair of arr contains at least one arg


/*public method checkElement that takes one parameter arr of type int[] and print all the elements in the arr that are surrounded by left and right elements and not equal to the left and right elements.

Here is an example:
Enter·no·of·elements·in·the·arr1:
5
Enter·elements·in·the·arr1·seperated·by·space:
1 2 1 1 3
2
*/


//public method reorder that takes one parameter arr of type int[] and returns the arr such that all zeros should come in front of the arr.
public int[] reorder(int[] arr) {
	int size = arr.length;
	int i = size-1,j=size-1;
	while(i>=0){
		if(arr[i] !=0){
			arr[j] = arr[i];
			j--;
		}
		i--;
	}
	while(j>=0){
		arr[j] = 0;
		j--;
	}
	return arr;
}
//public method reorder that takes one parameter arr of type int[] and returns the arr such that all even numbers in the array come to the front of the arr.


//public method findMultiples that takes three parameters arr of type int[] and other two are m1 and m2 are of type int. Print all the elements in the array, but if any element in the array is a multiple of m1, print multiple of (actual value of m1 should be printed instead of ). If it is a multiple of m2, print multiple of . If it is a multiple of both m1 and m2, print multiple of m1 and m2.

//public method findCenteredAverage that takes one parameter arr of type int[] and returns the centered average of the elements in the arr

//Hint: exclude the biggest and smallest numbers from the array and compute the average of the remaining numbers. If there is more than one smallest value excludes only one of those. Similarly for biggest also.
public int findCenteredAverage(int[] arr){
	int n = arr.length;
	int temp = 0;
	for(int i=0; i<n; i++){
		for(int j=1; j < (n-i); j++){
			if(arr[j-1]> arr[j]){
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	int sum=0;
	int count=0;
	for(int i = 1; i < arr.length-1; i++){
		sum += arr[i];
		count++;
	}
	int av=sum/count;
	return av;
	}

	// public method findSum that takes three parameters one is arr of type int[] and other two are ignore1 and ignore2 are of type int and returns the sum of all the elements in the array, if the numbers ignore1 and ignore2, both appear in the array, ignore all the elements between them, including these two numbers.

	//public method checkSequences that takes one parameter arr of type int[] and returns true only if one of these two sequences is present in the array: 18, 28 and 33, 36, returns false if none of these sequences are present or both are present. The return type of checkSequences is boolean.

	//public method checkEvenSequence that takes one parameter arr of type int[] and returns true if three consecutive even numbers are present in the arr. The return type of checkEvenSequence is boolean.
	public void checkEvenSequence(int[] arr) {
		//Write your code here
		boolean r =false;
		for(int i=0 ;i<arr.length;i++){
			if(arr[i]%2==0){
			    if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0){
			    	r = true;
			    	break;
			    }
			}    
		}
	}


//public method checkSymmetry that takes two parameters one is arr of type int[] and second one is n of type int and returns true if the first n numbers are same as the last n numbers in the arr.

// public method checkSequence that takes one parameter arr of type int[] and returns true if any three consecutive elements in arr are in incremental order.
}   
