/**
 * Java solution for Project Euler problem 9
 * @author Ryan Acosta
 * @version 4/21/2016.
 */
class ProjectEulerProblem9 {
    ProjectEulerProblem9() {
        long t1 = System.nanoTime();

        boolean found = false;
        for (int a = 1; a < 998 && !found; ++a) {
            for (int b = a + 1; b < 999 && a + b < 1000; ++b) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("Problem 9: " + a * b * c);
                    found = true;
                    break;
                }
            }
        }

        System.out.format("Elapsed time: %f seconds.%n", (double)(System.nanoTime() - t1) / 1000000000.0);
    }
}
