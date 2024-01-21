package Algoritms;

public class Ceiling {
  public static void main(String[] args) {
    int [] arr = {2,3,5,8,9,16,18};
    int target = 10;
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
        } else {
          low=mid;
          mid=(low+high)/2;
        }
      }
    }
  }
}
