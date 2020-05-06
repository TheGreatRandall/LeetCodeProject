import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
    int startPoint = 0;
    int result = 0;
    HashMap<Character, Integer> Haha = new HashMap<Character,Integer>();
    for(int endPoint = 0;endPoint < arr.length; endPoint++){
      //if (!Haha.containsKey(arr[endPont])
      char rightChar = arr[endPoint];
      Haha.put(rightChar,Haha.getOrDefault(rightChar,0)+1);
      while(Haha.size() > 2){
        char leftChar = arr[startPoint];
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
