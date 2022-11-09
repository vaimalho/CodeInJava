package leetcodeeasy;

public class PowerOfFour {
    public static void main(String[] args) {

    }

    // Time Complexity: O(logN)
    // SPace Complexity: O(1)
    public static boolean isPowerOfFour(int n) {

        if(n==0)
            return false;
        long i=1;
        while(n%4==0 && i<n){
            i *= 4;
        }
        return n==i;
    }

    // Time Complexity: O(logN)
    // SPace Complexity: O(1)
    public static boolean isPowerOfFour1(int n) {

        if(n==0)
            return false;

        while(n%4==0)
            n=n/4;

        return n==1;
    }

    // Time Complexity: O(1)
    // SPace Complexity: O(1)
    public static boolean isPowerOfFour2(int n) {

        if(n==0)
            return false;
        return (Math.log10(n)/Math.log10(4)) % 1 == 0;
    }
}
