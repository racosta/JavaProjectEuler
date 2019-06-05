package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem006Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 006"() {
      given:
      Problem006 p6 = new Problem006(100)

      when:
      def solution = p6.execute()

      then:
      solution == 25164150.longValue()
   }
}
