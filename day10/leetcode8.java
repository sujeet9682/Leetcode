public class leetcode8 {
    public int myAtoi(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
            if (i > s.length()) {
                return 0;
            }
        }

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        if (i >= s.length()) {
            return 0;
        }
        long total = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int n = s.charAt(i) - '0';
            total = total * 10 + n;
            if (sign == -1 && -1 * total <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (total > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (sign == 1) ? (int) total : -1 * (int) total;
    }
}
