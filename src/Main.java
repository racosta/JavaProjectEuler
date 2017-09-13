public class Main {

   public static void main(String[] args) {
      try {
         if (args.length == 2) {
            switch (Integer.parseInt(args[0])) {
               case 1:
                  new ProjectEulerProblem1(Integer.parseInt(args[1]));
                  break;
               case 2:
                  new ProjectEulerProblem2(Integer.parseInt(args[1]));
                  break;
               case 3:
                  new ProjectEulerProblem3(Long.parseLong(args[1]));
                  break;
               case 4:
                  new ProjectEulerProblem4();
                  break;
               case 5:
                  new ProjectEulerProblem5(Integer.parseInt(args[1]));
                  break;
               case 6:
                  new ProjectEulerProblem6(Integer.parseInt(args[1]));
                  break;
               case 7:
                  new ProjectEulerProblem7(Integer.parseInt(args[1]));
                  break;
               case 8:
                  new ProjectEulerProblem8();
                  break;
               case 9:
                  new ProjectEulerProblem9();
                  break;
               case 10:
                  new ProjectEulerProblem10(Long.parseLong(args[1]));
                  break;
               case 11:
                  new ProjectEulerProblem11();
                  break;
               case 12:
                  new ProjectEulerProblem12(Long.parseLong(args[1]));
                  break;
               case 13:
                  new ProjectEulerProblem13();
                  break;
               case 14:
                  new ProjectEulerProblem14(Integer.parseInt(args[1]));
                  break;
               default:
                  System.err.println("Project Euler problem # " + args[0] + "is not supported");
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
