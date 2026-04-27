class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = (nums.length)-1;
        int mid;
        int occr[] = {-1,-1};

       

        while(left<=right){
            mid = left +(right-left)/2;

            if(nums[mid] == target){
               

                occr[0] = mid;
                right = mid-1;
              

            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }

        }
        if(occr[0] != -1){
        int i = occr[0];
        
        while(i<nums.length && nums[i] == target){
            i++;
        }
        occr[1] = i-1;
        }
        return occr;



        
    }

    
}