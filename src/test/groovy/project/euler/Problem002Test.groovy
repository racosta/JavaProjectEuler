package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem002Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 002"() {
      given:
      Problem002 p2 = new Problem002(4000000)

      when:
      def solution = p2.execute()

      then:
      solution == 4613732L.longValue()
   }
}
