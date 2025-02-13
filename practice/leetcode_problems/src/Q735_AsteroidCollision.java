import java.util.Arrays;
import java.util.Stack;

public class Q735_AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids1 = {5,10,-5};
        int[] asteroids2 = {8,-8};
        int[] asteroids3 = {10,2,-5};

        System.out.println(Arrays.toString(asteroidCollision(asteroids1)));
        System.out.println(Arrays.toString(asteroidCollision(asteroids2)));
        System.out.println(Arrays.toString(asteroidCollision(asteroids3)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>();

        for(int asteroid : asteroids){
            if(asteroid > 0){
                asteroidStack.push(asteroid);
            }else{
                while(!asteroidStack.isEmpty() && asteroidStack.peek() > 0
                && asteroidStack.peek() < Math.abs(asteroid)){
                    asteroidStack.pop();
                }

                if(asteroidStack.isEmpty() || asteroidStack.peek() < 0){
                    asteroidStack.push(asteroid);
                }else if(asteroidStack.peek() + asteroid == 0)
                    asteroidStack.pop();
            }
        }

        int[] asteroidsAfterCollision = new int[asteroidStack.size()];

        for(int i=asteroidsAfterCollision.length-1;i>=0;i--){
            asteroidsAfterCollision[i] = asteroidStack.pop();
        }

        return asteroidsAfterCollision;
    }
}