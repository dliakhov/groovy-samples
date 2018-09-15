package example5

import spock.lang.Specification

class HelloGStringsTest extends Specification {

    def helloGStrings
    def setup() {
        helloGStrings = new HelloGStrings("Test")
    }

    def "check sayHelloString execution"() {
        when:
        def result = helloGStrings.sayHelloString()

        then:
        result == 'Hello Test'
    }

    def "check sayHelloGString execution"() {
        when:
        def result = helloGStrings.sayHelloGString()

        then:
        result == 'Hello Test' // call compareTo then equals!
        !result.equals('Hello Test') // false here
    }

    def "check sayHelloMultilineString execution"() {
        given:
        def expectedResult =
        '''
            Hello
            Test'''

        when:
        def result = helloGStrings.sayHelloMultilineString()

        then:
        result == expectedResult
    }

    def "check sayHelloMultilineGString execution"() {
        given:
        def expectedResult =
        """
            Hello
            Test
        """

        when:
        def result = helloGStrings.sayHelloMultilineGString()

        then:
        result == expectedResult
    }

}
