package project.euler;

import lombok.extern.slf4j.Slf4j;
import project.euler.utility.PrimeSieve;

import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 10
 *
 * @author Ryan Acosta
 * @version 4/21/2016.
 */
@Slf4j
public class Problem010 implements ProjectEulerProblem {
   private long n;

   public Problem010(long n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();

      ArrayList<Long> primes = PrimeSieve.primeSieve(n);

      long sum = 0;
      for (Long p : primes) {
         sum += p;
      }

      log.info(String.format("Problem 10: %s", sum));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return sum;
   }
}
