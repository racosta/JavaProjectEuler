package project.euler;

/**
 * Java solution for Project Euler problem 8
 * @author Ryan Acosta
 * @version 4/19/2016.
 */
class ProjectEulerProblem8 {
    ProjectEulerProblem8() {
        long t1 = System.nanoTime();

        String numbers = "73167176531330624919225119674426574742355349194934" +
        "96983520312774506326239578318016984801869478851843" +
        "85861560789112949495459501737958331952853208805511" +
        "12540698747158523863050715693290963295227443043557" +
        "66896648950445244523161731856403098711121722383113" +
        "62229893423380308135336276614282806444486645238749" +
        "30358907296290491560440772390713810515859307960866" +
        "70172427121883998797908792274921901699720888093776" +
        "65727333001053367881220235421809751254540594752243" +
        "52584907711670556013604839586446706324415722155397" +
        "53697817977846174064955149290862569321978468622482" +
        "83972241375657056057490261407972968652414535100474" +
        "82166370484403199890008895243450658541227588666881" +
        "16427171479924442928230863465674813919123162824586" +
        "17866458359124566529476545682848912883142607690042" +
        "24219022671055626321111109370544217506941658960408" +
        "07198403850962455444362981230987879927244284909188" +
        "84580156166097919133875499200524063689912560717606" +
        "05886116467109405077541002256983155200055935729725" +
        "71636269561882670428252483600823257530420752963450";

        int[] intArray = new int[numbers.length()];
        for (int i = 0; i < intArray.length - 1; ++i) {
            intArray[i] = Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println("Problem 8: " + max_13_prod(intArray, 0));
        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }

    /**
     * @param numbers String containing the data to consider
     * @param startPos Starting index in the string to consider
     * @return Maximum 13 digit product starting at position startPos.
     */
    private static long max_13_prod(int[] numbers, int startPos) {
        if (startPos > numbers.length - 13)
            return 0;

        return Math.max(max_13_prod(numbers, startPos + 1), digit_13_prod(numbers, startPos));
    }

    /**
     * @param numbers String containing the data to consider
     * @param startPos Starting index in the string to multiply
     * @return Thirteen digit product.
     */
    private static long digit_13_prod(int[] numbers, int startPos) {
        long ret = numbers[startPos];
        for (int i = 1; i < 13; ++i) {
            if (ret == 0)
                return ret;
            ret *= numbers[startPos+i];
        }
        return ret;
    }
}
