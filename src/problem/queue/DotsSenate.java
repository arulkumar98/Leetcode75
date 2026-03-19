package problem.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DotsSenate {
    public String predictPartyVictory(String senate) {
        String r = "Radiant";
        String d = "Dire";
        Queue<Character> queue = new LinkedList<>();

        for (char ch : senate.toCharArray()){
            queue.offer(ch);
        }
        int toBan = 0;
        while (queue.size() > Math.abs(toBan)){
            if (toBan > 0 && queue.peek() == 'D'){
                queue.poll();
                toBan -=1;
            } else if (toBan < 0 && queue.peek() == 'R') {
                queue.poll();
                toBan += 1;
            }else {
                toBan += queue.peek() == 'R'?1:-1;
                queue.offer(queue.poll());
            }
        }
        return toBan > 0 ? r:d;
    }

    public String predictPartyVictory2(String senate) {

        Queue<Character> queue = new LinkedList<>();

        int toBan = 0;
        int rCount = 0, dCount = 0;

        for (char ch : senate.toCharArray()) {
            queue.offer(ch);
            if (ch == 'R') rCount++;
            else dCount++;
        }



        while (rCount > 0 && dCount > 0) {

            char ch = queue.poll();

            if (ch == 'R') {
                if (toBan < 0) {
                    // banned by Dire
                    toBan++;
                    rCount--;
                } else {
                    toBan++;
                    queue.offer(ch);
                }
            } else { // 'D'
                if (toBan > 0) {
                    // banned by Radiant
                    toBan--;
                    dCount--;
                } else {
                    toBan--;
                    queue.offer(ch);
                }
            }
        }

        return rCount > 0 ? "Radiant" : "Dire";
    }
}
