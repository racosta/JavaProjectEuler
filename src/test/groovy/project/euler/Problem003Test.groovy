package project.euler

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class Problem003Test extends Specification {
   @Timeout(value = 60000, unit = TimeUnit.MILLISECONDS)
   def "test 003"() {
      given:
      Problem003 p3 = new Problem003(600851475143L )

      when:
      def solution = p3.execute()

      then:
      solution == 6857.longValue()
   }
}
