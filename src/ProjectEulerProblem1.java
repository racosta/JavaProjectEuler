/**
 * Java solution for Project Euler problem 2
 * @author Ryan Acosta
 * @version 4/14/2016.
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

    /**
     * This function returns the sum of the integers from 1 to N divisible by factor.
     * @param N Upper bound
     * @param factor Divisor
     * @return sum of integers 1 <= i <= N such that i is divisible by factor
     */
    private long sumOfMultiples(int N, int factor) {
        int t = N / factor;
        return factor * (t * (t + 1)) / 2;
    }
}
