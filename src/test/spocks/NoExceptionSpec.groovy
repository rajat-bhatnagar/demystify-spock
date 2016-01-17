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
            map.put(null , "element1")
             map.put(null , "element2")
        //HashMap allows only 1 null key element
        then:
         notThrown(NullPointerException)
        map.size() == 1
        print(map.getAt(null)) // This is element2
    }
}
