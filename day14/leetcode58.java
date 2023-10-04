public class leetcode58 {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String l = "";
        for (String w : str) {
            l = w;
        }
        return l.length();
    }
}
