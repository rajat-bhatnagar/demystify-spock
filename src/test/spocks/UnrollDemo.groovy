package spocks

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by rajatbhatnagar on 1/17/16.
 */

class UnrollDemo extends Specification {
    // A method annotated with @Unroll will have its iterations reported independently

    // The method name uses placeholders denoted by #a , #b and #c to refer to data
    // variables a , b and c
    @Unroll
    def "max of #a and #b is #c" (){
        expect:
            Math.max(a,b) == c
            Thread.sleep(3000)
        where:
        a  | b  | c
        12 | 13 | 13
        15 | 11 | 15
        90 | 99 | 99
    }
}
