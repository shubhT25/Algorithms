package Array;

public class MaxJump {
    public static boolean canJump(int[] nums) {
      int jump = 0;

      for (int i = 0; i < nums.length - 1; i++) {
//        System.out.println(jump + " " + nums[i]);
        if (jump < nums[i]) {
          jump = nums[i];
        }
        if (jump-- == 0) return false;
      }
      return true;
    }

  public static void main(String[] args) {
//    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//    Return true if you can reach the last index, or false otherwise.
    int [] nums = {2,3,1,1,4}; //{3,2,1,0,4} false
    System.out.println(canJump(nums));
  }
}
