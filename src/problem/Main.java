package problem;

public class Main {
    public static void main(String[] args) {
       String num = "24a2bc";
       String ans = "";

        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))){
                ans += num.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
