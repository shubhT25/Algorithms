package Array;

import java.util.Arrays;

public class BuildArrayFromPermutation {

  public static int[] buildArray(int[] nums) {
    int [] arr = new int[nums.length];
    for(int i=0; i<nums.length; i++) {
      // nums[i] = nums[i] + n*(nums[nums[i]] % n);
      arr[i] = nums[nums[i]];
    }
    // for(int i=0; i<n; i++){
    //     nums[i] = nums[i]/n;
    // }
    return arr;
  }

  public static void main(String[] args) {
    int[] nums = {0,2,1,5,3,4};

    //    Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.//
    //    A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
    System.out.println(Arrays.toString(buildArray(nums)));
    //Output: [0,1,2,4,5,3];
  }
}
