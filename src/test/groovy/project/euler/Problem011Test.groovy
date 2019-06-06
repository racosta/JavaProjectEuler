package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem011Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 011"() {
      given:
      Problem011 p = new Problem011()

      when:
      def solution = p.execute()

      then:
      solution == 70600674.longValue()
   }
}
