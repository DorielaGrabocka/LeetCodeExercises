public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int x){
        int temp = x;
        int sum = 0;
        while(x>0){
            int remainder = x%10;
            sum = sum*10 + remainder;
            x = x/10;
        }
        if (sum==temp) return true;
        return false;
    }
}
