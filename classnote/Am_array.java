
/*
int arr[] = new int[10];
int arr[] ; // this is rfference varible not an arrray it contains the address
arr.length give lenth of that arr RV without giving any element in that reference variable
arr = new int[10]; dynamic memory allocation which is int 10  40bytes 


int arr[]; we don't assign value it's default value is null || NullPointerException

int [] arr = new int[0]
In JAVA array size 0 is allowed bcos, when we don't pass any cmd line arguments then jvm call main function(need to pass an array) then it will create an string array of size zero then it pass to the main function

 
In java every array gets default value for (local,static,or intanced )
 
int array[20] ; it is an pointer(int cpp)and in java it is refrence variable : it takes same datatype of vlues with compatible (we can store int in double )
An array is a kind of data structure that holds a fixed number of values of a single type, each identified by an array index.

In Java, we can create an array in the following two ways:
SYNTAX 1 : dataType[] referenceName = new dataType[size];
int[] marksArr = new int[10]; // this creates an empty array of size 10 and initializes all values to 0
or 
SYNTAX 2 : dataType[] referenceName = {value1, value2, value3, .....valuen};
int[] marksArr = { 341, 425, 563, 231, 334, 446, 872, 492, 532, 747};

Each array inside of a multidimensional array can be accessed with an index number as shown in the above figure. The first array is identified with number 0, the second array with 1 and so on.

In Java, we can create a multidimensional array in the following ways:
SYNTAX 1 : dataType[][] referenceName = new dataType[rowsize][];
int[][] marksArr = new int[3][]; // this creates an empty multidimensional array with 3 arrays.
marksArr[0] = new int[10]; //this create an empty array of size 10 and adds to marksArray at index 0
marksArr[1] = new int[2]; //this create an empty array of size 2 and adds to marksArray at index 1
marksArr[2] = new int[5]; //this create an empty array of size 5 and adds to marksArray at index 2 

And if we try to pring arr[-1] then it gives Nigative arraysized exception. 

If we just creat reference and don't give any value to this array( array arr[];) this is areference variable (a pointer) having value null and if we try to print
arr[0] or any vlue then it gives null pointer exception.
*/
public class Am_array {
    public static void main(String[] args){
        System.out.println("Ankit kumar vishwakarma");
        int[] ramanujanNumbers = { 1729, 4104, 13832, 20683, 32832 };
		System.out.println("Printing Ramanujan Numbers: ");
		for (int i = 0; i < ramanujanNumbers.length; i++) {
			System.out.println(ramanujanNumbers[i]);
		}
    
	Am_array obj = new Am_array(); // new is used for dynamic memory alloction
	boolean [] ar=new boolean[0];
	obj.demo1(ar); // If we pass a null pointer array then it willgive an compile error
	}
	void demo(){} // if we call this form main fuction it will show that we can't call it from static method bocs demo is non satitic
	static void test(){}// we can call it from main method bcos both are static
    
	void demo1(boolean[] b){ // i can't call this function without an array arguments
		System.out.println("Demo Called");
	}
}   

/* 


int[][] intArray = new int[2][5];
Yes. This creates a multidimensional array with two empty arrays inside, each with a size of 5.
int[][] intArray = new int[3][];
int[] arr1 = new int[5];
int[] arr2 = new int[6];
int[] arr3 = new int[8];



intArray[0] = arr1;
intArray[1] = arr2;
intArray[2] = arr3;
Yes. intArray is created with a size of 3. arr1, arr2, arr3 are created separately and added to intArray at indices 0, 1 and 2 respectively.
int[] arr1 = new int[5];
int[] arr2 = new int[6];
int[] arr3 = new int[8];



int[][] intArray = {arr1, arr2, arr3};
Yes. intArray is created with arrays arr1, arr2, arr3. Hence, its size is 3.
int[] arr1 = new int[5];



int[][] intArray = {arr1, {10,11,12}, {100,150,200}};
Yes. This is a valid way of creating a multidimensional array.
int[][] intArray = {{10,11,12}};
Yes. This is a multidimensional array of size 1, containing a single array of size 3.


The code in the main method uses a for-each loop to iterate over the multidimensional array intArr and prints the values.

		int[][] int2DArr = {
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};
		for (int[] arr : int2DArr) { // here we are giving the value of int2DAarr to arr and then value of arr to value
            
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

int[][] int2DArr = {
						{1},
						{2, 3},
						{4, 5, 6},
						{7, 8, 9, 10}
					};
	for (int i = 0; i < int2DArr.length; i++) {
		for (int j = 0; j < int2DArr[i].length; j++) {
			System.out.print(int2DArr[i][j] + " ");
		}
		System.out.println();
	}
*/
