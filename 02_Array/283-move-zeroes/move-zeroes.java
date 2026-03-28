class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        
        while(j < nums.length){
            if(nums[j]!=0  ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
              j++;       
        }
    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//          int j = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 if(i!=j){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 }
//                 j++;
//             }
//         }
//     }
// }