package Array;

public class IfSentenceIsPangram {
  public static boolean checkIfPangram(String sentence) {
    for(char alpha = 'a' ; alpha<='z' ; alpha++) {
      if(sentence.indexOf(alpha) == -1) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    //    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    //    Output: true
    //    Explanation: sentence contains at least one of every letter of the English alphabet.
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    System.out.println(checkIfPangram(sentence));
  }
}
