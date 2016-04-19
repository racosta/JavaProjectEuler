/**
 * Java solution for Project Euler problem 8
 * @author Ryan Acosta
 * @version 4/19/2016.
 */
class ProjectEulerProblem8 {
    ProjectEulerProblem8() {
        long t1 = System.nanoTime();

        String numbers = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        System.out.println("Problem 8: " + max_5_prod(numbers, 0));
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }

    /**
     * @param numbers String containing the data to consider
     * @param startPos Starting index in the string to consider
     * @return Maximum 5 digit product starting at position startPos.
     */
    private static long max_5_prod(String numbers, int startPos) {
        if (startPos > numbers.length() - 5)
            return 0;
        return Math.max(digit_5_prod(numbers, startPos), max_5_prod(numbers, startPos + 1));
    }

    /**
     * @param numbers String containing the data to consider
     * @param startPos Starting index in the string to multiply
     * @return Five digit product.
     */
    private static long digit_5_prod(String numbers, int startPos) {
        return Character.digit(numbers.charAt(startPos), 10) *
                Character.digit(numbers.charAt(startPos+1), 10) *
                Character.digit(numbers.charAt(startPos+2), 10) *
                Character.digit(numbers.charAt(startPos+3), 10) *
                Character.digit(numbers.charAt(startPos+4), 10);
    }
}
