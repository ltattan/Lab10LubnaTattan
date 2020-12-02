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

    }

    public void testNegative(){

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

        }
    }

    public void testDuplicates(){

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

    }


}
