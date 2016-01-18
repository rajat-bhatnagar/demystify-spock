package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/18/16.
 */
class OldDemoSpec extends Specification{
    //Syntax of old is old(expression)

    def "looking at old lists"(){
        def list = [ 2,5 ,6]
        //Adding one more element to list
        when:
        list << 4
        then:
        //assert the size
        list.size() == 4
        //assert that the size of old list when element was not added was 3
        old(list.size()) == 3
    }

    def "looking at old maps"(){
        def map = [:]
        map.example = "initialMap"

        when:
            map.example = "new"
        then:
            map.example == "new"
            old(map.example) == "initialMap"
            map.example != old(map.example)
    }
}
