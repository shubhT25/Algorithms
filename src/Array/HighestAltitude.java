package Array;

public class HighestAltitude {
  public static int largestAltitude(int[] gain) {
    int max = gain[0] > 0 ? gain[0] : 0;
    for(int i = 1; i<gain.length; i++) {
      gain[i] += gain[i-1];
      max = Math.max(max, gain[i]);
    }
    return max;
  }
  public static void main(String[] args) {
    //    Input: gain = [-5,1,5,0,-7]
    //    Output: 1
    //    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
    int [] gain = {-5, 1, 5, 0, -7};
    System.out.println(largestAltitude(gain));
  }
}
