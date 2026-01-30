package problem.twopointer.p345;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int indexOne = 0;
        int indexTwo = s.length()-1;

        while (indexOne < indexTwo){
            if (!isVowels(arr[indexOne])){
                indexOne++;
            }

            if (!isVowels(s.charAt(indexTwo))){
                indexTwo--;
            }

            if (isVowels(s.charAt(indexOne)) && isVowels(s.charAt(indexTwo))){
                char temp = arr[indexOne];
                arr[indexOne] = arr[indexTwo];
                arr[indexTwo] = temp;

                indexOne++;
                indexTwo--;
            }

        }

        return new String(arr);
    }

    static boolean isVowels(char c) {
        if (c == 'a' || c =='e'|| c == 'i'|| c =='o' || c =='u'){
            return true;
        }
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


}