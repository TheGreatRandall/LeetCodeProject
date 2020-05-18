/*
 * @Author: your name
 * @Date: 2020-05-18 07:56:54
 * @LastEditTime: 2020-05-18 09:35:24
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /LeetCodeProject/largestArea.java
 */ 
public class largestArea {
    public static int largestRectangleArea(int[] heights) {
        int result = heights[0];

        // 首先需要从第一个开始 找最小的高度
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
/*
we can also use Divide and Conquer
通过观察，可以发现，最大面积矩形存在于以下几种情况：

确定了最矮柱子以后，矩形的宽尽可能往两边延伸。

在最矮柱子左边的最大面积矩形（子问题）。

在最矮柱子右边的最大面积矩形（子问题）。

eg：[6, 4, 5, 2, 4, 3, 9]
这里最矮柱子高度为 2 。以 2 为高的最大子矩阵面积是 2x7=14 。现在，我们考虑上面提到的第二种和第三种情况。我们对高度为 2 柱子的左边和右边采用同样的过程。在 2 的左边， 4 是最小的，形成区域为 4x3=12 
。将左边区域再继续分，矩形的面积分别为 6x1=6 和 5x1=5 。同样的，我们可以求出右边区域的面积为 3x3=9, 4x1=4 和 9x1=9 。因此，我们得到最大面积是 16





public class Solution {
    public int calculateArea(int[] heights, int start, int end) {
        if (start > end)
            return 0;
        int minindex = start;
        for (int i = start; i <= end; i++)
            if (heights[minindex] > heights[i])
                minindex = i;
        return Math.max(heights[minindex] * (end - start + 1), Math.max(calculateArea(heights, start, minindex - 1), calculateArea(heights, minindex + 1, end))); 用递归的思想做问题
    }
    public int largestRectangleArea(int[] heights) {
        return calculateArea(heights, 0, heights.length - 1);
    }
}

作者：LeetCode
链接：https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/zhu-zhuang-tu-zhong-zui-da-de-ju-xing-by-leetcode/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

*/
