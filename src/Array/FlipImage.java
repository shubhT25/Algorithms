package Array;

import java.util.Arrays;

public class FlipImage {
  public static int[][] flipAndInvertImage(int[][] image) {
    for(int i = 0; i < image.length; i++) {
      for (int j = 0; j < image[0].length / 2 + image[0].length % 2; j++) {
        int temp = image[i][j];
        image[i][j] = 1 - image[i][image[0].length - j - 1];
        image[i][image[0].length - j - 1] = 1 - temp;
      }
    }
    return image;
  }
  public static void main(String[] args) {
    //    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    //    Output: [[1,0,0],[0,1,0],[1,1,1]]
    //    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    //    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    int [][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0 ,0}};
    System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
  }
}
