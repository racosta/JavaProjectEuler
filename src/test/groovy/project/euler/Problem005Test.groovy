package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem005Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 005"() {
      given:
      Problem005 p5 = new Problem005(20)

      when:
      def solution = p5.execute()

      then:
      solution == 232792560.longValue()
   }
}
