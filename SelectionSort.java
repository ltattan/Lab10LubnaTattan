package lab10;

public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
   public SelectionSort() {
   }

   /* A simple SelectionSort algorithm
    * pre-condition: Implement a list of numbers and store them in an array
    * post-condition: The class is supposed to read the list of numbers in an array for each function.
    * inputs:
    * Sorted Array:2 7 8 9 10
    * Negative Array: -8 -9 -7 -10 -2
    * Mixes Array: -8 9 7 0 -2
    * Duplicate Array: -8 9 7 9 -8
    * outputs:
    * special conditions:
    */
   public int[] basicSelectionSort(int[] x) {
       for (int i = 0; i < x.length; ++i) {
           for (int j= i+1; j < x.length; ++j) {
               if (x[i] > x[j]) {
                   temp = x[i];
                   x[i] = x[j];
                   x[j] = temp;
               }
           } // end of inner for loop
       } // end of outer for loop
       return x;
   } // end of basicSelectionSort method

}
