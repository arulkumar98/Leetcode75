package problem.p392;

public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() < 1) return true;
        if (t.length() < 1) return false;

        int count = 0;
        for (char ch : t.toCharArray()){
            if (ch == s.charAt(count)){
                count ++;
            }
            if (count == s.length()) return true;
        }
        return count == s.length();
    }


    public boolean isSubsequence2(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
        }
        return i == s.length();
    }

}
