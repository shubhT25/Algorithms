package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("D:\\abc.txt");
//    int i = fis.read();
    int i = 0;
    while((i = fis.read()) != -1) {
      System.out.println((char) i);
    }
    fis.close();
    FileOutputStream fos = new FileOutputStream("D:\\abc.txt", true);
    String s = " The Demo again";
    byte [] b = s.getBytes();
    fos.write(b);
    fos.flush();
    fos.close();
  }
}
