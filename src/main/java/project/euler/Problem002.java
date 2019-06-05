package project.euler;

import lombok.extern.slf4j.Slf4j;

/**
 * Java solution for Project Euler problem 2
 * @author Ryan Acosta
 * @version 4/14/2016.
 */
@Slf4j
public class Problem002 implements ProjectEulerProblem {
   private int n;

   public Problem002(int n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();
      int f1 = 1;
      int f2 = 2;
      int sum = 0;

      while (f2 < n) {
         if (f2 % 2 == 0) {
            sum += f2;
         }

         int t = f1;
         f1 = f2;
         f2 += t;
      }

      log.info(String.format("Problem 2: %d", sum));
      log.info(String.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0));
      return sum;
   }
}
