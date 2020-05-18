/*
 * @Author: your name
 * @Date: 2020-05-18 07:56:54
 * @LastEditTime: 2020-05-18 08:38:55
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /LeetCodeProject/largestArea.java
 */ 
public class largestArea {
    public static int largestRectangleArea(int[] heights) {
        int result = heights[0];

        // 首先需要从第一个开始 找到所有往后比自己大的值
        for (int i = 0; i < heights.length; i++) {
            int minheight = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                minheight = Math.min(minheight, heights[j]);
                result = Math.max(result, minheight*(j - i + 1));

                }

            }
            return result;
    }

    

    public static void main(String[] args) {
        int[] test = { 2, 1, 5, 6, 2, 3 };
        int result = largestRectangleArea(test);
        System.out.print(result);


    }



    
}/*
 * @Author: your name
 * @Date: 2020-05-18 07:56:54
 * @LastEditTime: 2020-05-18 07:56:54
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: /LeetCodeProject/largestArea.java
 */ 
