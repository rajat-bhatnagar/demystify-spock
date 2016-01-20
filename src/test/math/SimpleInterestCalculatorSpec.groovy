package math

import spock.lang.FailsWith
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by rajatbhatnagar on 1/19/16.
 */
class SimpleInterestCalculatorSpec extends Specification{
    SimpleInterestCalculator calculator
    def setup(){
        calculator = new SimpleInterestCalculator(rate:10)
    }
    def "test interest calculation"(){
        when:
            def interest = calculator.calculate(100,2)
        then:
           interest == 2000
           0 * _ //No More invocations
    }
    def "test interest calculation using expects"(){
        expect:
         1000 == calculator.calculate(10,10)
    }
    def "interest calculation using expects"(){
        expect:
            interest == calculator.calculate(amount, year)
        where:
            interest << [100 , 2000]
            amount   << [1,2]
            year     << [10,100]
    }
    @Unroll
    def "Showing Values : #interest where rate is #rate, year is #year and amount is #amount "(){
        expect:
            interest == calculator.calculate(amount , year)
            Thread.sleep(2000)
        where:
            interest <<  [1000,4000,9000]
            amount   <<  [1,2,3]
            year     <<  [100,200,300]
    }
    def "Values for amount and year in a table"(){
        expect:
            interest == calculator.calculate(amount, year)
        where:
            amount | year | interest
            10     | 10   |1000
            20     | 10   |2000
            30     | 10   |3000
            40     | value()   |4000
    }

    //Illustrating how a helper method can be used in a data table, See above
    def value(){
        1 * 10
    }
    //Illustrating how to use @FailsWith SPOCK annotation

    @FailsWith(java.lang.IllegalArgumentException)
    def "Illustrating failed test case with @FailsWith annotation"(){
        expect:
           calculator.calculate(100, -9)
    }

}
