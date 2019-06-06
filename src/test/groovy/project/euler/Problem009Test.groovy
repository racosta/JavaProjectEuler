package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem009Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 009"() {
      given:
      Problem009 p = new Problem009()

      when:
      def solution = p.execute()

      then:
      solution == 31875000.longValue()
   }
}
