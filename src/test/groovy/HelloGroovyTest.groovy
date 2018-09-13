import spock.lang.Specification

class HelloGroovyTest extends Specification {

    def "check sayHello execution"() {
        setup:
        def helloWorld = new HelloGroovy()

        when:
        def res = helloWorld.sayHello()

        then:
        res == "hello groovy"
    }

}
