package example7

import spock.lang.Specification

class GroovyClosureTest extends Specification {

    def "show closure work"() {
        given:
        def adder = { x, y -> x + y }

        when:
        def result = adder.call(2, 3)

        then:
        result == 5
    }

    def "test custom filter"() {
        given:
        def list = (0..3).toList()
        def filterOdd = { elem -> elem % 2 == 1 }

        when:
        def result = list.findAll(filterOdd)

        then:
        result == [1, 3]
    }

}
