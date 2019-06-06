package project.euler;

import lombok.extern.slf4j.Slf4j;

/**
 * Java solution for Project Euler problem 9
 *
 * @author Ryan Acosta
 * @version 4/21/2016.
 */
@Slf4j
public class Problem009 implements ProjectEulerProblem {
   public Problem009() {
   }

   public Object execute() {
      long t1 = System.nanoTime();

      boolean found = false;
      long prod = 0;
      for (int a = 1; a < 334 && !found; ++a) {
         for (int b = a + 1; b < 500 && a + b < 1000; ++b) {
            int c = 1000 - a - b;
            if (a * a + b * b == c * c) {
               prod = a * b * c;
               found = true;
               break;
            }
         }
      }

      log.info(String.format("Problem 9: %s", prod));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return prod;
   }
}
