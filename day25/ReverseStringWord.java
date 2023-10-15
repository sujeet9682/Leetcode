public class ReverseStringWord {
    public String reverseWords(String s) {
        String[] sr = s.trim().split("\\s+");
        int j = sr.length;
        String st = "";
        for (int i = j - 1; i > 0; i--) {
            st = st + sr[i] + " ";
        }
        return st + sr[0];
    }
}
