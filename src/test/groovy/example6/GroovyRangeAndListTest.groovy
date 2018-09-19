package example6

import spock.lang.Specification

class GroovyRangeAndListTest extends Specification {

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

    def "show list in Groovy"() {
        given:
        def list
        def elem
        def bigList

        when:
        list = [0, 1, 2, 3]
        elem = list[2]
        bigList = (1..100).toList()

        then:
        list.size() == 4
        list instanceof ArrayList
        elem == 2
        bigList instanceof ArrayList
    }

    def "show list in Groovy 2"() {
        given:
        def bigList

        when:
        bigList = (1..100).toList()

        then:
        bigList[0..3] == [1, 2, 3, 4]
        bigList[0, 5, 99] == [1, 6, 100]

        bigList[-1] == 100
        bigList[-1..-4] == [100, 99, 98, 97]
        bigList[-100] == 1
    }


    def "show methods in list"() {
        given:
        def list

        when:
        list = (1..5).toList()
        def findTwo = list.find {it % 2 == 0}
        def findEven = list.findAll {it % 2 == 0}

        def store = 0
        list.each { store += it}

        then:
        findTwo == 2
        findEven == [2, 4]
        store == 15
    }

}
