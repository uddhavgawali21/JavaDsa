class Solution {
    public int largestAltitude(int[] gain) {
        int highest =0;
        int currentSum = 0;

        for(int i =0; i<gain.length; i++){
            currentSum +=gain[i];
            highest = currentSum > highest ? currentSum : highest;
        }
        return highest;
        
    }
}