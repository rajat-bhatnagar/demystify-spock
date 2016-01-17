package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class ExceptionSpec extends Specification{

  def "division by zero"(){
      given :
       def numberOne = 10
      def numberTwo = 0
      when: // stimulus
        numberOne/numberTwo
      then: // response
       Exception e = thrown()
      // This reads like this
      // When an exception is thrown it of type Division by zero
       e.toString() == "java.lang.ArithmeticException: Division by zero"
       print e
  }
}
