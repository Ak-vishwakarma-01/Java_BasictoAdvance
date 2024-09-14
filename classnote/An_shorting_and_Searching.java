
/*
1-BUBBLE SHORT:-

Sorting specifies the way to arrange data in a particular order either in ascending or descending.
Bubble sort is an internal sorting technique in which adjacent elements are compared and exchanged if necessary.
The working procedure for bubble sort is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
Compare the first two elements in the array i.e., a[0] and a[1], if a[1] is less than a[0] then interchange the two values.
Next compare a[1] and a[2], if a[2] is less than a[1] then interchange the values.
Continue this process till the last two elements are compared and interchanged.
Repeat the above steps for n - 1 passes.
Let us consider an example of array numbers "50 20 40 10 80", and sort the array from lowest number to greatest number using bubble sort.

In each step, elements written in bold are being compared. Number of elements in the array are 5, so 4 passes will be required.
Pass - 1 : 
( 50 20 40 10 80 ) -> ( 20 50 40 10 80 ) // Compared the first two elements, and swaps since 50 > 20.
( 20 50 40 10 80 ) -> ( 20 40 50 10 80 ) // Swap since 50 > 40.
( 20 40 50 10 80 ) -> ( 20 40 10 50 80 ) // Swap since 50 > 10.
( 20 40 10 50 80 ) -> ( 20 40 10 50 80 ) // Since the elements are already in order (50 < 80), algorithm does not swap them.Total number of elements in the given array are 5, so in Pass - 1 total numbers compared are 4. After completion of Pass - 1 the largest element is moved to the last position of the array.

Now, Pass - 2 can compare the elements of the array from first position to second last position.
Pass - 2 : 
( 20 40 10 50 80 ) -> ( 20 40 10 50 80 ) // Since the elements are already in order (20 < 50), algorithm does not swap them.
( 20 40 10 50 80 ) -> ( 20 10 40 50 80 ) // Swap since 40 > 10.
( 20 10 40 5080 ) -> ( 20 10 40 50 80 ) // Since the elements are already in order (40 < 50), algorithm does not swap them.In Pass - 2 total numbers compared are 3. After completion of Pass - 2 the second largest element is moved to the second last position of the array.

Now, Pass - 3 can compare the elements of the array from first position to third last position.
Pass - 3 : 
( 20 10 40 50 80 ) -> ( 10 20 40 50 80 ) // Swap since 20 > 10.
( 10 20 4050 80 ) -> ( 10 20 40 50 80 ) // Since these elements are already in order (20 < 40), algorithm does not swap them.In Pass - 3 total numbers compared are 2. After completion of Pass - 3 the third largest element is moved to the third last position of the array.

Now, Pass - 4 can compare the first and second elements of the array.
Pass - 4 : 
( 10 2040 50 80 ) -> ( 10 20 40 50 80 ) // Since these elements are already in order (10 < 20), algorithm does not swap them.In Pass - 4 total numbers compared are 1. After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 40 50 80.





2-INSERTION SORT:-
Insertion sort is one that sorts a set of elements by inserting an element into the existing sorted elements.
The working procedure for insertion sort is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
The first element a[0] in the array is itself trivially sorted.
The second element a[1] is compared with first element a[0] and it will be inserted either before or after first element, so that first and second elements are sorted.
The third element a[2] is compared with a[0] and a[1] and it will be inserted into its proper place by checking conditions, so that first three elements are sorted.
Repeat the same process for n - 1 passes.
Let us consider an example of array numbers "50 20 40 10 30", and sort the array from lowest number to greatest number using insertion sort.

In each step, elements written in color is compared with elements written in bold. Number of elements in the array are 5, so 4 passes will be required.
Pass - 1 : 
( 5020 40 10 30 ) -> ( 20 50 40 10 30 ) // The second element a[1] is compared with the first element a[0] and swaps since 50 > 20, so first 2 elements are sorted.Now, Pass - 2 can compare a[2] with a[0] and a[1].
Pass - 2 : 
( 20 5040 10 30 ) -> ( 20 40 50 10 30 ) // Since 40 > 20 and 40 < 50, so 40 is inserted in between 20 and 50.Now, Pass - 3 can compare a[3] with a[0], a[1] and a[2].
Pass - 3 : 
( 20 40 5010 30 ) -> ( 10 20 40 50 30 ) // Since 10 < 20, so it is inserted before 20.Now, Pass - 4 can compare a[4] with a[0], a[1], a[2] and a[3].
Pass - 4 : 
( 10 20 40 5030  ) -> ( 10 20 30 40 50 ) // Since 30 > 10, 30 > 20 but 30 < 40, so 30 is inserted in between 20 and 40 .After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 30 40 50.




3=SELECTION SORT
Selection sort process can be done in two ways, one is the largest element method and the other is smallest element method.
The working procedure for selection sort using the largest element method is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
In the first step, the largest element in the list is searched. Once the largest element is found, it is exchanged with the element which is placed at the last position. This completes the first pass.
In the next step, it searches for the second largest element in the list and it is interchanged with the element placed at second last position. This is done in second pass.
This process is repeated for n - 1 passes to sort all the elements.
Let us consider an example of array numbers "80 10 50 20 40", and sort the array from lowest number to greatest number using selection sort by the largest element.

Pass - 1 : 
( 80 10 50 20 40 ) -> ( 40 10 50 20 80 ) // First finds the largest element and it is exchanged with the last position element.After completion of Pass - 1, the largest element is moved to the end of the array.

Now, Pass - 2 can find the next largest element with out considering the last position element.
Pass - 2 : 
( 40 10 50 20 80 ) -> ( 40 10 20 50 80 ) // Largest in 40 10 50 20 is 50 and it is replaced with next last position of the array.After completion of Pass - 2 the second largest element is moved to the second last position of the array.

Now, Pass - 3 can find the next largest element with out considering the last two position elements because they are already sorted.
Pass - 3 : 
( 40 10 20 50 80 ) -> ( 20 10 40 50 80 ) // Largest in 40 10 20 is 40 and it is replaced with next last position of the array.After completion of Pass - 3 the third largest element is moved to the third last position of the array.

Now, Pass - 4 can find the next largest element with out considering the last three position elements because they are already sorted.
Pass - 4 : 
( 20 10 40 50 80 ) -> ( 10 20 40 50 80 ) // Largest in 20 10 is 20 and it is replaced with next last position of the array.After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 40 50 80.

2nd defenetion of selction sort
We can create a java program to sort array elements using selection sort. In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.



BINARY SEARCH
Binary search is faster than linear search, as it uses divide and conquer technique and it works on the sorted list either in ascending or descending order.
Binary search (or) Half-interval search (or) Logarithmic search is a search algorithm that finds the position of a key element within a sorted array.
Binary search compares the key element to the middle element of the array; if they are unequal, the half in which the key element cannot lie is eliminated and the search continues on the remaining half until it is successful.
The working procedure for binary search is as follows:

Let us consider an array of n elements and a key element which is going to be search in the list of elements.
The main principle of binary search has first divided the list of elements into two halves.
Compare the key element with the middle element.
If the comparison result is true the print the index position where the key element has found and stop the process.
If the key element is greater than the middle element then search the key element in the second half.
If the key element is less than the middle element then search the key element in the first half.
Repeat the same process for the sub lists depending upon whether key is in the first half or second half of the list until a match is found (or) until all the elements in that half have been searched.
Let us consider an example of array numbers "50 20 40 10 80", and the key element is to find is 10.

Search - 1 : 
First Sort the given array elements by using any one of the sorting technique.
After sorting the elements in the array are 10 20 40 50 80 and initially low = 0, high = 4.
Search - 2 : 
Compare 10 with middle element i.e., (low + high) / 2 = (0 + 4) / 2 = 4 / 2 = 2, a[2] is 40.
Here 10 < 40 so search the element in the left half of the element 40. So low = 0, high = mid - 1 = 2 - 1 = 1.
Search - 3 : 
Compare 10 with middle element i.e., (low + high) / 2 = (0 + 1) / 2 = 1 / 2 = 0, a[0] is 10.
Here 10 == 10 so print the index 0 where the element has found and stop the process
*/
public class An_shorting_and_Searching {
    public static void main(String[]  ankit){
        int [] bubble = {45,67,3,87,23}; 
        An_shorting_and_Searching arr = new An_shorting_and_Searching();
        arr.bubbleSort(bubble);
    }



	//BUBBLE SORT
    public int [] bubbleSort(int[] ank){
		int k=0;
		int col = ank.length;
		for(int i = 0;i<col;i++){
			for(int j= 0;j<col-1;j++){ //bcos last element will not be swap with anyone
			   if(ank[j]>ank[j+1]){
			   	
			       k = ank[j];
			       ank[j] = ank[j+1];
			       ank[j+1] = k;
			   }
		    }
            for(int n = 0; n<col; n++){
            	System.out.println(ank[n]);
            }
	    }
        return ank;
	}



    //INSERTION SORT
	
		public void insertionSort(int [] ak){
			int col = ak.length;
			for(int i =1;i<col;i++){
				int k = ak[i];
				int j = i-1;
				while(j>=0 && k<ak[j]){
					ak[j+1] = ak[j];
					--j;
				}
				ak[j+1] = k;
			}
			for(int n = 0; n<ak.length;n++){
				System.out.println(ak[n]);
			}
		}
	



	//SELECTION SORT
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[i];   
            arr[i] = arr[index];  
            arr[index] = smallerNumber;  
        }
		for(int p=0;p<arr.length;p++){
			System.out.println(arr[p]);
		}  
    }



	//selection sort from smallest
	public void selectionSortSmallestEle(int [] ak){
		int small=0;
	 for(int i = 0;i<ak.length-1;i++){
		 small = i;
		 for(int j = i+1;j<ak.length;j++){
			 if(ak[j]<ak[small]){
				 small = j;
			 }	
		 }	
		 int k = ak[i];
		 ak[i] = ak[small];
		 ak[small]= k;
	 }
	 for(int n = 0 ;n<ak.length;n++){
		 System.out.println(ak[n]);
	 }
    }



	// MERGE SHORT
	public void splitAndMerge(int arr[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			splitAndMerge(arr, low, mid);
			splitAndMerge(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public void merge(int arr[], int low, int mid, int high) {
		int i = low, h = low, j = mid + 1, k;
		int[] temp = new int[arr.length];
		while (h <= mid && j <= high) {
			if (arr[h] <= arr[j]) {
				temp[i] = arr[h];
				h++;
			} else {
				temp[i] = arr[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				temp[i] = arr[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				temp[i] = arr[k];
				i++;
			}
		}
	}


	//LINEAR SEARCH
	public void linearSearch(int []ak,int key){
		int k = 0;
		for (int i = 0; i<ak.length-1;i++){
			if(ak[i]==key){
				System.out.println("Search element "+key+" is found at position : "+i);
		        k++;
			}
		}
		if(k==0){
			System.out.println("Search element "+key+" is not found");
		}
	}



	//BINARY SEARCH FIRST WE HAVE TO SORT THE ARRAY THEN SEARCH THE KEY
	public void binarySearch(int []ak,int key){
		
		int k = 0 ;
		// using bubble sort
		for(int i = 0; i<ak.length;i++){
			for(int j = 0; j<ak.length-1; j++){
				if(ak[j]>ak[j+1]){
					k = ak[j];
					ak[j] = ak[j+1];
					ak[j+1] = k;
				}
			}
		}
		binser(ak,key);
	}
	public void binser(int[]ak, int key){
		int low = 0, high = ak.length -1;
		int mid = 0;
	    for(int i = 0; i<ak.length-1; i=i+2){
	    	mid = (low + high)/2;
	    	if(key<ak[mid]){
	    		high = mid - 1;
	    	}if(key>ak[mid]){
	    		low = mid + 1;
	    	}if(key==ak[mid]){
	    		System.out.println("Search element "+key+" is found at position : "+mid);
	    	}
	    }
	    int u = 0;
	    for(int o = 0;o<ak.length-1;o++){
	    	if(key==ak[o]){
	           u++; 
	           break;
	    	}
	    }
	    if(u==0){
	    	System.out.println("Search element "+key+" is not found");
	    }
	}
}
  
