package problem.p1071;

import java.util.LinkedHashSet;
import java.util.Set;

public class GreatestCommonDivisorOfString {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()){
            if (str1.charAt(i) == str2.charAt(j)){
                set.add(str1.charAt(i));
            }

            i++;
            j++;
        }

        for (char c : set){
            sb.append(c);
        }

        return sb.toString();
    }
}
