public class TrailZeros {
    public static int countTrailingZeroes(long fac) {
        //trailing zeroes;
        int count = 0;
        while (fac != 0) {
            if(fac % 10 != 0) return count;
            count++;
            fac /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        //factorial;
        int n = 25;
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println(countTrailingZeroes(fac));
    }
}