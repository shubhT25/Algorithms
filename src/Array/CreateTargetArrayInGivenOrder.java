package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CreateTargetArrayInGivenOrder {
  public static int[] createTargetArray(int[] nums, int[] index) {
    //We can use ArrayList, In ArrayList in given index is occupied, it insert it at the index by pushing another.
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int[] ans = new int[nums.length];
    for(int i = 0; i<nums.length; i++){
      arr.add(index[i], nums[i]);
    }
    for(int i = 0 ; i<arr.size(); i++){
      ans[i] = arr.get(i);
    }
    return ans;
  }

  public static void main(String[] args) {
    //    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    //    Output: [0,4,1,3,2]
    //    Explanation:
    //    nums       index     target
    //    0            0        [0]
    //    1            1        [0,1]
    //    2            2        [0,1,2]
    //    3            2        [0,1,3,2]
    //    4            1        [0,4,1,3,2]
    int [] nums = {0, 1, 2, 3, 4};
    int [] index = {0, 1, 2, 2, 1};
    System.out.println(Arrays.toString(createTargetArray(nums, index)));
  }
}
