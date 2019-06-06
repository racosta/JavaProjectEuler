package project.euler;

import lombok.extern.slf4j.Slf4j;

/**
 * Java solution for Project Euler problem 12
 *
 * @author Ryan Acosta
 * @version 3/10/2017.
 */
@Slf4j
class Problem012 implements ProjectEulerProblem {
   private long n;

   public Problem012(long n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();

      // Find first triangle number with more than N divisors

      long triangleNumber = 28;
      long nthNumber = 7;
      while (numFactors(triangleNumber) <= n) {
         ++nthNumber;
         triangleNumber += nthNumber;
      }

      log.info(String.format("Problem 12: %d the %dth triangle number", triangleNumber, nthNumber));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return triangleNumber;
   }

   /**
    * @param num The long integer number to consider
    * @return Number of natural number divisors
    */
   private static int numFactors(long num) {
      int numFactors = 2;
      for (long i = 2; i <= Math.sqrt(num); ++i) {
         if (num % i == 0) {
            if (i * i == num) {
               numFactors++;
            } else {
               numFactors += 2;
            }
         }
      }
      return numFactors;
   }
}
