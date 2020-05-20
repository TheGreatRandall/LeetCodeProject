/*
 * @Author: your name
 * @Date: 2020-05-05 22:47:48
 * @LastEditTime: 2020-05-18 07:40:54
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /LeetCodeProject/fruitInTwoBaskets.java
 */ 
import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(final char[] arr) {
    int startPoint = 0;
    int result = 0;
    final HashMap<Character, Integer> Haha = new HashMap<Character, Integer>();
    for (int endPoint = 0; endPoint < arr.length; endPoint++) {
      // if (!Haha.containsKey(arr[endPont])
      final char rightChar = arr[endPoint];
      Haha.put(rightChar, Haha.getOrDefault(rightChar, 0) + 1);
      while (Haha.size() > 2) {
        final char leftChar = arr[startPoint];
        Haha.put(leftChar,Haha.getOrDefault(leftChar,0) -1);
        if(Haha.get(arr[startPoint]) == 0){
          Haha.remove(arr[startPoint]);
        }
        startPoint++;
      }
      
      result = Math.max(result,endPoint-startPoint+1);



    }
    // TODO: Write your code here
    return result;
  }
}
