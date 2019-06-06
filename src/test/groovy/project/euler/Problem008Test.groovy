package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem008Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 008"() {
      given:
      Problem008 p8 = new Problem008()

      when:
      def solution = p8.execute()

      then:
      solution == 23514624000.longValue()
   }
}
