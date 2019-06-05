package project.euler;

import lombok.extern.slf4j.Slf4j;
import project.euler.utility.Palindrome;

/**
 * Java solution for Project Euler problem 4
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
@Slf4j
public class Problem004 implements ProjectEulerProblem {
   public Problem004() {
   }

   public Object execute() {
      long t1 = System.nanoTime();
      int maxPalindrome = 0;
      for (int n1 = 999; n1 >= 100; n1--) {
         for (int n2 = 999; n2 >= 100; n2--) {
            if (Palindrome.isPalindrome(n1 * n2) && n1 * n2 > maxPalindrome) {
               maxPalindrome = n1 * n2;
            }
         }
      }

      log.info(String.format("Problem 4: %d", maxPalindrome));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return maxPalindrome;
   }
}
