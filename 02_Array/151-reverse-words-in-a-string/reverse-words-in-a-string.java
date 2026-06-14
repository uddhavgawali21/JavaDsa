class Solution {
    public String reverseWords(String sb) {
        StringBuilder s = new StringBuilder();
        String[] arr = sb.split("\\s+");

        for(int i = arr.length-1; i>=0; i--){
            s.append(arr[i]);
            s.append(" ");
        }

    
       return s.toString().trim();
    }
   

}