/**
 * Java solution for Project Euler problem 14
 * @author Ryan Acosta
 * @version 3/10/2017.
 */

import java.util.*;

class ProjectEulerProblem14 {
   private HashMap<Integer, Integer> memoizedResults = new HashMap<>();

   ProjectEulerProblem14(int N) {
      long t1 = System.nanoTime();

//      for (int n = 2; n < N; ++n) {
//         collatz(n);
//      }
//
//      int max = 1;
//      int maxIdx = -1;
//      for (int i = 2; i < N - 1; ++i) {
//         if (memoizedResults.get(i) > max) {
//            max = memoizedResults.get(i);
//            maxIdx = i;
//         }
//      }

//      int num = 0;
//      int maxCycles = 0;
//      for (int i = 2; i < N; ++i) {
//         int cycles = threeNPlusOne(i, 1);
//         if (cycles > maxCycles) {
//            maxCycles = cycles;
//            num = i;
//         }
//      }

      HashMap<Long, Integer> map = new HashMap<>();
      map.put(1L, 1);
      List<Long> path = new ArrayList<>();
      for (long i = 1; i < N; i += 2)
      {
         //path.clear();
         long temp = i;
         int count = 1;
         while (temp > 1)
         {
            Optional<Integer> preexisting = Optional.ofNullable(map.get(temp));
            if (preexisting.isPresent())
            {
               count += preexisting.get() - 1;
               break;
            }
            else if ((temp & 1) == 1)
            {
               //path.add(temp);
               temp *= 3;
               ++temp;
               //path.add(temp);
               temp /= 2;
               count += 2;
            }
            else
            {
               //path.add(temp);
               temp /= 2;
               count++;
            }
         }
         map.put(i, count);
//         for (Long p_start : path) {
//            map.put(p_start, count--);
//         }
      }
      long max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
      long key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
      System.out.println(max + " " + key);

      System.out.println("Problem 14: " + max);
      System.out.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0);
   }

   private int threeNPlusOne(int n, int currentCycle) {
      if (n == 1) {
         return currentCycle;
      }
      if (n % 2 == 0) {
         n /= 2;
      } else {
         n = 3 * n + 1;
      }
      return threeNPlusOne(n, ++currentCycle);
   }

   private int collatz(int n) {
      if (n == 1) {
         return 1;
      }

      int m = n;
      int i = 1;
      while (n > 1) {
         if (memoizedResults.containsKey(n)) {
            memoizedResults.put(m, 1 + memoizedResults.get(n));
            return memoizedResults.get(m);
         }

         if (n % 2 == 0) {
            n /= 2;
         } else {
            n = 3 * n + 1;
         }

         ++i;
      }
      memoizedResults.put(m, i);

      return i;
   }

   private Integer collatzSequenceLength(Integer n) {
      if (n == 1) {
         return 1;
      }

      if (memoizedResults.containsKey(n)) {
         return memoizedResults.get(n);
      }

      if (n % 2 == 0) {
         Integer result = 1 + collatzSequenceLength(n / 2);
         memoizedResults.put(n, result);
         return result;
      }
      Integer result = 1 + collatzSequenceLength(3 * n + 1);
      memoizedResults.put(n, result);
      return result;
   }
}
