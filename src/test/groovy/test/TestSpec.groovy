package test

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

@Unroll
class TestSpec extends Specification {

  @Subject
  Test test = new Test()

  def "should add #left and #right"() {
    when:
    def actualSum = test.add(left, right)

    then:
    actualSum == expectedSum

    where:
    left | right | expectedSum
    1    | 2     | 3
    6    | 3     | 10
    3    | 6     | 10
  }

}
