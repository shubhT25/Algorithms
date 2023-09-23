package Array;

import java.util.HashMap;

public class NumberOfGoodPairs {
  public static int numIdenticalPairs(int[] nums) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int ans = 0;

    //insert new number into room, it is there already handshakes it every friend(identical) in that room.
    //return the no.of handshakes.
    for(int friend:nums){
      int identical = hm.getOrDefault(friend, 0);
      ans += identical;
      hm.put(friend, identical + 1);
    }

    return ans;
  }

  public static void main(String[] args) {
    //    Input: nums = [1,2,3,1,1,3]
    //    Output: 4
    //    There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    //    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    int [] nums = {1,2,3,1,1,3};
    System.out.println(numIdenticalPairs(nums));
  }
}
