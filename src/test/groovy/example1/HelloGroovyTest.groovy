package example1

import example1.HelloGroovy
import spock.lang.Specification

class HelloGroovyTest extends Specification {

    def "check sayHello execution"() {
        setup:
        def helloGroovy = new HelloGroovy()

        when:
        def result = helloGroovy.sayHello()

        then:
        result == "hello Groovy"
    }

}
