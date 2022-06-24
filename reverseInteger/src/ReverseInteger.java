import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x){
        int reverse = 0;
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x=-x;
        }
        while(x>0){
            if(reverse > Integer.MAX_VALUE/10)
                return 0;
            reverse = reverse*10 + (x%10);
            x=x/10;
        }
        if(reverse > Integer.MAX_VALUE){
            return 0;
        }
        if(isNegative)
            return -reverse;

        return reverse;
    }
}
