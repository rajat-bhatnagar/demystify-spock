package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class ExpectDemo extends Specification {
    //Use expense when it makes sense to have
    //both stimuli and response in a single expression

    def "Get the maximum number"(){
        when:
            def maxNum = Math.max(10 , 12)
        then:
            maxNum == 12
            print maxNum
    }

    // The above syntax for when then works but it would be
    // more neater to use expect here

    def "Get max number"(){
        expect:
         Math.max(10,12) == 12
    }
}
