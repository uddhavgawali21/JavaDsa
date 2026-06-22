class Solution {
    public int maxNumberOfBalloons(String text) {
        // Map<Character,Integer> map = new HashMap<>();

        // map.put('b',0);
        // map.put('a',0);
        // map.put('l',0);
        // map.put('o',0);
        // map.put('n',0);

        // for(char c : text.toCharArray()){
        //     if(map.containsKey(c)){
        //         map.put(c,(map.get(c)+1));
        //     }
        // }
        // map.put('l',map.get('l')/2);
        // map.put('o',map.get('o')/2);

        // return Collections.min(map.values());

        int b=0,a=0,l=0,o=0,n=0;

        for(char c : text.toCharArray()){
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++;
        }
        return Math.min(b,Math.min(a,Math.min(n,Math.min(o/2,l/2))));




       
    }
}