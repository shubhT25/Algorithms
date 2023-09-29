package Array;

import java.util.Arrays;
import java.util.List;

public class ItemsMatchingRule {
  public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count=0;

    switch(ruleKey){

      case "type"  :   for(int i=0; i<items.size(); i++ ){
        if(items.get(i).get(0).equals(ruleValue))
          count++;
      }
        return count;

      case "color" :for(int i=0; i<items.size(); i++ ){
        if(items.get(i).get(1).equals(ruleValue) )
          count++;
      }
        return count;

      case "name"  :    for(int i=0; i<items.size(); i++ ){
        if(items.get(i).get(2).equals(ruleValue))
          count++;
      }
        return count;
    }

    return count;
  }
  public static void main(String[] args) {
    //    Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    //    Output: 1
    //    Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),
        Arrays.asList("computer","silver","lenovo"),
        Arrays.asList("phone","gold","iphone"));

    String ruleKey = "color";
    String ruleValue = "silver";
    System.out.println(countMatches(items, ruleKey, ruleValue));
  }
}
