class Solution {

    private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' ||
           c == 'o' || c == 'u';
}
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxi=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}