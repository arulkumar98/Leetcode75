package problem.twopointer.p443;

public class Solution {
    public int compress(char[] chars) {
        int write = 0;   // where we write compressed result
        int read = 0;    // where we read original chars

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times currentChar repeats
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if > 1
//            if (count > 1) {
//                for (char c : String.valueOf(count).toCharArray()) {
//                    chars[write++] = c;
//                }
//            }


            if (count > 1) {

                // Step 1: find how many digits
                int temp = count;
                int digits = 0;
                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }

                // Step 2: write digits from right to left
                int pos = write + digits - 1;
                temp = count;

                while (temp > 0) {
                    chars[pos--] = (char) ('0' + (temp % 10));
                    temp /= 10;
                }

                write += digits;
            }
        }

        return write; // new compressed length
    }
}
