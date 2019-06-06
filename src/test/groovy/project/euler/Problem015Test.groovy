package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem015Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 015"() {
      given:
      ProjectEulerProblem p = new Problem015(20)

      when:
      def solution = p.execute()

      then:
      solution == 137846528820.longValue()
   }
}
