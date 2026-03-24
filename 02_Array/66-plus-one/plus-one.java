class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        digits[n]+=1;
    
        while(digits[n]>9){
            if(n>0){
            digits[n]=0;
            digits[n-1]+=1;
            n--;
            }
            else{
                int[] arr = new int[digits.length +1];
                arr[0]=1;
                return arr; 
            }
        }

        return digits;
    }
}