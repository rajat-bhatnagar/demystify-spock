package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class NoExceptionSpec extends Specification{
    def "HashMap accepts null key"(){
        setup:
            def map =new HashMap()
        when:
            map.put(null , "element")
        then:
         notThrown(NullPointerException)
    }
}
