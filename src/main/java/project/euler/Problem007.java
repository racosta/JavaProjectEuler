package project.euler;

import lombok.extern.slf4j.Slf4j;
import project.euler.utility.PrimeSieve;

import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 7
 *
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
@Slf4j
public class Problem007 implements ProjectEulerProblem {
   private int n;

   public Problem007(int n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();
      ArrayList<Long> primes = PrimeSieve.primeSieve(100000);

      long temp;
      boolean composite;
      while (primes.size() < n) {
         // Add more primes.
         temp = primes.get(primes.size() - 1);
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
      log.info(String.format("Problem 7: %d", primes.get(n - 1)));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));
      return primes.get(n - 1);
   }
}
