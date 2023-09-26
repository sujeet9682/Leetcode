class leetcode7 {
    public int reverse(int x) {
        int n=x;
        int rev=0;
        while(n!=0){
            int r=n%10;
            n/=10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) {return 0;}
            rev=rev*10+r;
        }
        return rev;
    }
}