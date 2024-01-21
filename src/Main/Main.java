package Main;

import Array.Spiral2;

import javax.swing.text.StringContent;
import java.util.Arrays;

class MyThread extends Thread {
  public void run () {
    for (int i =0 ; i < 10; i++) {
      System.out.println("Child: " +  i);
    }
  }
}

public class Main {
  public static void main(String[] args) {
      float a = 129.5f;
      byte b = (byte) a;
      //min + (res - max - 1);
      //1 0 0 0 0 0 0 1

      //      int a1 = 100/9;
      //      System.out.println(a1);
      //      String name = "Shubham";
      //
      //      String str1 = new String("abc");
      //      String str2 = "abc";
      //      String str3 = new String("abc");
      //
      //    System.out.println(str1.equals(str3));
      //    System.out.println(str1 == str2);
    MyThread t1 = new MyThread();
//    t1.start();

    for(int i = 0; i<10; i++) {
      System.out.println("Main: " + i);
    }

    

  }
}
