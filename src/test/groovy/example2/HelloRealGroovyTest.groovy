package example2


import spock.lang.Specification

class HelloRealGroovyTest extends Specification {

    def "check sayHello execution"() {
        setup:
        def helloGroovy = new HelloRealGroovy()

        when:
        def result = helloGroovy.sayHello()

        then:
        result == "Hello Real Groovy"
    }

}

