package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class DataPipeDemoSpec extends Specification{
    // A data pipe indicated by the left shift operator , << connects a
    // data variable to the data provider . The data provider holds all values
    // for the variable , one time per iteration

    //This includes objects of type Collection, String , Iterable and objects
    // implementing the Iterable contract
    def "data pipe demo"(){
        expect:
            Math.max(a,b) == c
        where:
            a << [2,8,1]
            b << [9,3,4]
            c << [9,8,4]
    }
}
