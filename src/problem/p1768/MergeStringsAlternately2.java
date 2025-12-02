package problem.p1768;

public class MergeStringsAlternately2 {
    public String mergeAlternately(String word1, String word2) {
        if (word1.isEmpty()) {
            return word2;
        }
        if (word2.isEmpty()) {
            return word1;
        }
        int one = 0;
        int two = 0;
        StringBuilder ans = new StringBuilder();

        while (word1.length() > one &&  word2.length() > two){
            ans.append(word1.charAt(one));
            ans.append(word2.charAt(two));
            one++;
            two++;
        }

        while (word1.length() > one){
            ans.append(word1.charAt(one));
            one++;
        }

        while (word2.length() > two){
            ans.append(word2.charAt(two));
            two++;
        }

        return ans.toString();
    }
}
