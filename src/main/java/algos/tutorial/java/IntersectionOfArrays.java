package algos.tutorial.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class IntersectionOfArrays {
    /*
    getIntersection1

    Given two integer arrays nums1 and nums2, return an array of their intersection.
    Each element in the result must be unique and you may return the result in any order.

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]

    */
    public int[] getIntersection1(int[] nums1, int[] nums2){
        //int max_len = (nums1.length > nums2.length) ? nums1.length: nums2.length;

        HashSet<Integer> s1 = new HashSet<Integer>();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i < nums1.length; i++ ){
            s1.add(nums1[i]);
        }
        for (int i=0; i< nums2.length; i++){
            if (s1.contains(nums2[i]) && !arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }
        }
        int[] a = new int[arr.size()];
        for (int i=0; i<a.length; i++){
            a[i] = arr.get(i);
        }
        return a;
    }

    /*

    getIntersection2

    Given two integer arrays nums1 and nums2, return an array of their intersection.
    Each element in the result must appear as many times as it shows in both arrays
    and you may return the result in any order.

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
     */

    public int[] getIntersection2(int[] nums1, int[] nums2){
        int[] output = nums1;
        return output;
    }

    public static void main(String args[]) {
        int[] nums1 = {11, 45, 23, 8, 4, 2, 1, 5, 3};
        int[] nums2 = {2,3};
        IntersectionOfArrays intArray = new IntersectionOfArrays();

        int[] output = intArray.getIntersection1(nums1, nums2);
        System.out.println(Arrays.toString(output));

//        output = intArray.getIntersection2(nums1, nums2);
//        System.out.println(Arrays.toString(output));
    }
}
