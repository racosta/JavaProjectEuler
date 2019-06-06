package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem013Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 013"() {
      given:
      ProjectEulerProblem p = new Problem013()

      when:
      def solution = p.execute()

      then:
      solution == "5537376230"
   }
}
