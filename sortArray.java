/*
 * @Author: your name
 * @Date: 2020-05-19 20:18:50
 * @LastEditTime: 2020-05-19 20:21:01
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /LeetCodeProject/sortArray.java
 */ 
class sortArray {
    public void sortColors(int[] nums) {
        int zeroEnd = 0;
        int twoStart = nums.length - 1;
        //三个指针,ZeroEnd右边到cur是0， cur到twostart是1，twostart到end是2

        int cur = 0;
        while(cur<=twoStart){
            if(nums[cur] == 0){//把current和zeroend对应的元素对换
                exchange(nums,cur,zeroEnd);
                cur++;
                zeroEnd++;

            }else if(nums[cur] == 2){
                exchange(nums,cur,twoStart);
                twoStart--;//不能改cur的值 因为还要对换过来的那个值进行一次比较

            }else{
                cur++; //nums[cur] == 1
            }
        }


    }

    public void exchange(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    

}