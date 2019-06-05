package project.euler;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Java solution for Project Euler problem 5
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
@Slf4j
public class Problem005 implements ProjectEulerProblem {
   private int n;

   public Problem005(int n) {
       this.n = n;
   }

   public Object execute() {
       long t1 = System.nanoTime();

       ArrayList<Integer> factors = new ArrayList<>();

       for (int i = 2; i <= this.n; ++i) {
           int temp = i;
           for (Integer factor : factors) {
             if (temp % factor == 0) {
                temp /= factor;
             }
          }
          if (temp != 1) {
             factors.add(temp);
          }
       }

       int ret = 1;
       for (Integer factor : factors) {
           ret *= factor;
       }
       log.info(String.format("Problem 5: %d", ret));
       log.info(String.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0));

       return ret;
   }
}
