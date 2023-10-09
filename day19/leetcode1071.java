public class leetcode1071 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        while (len1 != 0) {
            len1 = len1 % len2;
            len2 = len2 - len1;
        }
        return str1.substring(0, len2);
    }
}
