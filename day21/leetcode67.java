public class leetcode67 {
    public String addBinary(String a, String b) {
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;
        String str = "";
        int c = 0;
        while (i >= 0 && j >= 0) {
            int l = b.charAt(j) - '0';
            int m = a.charAt(i) - '0';
            int p = (l + m + c) % 2;
            c = (l + m + c) / 2;
            i--;
            j--;
            str = p + str;
        }
        while (i >= 0) {
            int m = a.charAt(i) - '0';
            int p = (m + c) % 2;
            c = (m + c) / 2;
            str = p + str;
            i--;
        }
        while (j >= 0) {
            int l = b.charAt(j) - '0';
            int p = (l + c) % 2;
            c = (l + c) / 2;
            str = p + str;
            j--;
        }
        if (c == 1) {
            str = c + str;
        }
        return str;
    }
}
