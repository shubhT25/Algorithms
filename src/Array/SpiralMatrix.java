package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
  public static List<Integer> spiralOrder(int[][] matrix) {
    int row = matrix[0].length;
    int col = matrix.length;
    List<Integer> spiral = new ArrayList<>();
    for (int j = 0; j < row || j < col; j += 2) {
      for (int i = j/2; i < row - 1 - j/2; i++) {
        spiral.add(matrix[j/2][i]);
      }
      System.out.println("1" + spiral);
      for (int i = j/2; i < col - j/2; i++) {
        spiral.add(matrix[i][matrix[0].length - 1 - j/2]);
      }
      System.out.println("2" + spiral);
      for (int i = row - 2 - j/2; i >= j/2; i--) {
        System.out.println("2 " + i + " " + (row - 2 - j/2) + spiral);
        spiral.add(matrix[matrix.length - 1 - j/2][i]);
      }
      System.out.println("3" + spiral);
      for (int i = col - 2 - j/2; i >= j/2 + 1; i--) {
        spiral.add(matrix[i][j/2]);
      }
      System.out.println("4" + spiral);
    }
    return spiral;
  }
  public static void main(String[] args) {
    int [][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//    int [][] matrix = {{1, 2, 3, 4, 5}, {6 , 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
    System.out.println(spiralOrder(matrix));
  }
}
