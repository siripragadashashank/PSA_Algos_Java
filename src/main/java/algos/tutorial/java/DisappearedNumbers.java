package algos.tutorial.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class DisappearedNumbers {
    public int[] solution(int[] nums){

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++){
            int gotoindex = abs(nums[i])-1;
            nums[gotoindex] = -1 * abs(nums[gotoindex]);
        }
        System.out.println(Arrays.toString(nums));
        for (int i=0; i<nums.length; i++){
            if (nums[i]>0){
                res.add(i+1);
            }
        }

        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
    public static void main(String args[]) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        DisappearedNumbers disNumbers = new DisappearedNumbers();

        int[] output = disNumbers.solution(nums);
        System.out.println(Arrays.toString(output));
    }
}
