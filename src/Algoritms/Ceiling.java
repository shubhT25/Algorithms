package Algoritms;

public class Ceiling {
  public static void main(String[] args) {
    int [] arr = {2,3,5,7,8,9,12,14};
    int target = 14;
    int low=0, high= arr.length-1;
    int mid = (low+high)/2;
    while(low<high) {

      if(arr[mid] == target) {
        System.out.println("Ceiling:"+ arr[mid]);
        break;
      } else if(arr[mid] > target) {
        high = mid;
        mid = (low+high)/2;
      } else {
        if(arr[mid+1] > target) {
          System.out.println("Ceiling:"+ arr[mid]);
          break;
        } else if (arr[mid+1] == target) {
          System.out.println("Ceiling:"+ arr[mid+1]);
          break;
        }else {
          low=mid;
          mid=(low+high)/2;
        }
      }
    }
  }
}
