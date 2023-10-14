public class leetcode88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] num=new int[n+m];
                int i=0;
                int j=0;
                int k=0;
                while(i<m && j<n){
                    if(nums1[i]>nums2[j]){
                        num[k]=nums2[j];
                        j++;
                        k++;
                    }
                    else{
                        num[k]=nums1[i];
                        i++;
                        k++;
                    }
                }
                while(i<m){
                    num[k]=nums1[i];
                    k++;
                    i++;
                }
                while(j<m){
                    num[k]=nums2[j];
                    k++;
                    j++;
                }
            return num;
    }
}
