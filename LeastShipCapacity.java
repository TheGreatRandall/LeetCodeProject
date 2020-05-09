/*
Find the least capacity of the ship to transport stuffs in limit days
weights[i] = ith item's weight
eg:Input: weights = [3,2,2,4,1,4], D = 3
   Output:6 which is the limit of ship's capacity
   1st day:3 2
   2nd day: 2 4
   3rd day 1, 4


   Binory 
 */
class solution{
	public int shipWithinDays(int[] weights, int D){
		int min = 0, int max = Integer.MAX_VALUE;
		while(min < max){
			int mid = (min+max)/2;
			if(Canship(weights,D,mid)){
				max = mid;

			}else{
				min = mid + 1;
			}
		}
		return min;
















}

	// we need to build a function to determine if given capacity works
	
		
		private boolean Canship(int [] weights, int D, int K){
			int current = K;//current means the remain capacity of the ship, 
			for(int weight: weights){
				//if current capacity < max item weight, not work!
				if(weight > current){
					return false;
				}
				if(current < weight){//if the current less the item weight, we will delay the item to the next day
					current = K;
					D--;
				}
				current -= weight;//ship the item in the same day and get remain capacity


			}
			return D > 0;//if D < 0, which means K doesn't work, we need larger K

		}
		




	









}
