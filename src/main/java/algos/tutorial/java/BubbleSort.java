package algos.tutorial.java;

import java.util.Arrays;

public class BubbleSort {
    public int[] vanillaBubbleSort(int[] nums){

        long startTime = System.nanoTime();

        int len = nums.length;
        for (int i=0; i<len-1; i++){
            for (int j=0; j< len-1; j++){
                if (nums[j+1]< nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("vanillaBubbleSort took " + (endTime - startTime) + "ns");
        return nums;

    }
    public int[] advBubbleSort(int[] nums){

        long startTime = System.nanoTime();

        int len = nums.length;
        for (int i=0; i<len-1; i++){
            for (int j=0; j< (len-1)-i; j++){

                if (nums[j+1]< nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }

            }
        }
        long endTime = System.nanoTime();
        System.out.println("advBubbleSort took " + (endTime - startTime) + "ns");
        return nums;
    }

    public int[] advBubbleSortSwap(int[] nums){

        long startTime = System.nanoTime();

        int len = nums.length;
        boolean swap= false;
        for (int i=0; i<len-1; i++){
            for (int j=0; j< (len-1)-i; j++){
                if (nums[j+1]< nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swap = true;
                }
            }
            if (swap==false){
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("advBubbleSort with Swap check took " + (endTime - startTime) + "ns");
        return nums;
    }

    public static void main(String args[]) {
        int[] input = {11, 45, 23, 8, 4, 2, 1, 5, 3};
        BubbleSort bbl = new BubbleSort();

        int[] out = bbl.vanillaBubbleSort(input);
        System.out.println(Arrays.toString(out));

        out = bbl.advBubbleSort(input);
        System.out.println(Arrays.toString(out));

        out = bbl.advBubbleSortSwap(input);
        System.out.println(Arrays.toString(out));

    }
}
