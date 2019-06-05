package project.euler;

import lombok.extern.slf4j.Slf4j;
import project.euler.utility.PrimeSieve;

import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 3
 * @author Ryan Acosta
 * @version 4/14/2016.
 */
@Slf4j
public class Problem003 implements ProjectEulerProblem {
   private long n;

   Problem003(long n) {
       this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();

      ArrayList<Long> primes = PrimeSieve.primeSieve((long)Math.sqrt((double) n));

      Long p = 0L;

      for (int i = primes.size() - 1; i >= 0; --i) {
         if (n % primes.get(i) == 0) {
            p = primes.get(i);
            break;
         }
      }

      log.info(String.format("Problem 3: %d", p));
      log.info(String.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0));
      return p;
   }
}
