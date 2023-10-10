class leetcode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls=new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=max){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
        return ls;
    }
}