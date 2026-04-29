class Solution {
    public int singleNumber(int[] nums) {
        Set <Integer> set = new HashSet<>();

        for(int ele : nums){
            if(!(set.add(ele))){
                set.remove(ele);
            }
        }
        return set.iterator().next();
    }
}