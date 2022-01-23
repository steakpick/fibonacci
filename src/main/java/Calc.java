public class Calc {
    public static int countOfIteration = 0;

    private static void resetCountOfIteration(){
        countOfIteration = 0;
    }

    public static int firstCalculation(int n) {
        countOfIteration++; // calculate how many this function does call itself
        if(n < 2) return n;
        else return firstCalculation(n - 1) + firstCalculation(n - 2);
    }

    public static int secondCalculation(int n) {
        int i = 1;
        int j = 0;

        resetCountOfIteration(); // we should do reset of count number this function equate to zero
                                // count of iteration number

        for (int k = 1; k <= n; k++) {
            j += i;
            i = j - i;

            countOfIteration++;
        }

        return j;
    }

    public static int thirdCalculation(int n) {
        int i = 1;
        int j = 0;
        int k = 0;
        int h = 1;
        int t;

        resetCountOfIteration();

        while (n > 0) {
            if (n % 2 != 0){
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
            }
            t = sqr(h);
            h = 2 * k * h + t;
            k = sqr(k) + t;
            n = n / 2;

            countOfIteration++;
        }
        return j;
    }

    private static int sqr(int n){
        return n * n;
    }


}
