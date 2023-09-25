public class leetcode5 {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = Expandfromcenter(s, i, i + 1);
            int l2 = Expandfromcenter(s, i, i);
            int l = Math.max(l1, l2);

            if (end - start < l) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }
        return s.substring(start, end + 1);

    }

    int Expandfromcenter(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
