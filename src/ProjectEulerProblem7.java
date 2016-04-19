import java.util.ArrayList;
import Utility.PrimeSieve;

/**
 * Java solution for Project Euler problem 7
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
class ProjectEulerProblem7 {
    ProjectEulerProblem7(int N) {
        long t1 = System.nanoTime();
        ArrayList<Long> primes = PrimeSieve.primeSieve(100000);

        long temp;
        boolean composite;
        while (primes.size() < N) {
            // Add more primes.
            temp = primes.get(primes.size()-1);
            composite = true;
            while (composite) {
                composite = false;
                temp += 2;
                // Check to see if temp is prime.
                for (long p : primes) {
                    if (temp % p == 0) {
                        composite = true;
                        break;
                    }
                }
            }
            primes.add(temp);
        }
        System.out.println(primes.get(N-1));
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
