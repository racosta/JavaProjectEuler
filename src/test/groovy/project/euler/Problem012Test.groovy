package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem012Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 012"() {
      given:
      Problem012 p = new Problem012(500L)

      when:
      def solution = p.execute()

      then:
      solution == 76576500.longValue()
   }
}
