package project.euler;

import lombok.extern.slf4j.Slf4j;

/**
 * Java solution for Project Euler problem 1
 * @author Ryan Acosta
 * @version 4/14/2016.
 */
@Slf4j
public class Problem001 implements ProjectEulerProblem {
   private int n;

   public Problem001(int n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();
      long sum = 0;

      sum += sumOfMultiples(n -1, 3);
      sum += sumOfMultiples(n -1, 5);
      sum -= sumOfMultiples(n -1, 15);

      log.info(String.format("Problem 1: %d", sum));
      log.info(String.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0));

      return sum;
   }

   /**
    * This function returns the sum of the integers from 1 to n divisible by factor.
    * @param n Upper bound
    * @param factor Divisor
    * @return sum of integers 1 <= i <= n such that i is divisible by factor
    */
   private static long sumOfMultiples(int n, int factor) {
      int t = n / factor;
      return factor * (t * (t + 1)) / 2;
   }
}
