package example1

import example1.HelloJava
import spock.lang.Specification

class HelloJavaTest extends Specification {

    def "check sayHello"() {
        setup:
        def helloJava = new HelloJava()

        when:
        def result = helloJava.sayHello()

        then:
        result == "hello Java"
    }

}
