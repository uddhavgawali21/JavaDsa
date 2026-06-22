class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        int maxVal = 0;

        for(int i=0; i<n; i++){
            maxVal = Math.max(maxVal,costs[i]);
        }

        int[] freqArr = new int[maxVal+1];

        for(int i=0; i<n; i++){
            freqArr[costs[i]]++;
        }
        int iceCount = 0;
        for(int i=0; i<freqArr.length; i++){
            while(freqArr[i]!=0){
            
                coins-= i;
                if(coins>=0){
                iceCount++;
                freqArr[i]--;
                }
                else{
                    return iceCount;
                }

            }
        }
        return iceCount;

    }
}