package Array;

import java.util.ArrayList;
import java.util.List;

public class Spiral1 {
  public static List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer> ans = new ArrayList<>();
    int rowStart=0, rowEnd=matrix.length-1;
    int columnStart=0, columnEnd=matrix[0].length-1;

    while(rowStart<=rowEnd && columnStart<=columnEnd) {
      for(int i=columnStart; i<columnEnd; i++) {
        ans.add(matrix[rowStart][i]);
      }
      for(int i=rowStart; i<rowEnd; i++) {
        ans.add(matrix[i][columnEnd]);
      }
      for(int i=columnEnd; i>columnStart; i--) {
        ans.add(matrix[rowEnd][i]);
      }
      for(int i=rowEnd; i>rowStart; i--) {
        ans.add(matrix[i][columnStart]);
      }

      rowStart++;
      columnStart++;
      rowEnd--;
      columnEnd--;
    }

    if(matrix.length == matrix[0].length && matrix.length%2!=0) {
      int mid = matrix.length/2;
      ans.add(matrix[mid][mid]);
    }

    while(ans.size()!=matrix.length*matrix[0].length) {
      ans.remove(ans.size()-1);
    }
    return ans;
  }

  public static void main(String[] args) {
//    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    Output: [1,2,3,6,9,8,7,4,5]
    int [][] matrix = {{1 ,2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(spiralOrder(matrix));
  }
}
