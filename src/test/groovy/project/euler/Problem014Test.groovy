package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem014Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 014"() {
      given:
      ProjectEulerProblem p = new Problem014(1000000)

      when:
      def solution = p.execute()

      then:
      solution == 837799.longValue()
   }
}
