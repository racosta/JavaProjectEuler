package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem004Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 004"() {
      given:
      Problem004 p4 = new Problem004()

      when:
      def solution = p4.execute()

      then:
      solution == 906609.longValue()
   }
}
