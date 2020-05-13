//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int startPoint = 0;
        Map<Character,Integer> haHa = new HashMap<>();

        for(int endPoint = 0; endPoint < s.length();endPoint++){
            
            if(haHa.containsKey(s.charAt(endPoint))){
                if(startPoint < (haHa.get(s.charAt(endPoint))+1)){
                     startPoint = haHa.get(s.charAt(endPoint))+1;
                }
               
                
                
            }
            haHa.put(s.charAt(endPoint),endPoint);

            
            result = Math.max(result,endPoint-startPoint+1);
            
            
        }

    return result;
        

    }
}