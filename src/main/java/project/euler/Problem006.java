package project.euler;

import lombok.extern.slf4j.Slf4j;

/**
 * Java solution for Project Euler problem 6
 *
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
@Slf4j
public class Problem006 implements ProjectEulerProblem {
   private int n;

   public Problem006(int n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();

      int sumN = n * (n + 1) / 2;
      int sum = 0;

      for (int i = 1; i <= n; ++i) {
         sum += i * (sumN - i);
      }
      log.info(String.format("Problem 6: %d", sum));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return sum;
   }
}
