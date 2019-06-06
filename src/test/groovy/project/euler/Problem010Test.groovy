package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem010Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 010"() {
      given:
      Problem010 p = new Problem010(2000000L)

      when:
      def solution = p.execute()

      then:
      solution == 142913828922.longValue()
   }
}
