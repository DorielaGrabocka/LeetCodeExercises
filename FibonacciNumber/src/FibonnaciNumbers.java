public class FibonnaciNumbers {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int[] array = new int[n+1];
        if (n==0 || n==1) return n;
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array[n];
    }
}
