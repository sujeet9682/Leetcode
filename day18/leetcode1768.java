class leetcode1768 {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int start=0;
        int up=0;
        StringBuilder str = new StringBuilder();
        while(start<n1 || up<n2){
            if(start<n1){
                str.append(word1.charAt(start));
            start++;
            }
            if(up<n2){
                str.append(word2.charAt(up));
            up++;
            }
        }
        return str.toString();
    }
}