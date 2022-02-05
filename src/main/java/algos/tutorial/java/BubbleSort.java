package algos.tutorial.java;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        for (int i=1; i<len; i++){
            int curValue = nums[i];
            int prevIndex = i-1;

            while(prevIndex>=0 && curValue<nums[prevIndex]){
                nums[prevIndex + 1] = nums[prevIndex];
                prevIndex--;
            }
            nums[prevIndex+1] = curValue;
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] input = {4, 2, 1, 5, 3};
        BubbleSort ins = new BubbleSort();
        int[] output = ins.sort(input);
        System.out.print(Arrays.toString(output));
    }
}
