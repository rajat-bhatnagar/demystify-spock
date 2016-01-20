package math

/**
 * Created by rajatbhatnagar on 1/20/16.
 */
class SICalculatorGroovyTestCaseDemoSpec extends GroovyTestCase {

    //NOTE: Auto complete is not working in intellij for some reason
    // Also setUp method as U as CAPITAL .. DO not forget this in case you plan to extend groovy test case

    def interestCalculator

    protected void setUp() throws Exception{
        interestCalculator = new SimpleInterestCalculator(rate : 10)
    }

    public void testCalculateInterest(){
        double interest = interestCalculator.calculate(10,10)
        assert interest == 1000.0
    }

    public void testIllegalCalculate(){
        shouldFail(){
            interestCalculator.calculate(10,-2)
        }
    }

}
