class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0, j=n-1;
        int maxWater = 0;
        int currentWater =0;
        while(i<j){

            if(height[i]<height[j])
            {
                currentWater =  height[i]* (j-i);
                maxWater = Math.max(maxWater,currentWater);
                i++;
            }
            else{
                currentWater =  height[j]* (j-i);
                maxWater = Math.max(maxWater,currentWater);
                j--;
            }

            
        }

        return maxWater;


        
    }
}