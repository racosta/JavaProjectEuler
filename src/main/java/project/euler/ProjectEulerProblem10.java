package project.euler;

import project.euler.utility.PrimeSieve;

import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 10
 * @author Ryan Acosta
 * @version 4/21/2016.
 */
class ProjectEulerProblem10 {
    ProjectEulerProblem10(long N) {
        long t1 = System.nanoTime();

        ArrayList<Long> primes = PrimeSieve.primeSieve(N);

        long sum = 0;
        for (Long p: primes) {
            sum += p;
        }

        System.out.println("Problem 10: " + sum);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
