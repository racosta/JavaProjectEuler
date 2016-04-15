import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 5
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
class ProjectEulerProblem5 {
    ProjectEulerProblem5(int N) {
        long t1 = System.nanoTime();

        ArrayList<Integer> factors = new ArrayList<Integer>();

        int temp;
        for (int n = 2; n <= N; ++n) {
            temp = n;
            for (int p = 0; p < factors.size(); ++p) {
                if (temp % factors.get(p) == 0) {
                    temp /= factors.get(p);
                }
            }
            if (temp != 1) {
                factors.add(Integer.valueOf(temp));
            }
        }

        int ret = 1;
        for (int i = 0; i < factors.size(); ++i) {
            ret *= factors.get(i);
        }
        System.out.println("Problem 5: " + ret);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
