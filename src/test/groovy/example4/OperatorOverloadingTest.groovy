package example4

import spock.lang.Specification

class OperatorOverloadingTest extends Specification {

    def "add fly and cutlet"() {
        given:
        def fly = new Fly(weight: 2)
        def cutlet = new Cutlet(weight: 5)

        when:
        def result = fly + cutlet

        then:
        result instanceof Fly
        Double.compare(result.weight, 7) == 0
    }

    def "add cutlet and fly"() {
        given:
        def fly = new Fly(weight: 2)
        def cutlet = new Cutlet(weight: 5)

        when:
        def result = cutlet + fly

        then:
        result instanceof Fly
        Double.compare(result.weight, 6) == 0
    }

}
