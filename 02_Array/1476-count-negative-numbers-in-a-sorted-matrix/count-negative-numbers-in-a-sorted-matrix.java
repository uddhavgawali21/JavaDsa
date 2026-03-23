class Solution {
    public int countNegatives(int[][] grid) {
        
        int i = grid.length-1, j = grid[i].length-1, neg=0;
    

        while(i>=0){
            if(j>=0 && grid[i][j]<0 ){
                neg++;
                j--;
            }
            else{
                i--;
                j = grid [0].length-1;
            }
        }

        return neg;
    }
}