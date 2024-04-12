package PowXN;

public class PowXN {
    public static void main(String[] args) {
        System.out.println(myPow(2, 31));
    }

    public static double myPow(double x, int n) {

//        double result = 1;
//        if(n<0){
//            n=-n;
//            x=1/x;
//        }
//        for (int i = 1; i <= n; i++) {
//            result*=x;
//        }
//        return result;
        return Math.pow(x, n);
    }

}
