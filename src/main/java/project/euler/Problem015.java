package project.euler;

import lombok.extern.slf4j.Slf4j;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Problem015 implements ProjectEulerProblem {
   private HashMap<Map.Entry<Integer, Integer>, Long> memoizedResults = new HashMap<>();
   private int n;

   public Problem015(int n) {
      this.n = n;
   }

   public Object execute() {
      long t1 = System.nanoTime();

      long numPaths = latticePaths(0, 0);

      log.info(String.format("Problem 15: %s", numPaths));
      log.info(String.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0));

      return numPaths;
   }

   private long latticePaths(int x, int y) {
      Map.Entry<Integer, Integer> k = new AbstractMap.SimpleEntry<>(x, y);
      if (memoizedResults.containsKey(k)) {
         return memoizedResults.get(k);
      }

      if (x == n && y == n) {
         long ret = 1L;
         memoizedResults.put(k, ret);
         return ret;
      }

      if (x == n) {
         long ret = latticePaths(x, y + 1);
         memoizedResults.put(k, ret);
         return ret;
      }

      if (y == n) {
         long ret = latticePaths(x + 1, y);
         memoizedResults.put(k, ret);
         return ret;
      }

      long ret = latticePaths(x + 1, y) + latticePaths(x, y + 1);
      memoizedResults.put(k, ret);
      return ret;
   }
}
