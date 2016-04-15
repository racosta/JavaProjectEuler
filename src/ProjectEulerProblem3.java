import Utility.PrimeSieve;
import java.lang.Math;
import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 3
 * @author Ryan Acosta
 * @version 4/14/2016.
 */
class ProjectEulerProblem3 {
    ProjectEulerProblem3(long N) {
        long t1 = System.nanoTime();

        ArrayList<Long> primes = PrimeSieve.primeSieve((long)Math.sqrt((double)N));

        for (int i = primes.size() - 1; i >= 0; --i) {
            if (N % primes.get(i) == 0) {
                System.out.println("Problem 3: " + primes.get(i));
                break;
            }
        }

        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
