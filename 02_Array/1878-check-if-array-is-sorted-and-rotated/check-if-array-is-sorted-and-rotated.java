class Solution {
    public boolean check(int[] nums) {

        
        boolean breakpoint = false;
        int n = nums.length;

        for(int i =0; i<n; i++){
            
            if(nums[i]> nums[(i+1)%n]  ){
                if(breakpoint) return false;
                breakpoint = true;
            }
           


         }
         return true;


        
    }

    
    
}