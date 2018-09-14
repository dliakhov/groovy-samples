package example6

import spock.lang.Specification

class GroovyCollectionsTest extends Specification {

    def "check range operator"() {
        given:
        def rangeStep2
        def rangeStep3

        when:
        rangeStep2 = (1..10).step(2)
        rangeStep3 = (2.5..10).step(3)

        then:
        0..5 == [0, 1, 2, 3, 4, 5]
        0..<5 == [0, 1, 2, 3, 4] // exclusive
        5..0 == [5, 4, 3, 2, 1, 0] // range in decreasing value
        rangeStep2 == [1, 3, 5, 7, 9]
        rangeStep3 == [2.5, 5.5, 8.5]
    }

}
