import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        // 1️⃣ Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        // 2️⃣ Slide the window
        for (int end = k; end < s.length(); end++) {

            // add new character
            if (vowels.contains(s.charAt(end))) {
                count++;
            }

            // remove old character
            if (vowels.contains(s.charAt(end - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
