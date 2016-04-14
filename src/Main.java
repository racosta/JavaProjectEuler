public class Main {

    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                new ProjectEulerProblem1(Integer.parseInt(args[0]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
