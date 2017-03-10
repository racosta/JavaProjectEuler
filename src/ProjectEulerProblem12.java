/**
 * Java solution for Project Euler problem 12
 * @author Ryan Acosta
 * @version 3/10/2017.
 */
class ProjectEulerProblem12 {
   ProjectEulerProblem12(long N) {
      long t1 = System.nanoTime();

      // Find first triangle number with more than N divisors

      long triangleNumber = 28;
      long nthNumber = 7;
      while (numFactors(triangleNumber) <= N) {
         ++nthNumber;
         triangleNumber += nthNumber;
      }

      System.out.println("Problem 12: " + triangleNumber + " the " + nthNumber + "th triangle number");
      System.out.format("Elapsed time: %f seconds.%n", (double) (System.nanoTime() - t1) / 1000000000.0);
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
