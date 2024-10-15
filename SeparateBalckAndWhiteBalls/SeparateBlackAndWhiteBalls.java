package SeparateBalckAndWhiteBalls;

public class SeparateBlackAndWhiteBalls {
    public static void main(String[] args) {
        System.out.println(minimumSteps("11110000"));
        ;
    }
    public static long minimumSteps(String s){
        long steps = 0;
        long current_steps = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c=='0'){
                current_steps++;
            }
            else {
                steps += current_steps;
            }
        }
        return steps;
    }
}
