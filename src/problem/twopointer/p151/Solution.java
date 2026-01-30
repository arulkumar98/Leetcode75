package problem.twopointer.p151;

class Solution {
    public String reverseWords(String s) {
        int lastIndex = s.length() - 1;
        int startIndex = 0;
        StringBuilder sb = new StringBuilder();

        while (lastIndex >= 0) {
           //skip space from end
            while (lastIndex >= 0 && s.charAt(lastIndex) == ' '){
                lastIndex --;
            }
            // break check
            if (lastIndex < 0){
                break;
            }

            // find the starting point
            startIndex = lastIndex;
            while (startIndex >= 0 && s.charAt(startIndex) != ' '){
                startIndex --;
            }

            //add space in ans
            if (sb.length() > 0){
                sb.append(' ');
            }

            sb.append(s,startIndex,lastIndex);

            lastIndex = startIndex -1;
        }

        return sb.toString();
    }
}