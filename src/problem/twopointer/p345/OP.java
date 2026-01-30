package problem.twopointer.p345;


import static problem.twopointer.p345.Solution.isVowels;

public class OP {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!isVowels(arr[i])) {
                i++;
            } else if (!isVowels(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

}
