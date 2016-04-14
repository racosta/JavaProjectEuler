/**
 * Created by SG0210832 on 4/14/2016.
 */
class ProjectEulerProblem2 {
    ProjectEulerProblem2(int N) {
        long t1 = System.nanoTime();
        int f1 = 1, f2 = 2;
        int sum = 0;

        while (f2 < N) {
            if (f2 % 2 == 0) {
                sum += f2;
            }

            int t = f1;
            f1 = f2;
            f2 += t;
        }

        System.out.println("Problem 2: " + sum);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
