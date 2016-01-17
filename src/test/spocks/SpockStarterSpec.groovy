package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/17/16.
 */
class SpockStarterSpec extends Specification {
    def "spock kickoff"(){

        expect:
        name.size() ==5
        where:
        name    | length
        "rajat" |  5
        "Rishi" |  5
    }

}
