package project.euler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

   public static void main(String[] args) {
      try {
         if (args.length == 2) {
            ProjectEulerProblem p = null;
            switch (Integer.parseInt(args[0])) {
               case 1:
                  p = new Problem001(Integer.parseInt(args[1]));
                  break;
               case 2:
                  p = new Problem002(Integer.parseInt(args[1]));
                  break;
               case 3:
                  p = new Problem003(Long.parseLong(args[1]));
                  break;
               case 4:
                  p = new Problem004();
                  break;
               case 5:
                  p = new Problem005(Integer.parseInt(args[1]));
                  break;
               case 6:
                  p = new Problem006(Integer.parseInt(args[1]));
                  break;
               case 7:
                  p = new Problem007(Integer.parseInt(args[1]));
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
                  log.error(String.format("Project Euler problem # %s is not supported", args[0]));
            }
            if (p != null) {
               p.execute();
            }
         }
      } catch (Exception e) {
         log.error("Exception ", e);
      }
   }
}
