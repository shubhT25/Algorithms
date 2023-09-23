package Array;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int [] bucket = new int[102];
    int i;

    //The constraint is 100, so add the no.of occurrence of num in nums to index of num+1 in bucket
    //i.e. bucket[9] contains occurrence of number 8.
    for (i=0; i<nums.length; i++) {
      bucket[nums[i]+1]++;
    }

    //calculate the occurrence of every small number and add to num. i.e. bucket[8] contains number less than 8
    for(i=1; i<102; i++) {
      bucket[i] += bucket[i-1];
    }

    for(i=0; i<nums.length; i++) {
      nums[i] = bucket[nums[i]];
    }
    return nums;
  }

  public static void main(String[] args) {
    //    Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    //    That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    //    Input: nums = [8,1,2,2,3]
    //    Output: [4,0,1,1,3]
    int [] nums = {8, 1, 2, 2, 3};
    System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
  }
}
