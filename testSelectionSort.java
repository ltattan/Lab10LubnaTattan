package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
<<<<<<< HEAD
<<<<<<< HEAD
      
=======

>>>>>>> mixed_duplicate
    }

    public void testNegative(){
=======
      int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;

SelectionSort selectionsort = new SelectionSort();
selectionsort.basicSelectionSort(arr);
for(int i = 0; i<arr.length;++i) {
  System.out.println("Array: " + arr[i]);
}

int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;

SelectionSort selectionsort1 = new SelectionSort();
selectionsort1.basicSelectionSort(arr);
for(int i = 0; i<arr.length;++i) {
  System.out.println("Sorted Array: " + arr[i]);
}


    }

    public void testNegative(){
      int[] negative_arr = new int[5];
  negative_arr[0] = -8;
  negative_arr[1] = -9;
  negative_arr[2] = -7;
  negative_arr[3] = -10;
  negative_arr[4] = -2;
  SelectionSort selectionsort = new SelectionSort();
  selectionsort.basicSelectionSort(negative_arr);
  for(int i = 0; i<negative_arr.length;++i) {
    System.out.println("Negative Array: " + negative_arr[i]);
  }
>>>>>>> positive_negative

    }


    public void testMixed(){
      int[] mixes_arr = new int[5];
      mixes_arr[0] = -8;
      mixes_arr[1] = 9;
      mixes_arr[2] = 7;
      mixes_arr[3] = 0;
      mixes_arr[4] = -2;
      SelectionSort selectionsort = new SelectionSort();
      selectionsort.basicSelectionSort(mixes_arr);
      for(int i = 0; i<mixes_arr.length;++i) {
        System.out.println("Mixed Array: " + mixes_arr[i]);
      }

<<<<<<< HEAD
        }
=======
>>>>>>> positive_negative
    }

    public void testDuplicates(){

<<<<<<< HEAD
<<<<<<< HEAD
=======


>>>>>>> positive_negative
=======
    	int[] duplicate_arr = new int[5];
        duplicate_arr[0] = -8;
        duplicate_arr[1] = 9;
        duplicate_arr[2] = 7;
        duplicate_arr[3] = 9;
        duplicate_arr[4] = -8;
        SelectionSort selectionsort = new SelectionSort();
        selectionsort.basicSelectionSort(duplicate_arr);
        for(int i = 0; i < duplicate_arr.length;++i) {
        	System.out.println("Duplicate Array: " + duplicate_arr[i]);
        }

>>>>>>> mixed_duplicate
    }


}
