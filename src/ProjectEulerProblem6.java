/**
 * Java solution for Project Euler problem 6
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
class ProjectEulerProblem6 {
    ProjectEulerProblem6(int N) {
        long t1 = System.nanoTime();

        int sumN = N * (N + 1) / 2;
        int sum = 0;

        for (int i = 1; i <= N; ++i) {
            sum += i * (sumN - i);
        }
        System.out.println("Problem 6: " + sum);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
