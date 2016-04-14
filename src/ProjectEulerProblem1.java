/**
 * Created by SG0210832 on 4/14/2016.
 */
class ProjectEulerProblem1 {
    ProjectEulerProblem1(int N) {
        long t1 = System.nanoTime();
        long sum = 0;

        sum += sumOfMultiples(N-1, 3);
        sum += sumOfMultiples(N-1, 5);
        sum -= sumOfMultiples(N-1, 15);

        System.out.println("Problem 1: " + sum);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }

    private long sumOfMultiples(int N, int factor) {
        int t = N / factor;
        return factor * (t * (t + 1)) / 2;
    }
}
