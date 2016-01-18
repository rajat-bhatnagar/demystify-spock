package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class WhereBlockMaxDemoSpec extends Specification {

    def "find max number using two sets of data"(int a , int b , int c){
        expect:
            Math.max(a,b) == c
            println 'max ' + c
        where:
            a | b | c
            1 | 3 | 3
            9 | 2 | 9
            8 | 2 | 8
    }
}
