package powerOfTwo;

public class PowerOFTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(3));

    }
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
}
