package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem001Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 001"() {
      given:
      Problem001 p1 = new Problem001(1000)

      when:
      def solution = p1.execute()

      then:
      solution == 233168L.longValue()
   }
}