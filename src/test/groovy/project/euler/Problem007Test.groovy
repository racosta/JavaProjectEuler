package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem007Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 007"() {
      given:
      Problem007 p7 = new Problem007(10001)

      when:
      def solution = p7.execute()

      then:
      solution == 104743.longValue()
   }
}
