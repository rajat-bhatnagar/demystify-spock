package spocks

import spock.lang.Specification

/**
 * Created by rajatbhatnagar on 1/18/16.
 */
class WithDemoSpec extends Specification {
    //Spock demonstrates with usage
    def "working with with"(){
        def employee = new Employee(name: "Rajat" , grade: 27)
        expect:
         with(employee){
             name  == "Rajat"
             grade ==  27
          }
    }
}
