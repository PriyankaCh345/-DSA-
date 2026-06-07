class Solution {

    private double power(double x, long n) {
        if (n == 0) return 1.0;

        if (n % 2 == 0) {
            double half = power(x, n / 2);
            return half * half;
        }

        return x * power(x, n - 1);
    }

    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }
}