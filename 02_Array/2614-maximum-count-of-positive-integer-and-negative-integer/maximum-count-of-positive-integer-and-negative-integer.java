class Solution {
    public int maximumCount(int[] nums) {
        int neg =0,zero =0,i=0;
        while(i<nums.length && nums[i]<=0 )
        {   if(nums[i]<0)
                neg++;
            else
                zero++;
            i++;
        }
        int pos = nums.length - neg -zero;

        return (pos>neg)? pos:neg;
    }
}