package problem.stack;

import java.util.Stack;

public class Asteroid {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>(); // stack keeps surviving asteroids

        for (int rock : asteroids) { // process each asteroid

            boolean destroyed = false; // to check if current asteroid is destroyed

            // collision condition
            while (!stack.isEmpty() && rock < 0 && stack.peek() > 0) {

                // if stack asteroid smaller → it explodes
                if (stack.peek() < -rock) {
                    stack.pop();          // remove smaller asteroid
                    continue;             // check next asteroid in stack
                }

                // both same size → both explode
                else if (stack.peek() == -rock) {
                    stack.pop();
                }

                // current asteroid destroyed
                destroyed = true;
                break;
            }

            // if current asteroid survived → push it
            if (!destroyed) {
                stack.push(rock);
            }
        }

        // convert stack to array
        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }

}
