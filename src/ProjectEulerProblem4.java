import Utility.Palindrome;

/**
 * Java solution for Project Euler problem 4
 * @author Ryan Acosta
 * @version 4/15/2016.
 */
class ProjectEulerProblem4 {
    ProjectEulerProblem4() {
        long t1 = System.nanoTime();
        int maxPalindrome = 0;
        for( int n1 = 999; n1 >= 100; n1-- ) {
            for( int n2 = 999; n2 >= 100; n2-- ) {
                if( Palindrome.isPalindrome(n1*n2) && n1*n2 > maxPalindrome ) {
                    maxPalindrome = n1*n2;
                }
            }
        }
        System.out.println("Problem 4: " + maxPalindrome);
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
