class leetcode6 {
    public String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        StringBuffer sb=new StringBuffer();

        int n=s.length();
        int k=(numRows-1)*2;

        for(int i=0;i<numRows;i++){
            int index=i;

            while(index<n){
                sb.append(s.charAt(index));

                if(i!=0 && i!=numRows-1){
                    int k1=k-(2*i);
                    int k2=index+k1;
                    if(k2<n){
                        sb.append(s.charAt(k2));
                    }
                }

                index=index+k;
            }
        }
        // for(int i=0;i<s.length();i++){
        //     int index=i;
        //     while(i<n){
        //         sb.append(s.charAt(i));
        //         index=index+k;
        //     }
        // }            This code is used to print upper and lower row
        return sb.toString();
    }
}