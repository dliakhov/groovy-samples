package example1

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
