package example6

import spock.lang.Specification

class GroovyMapTest extends Specification {

    def "show map in Groovy"() {
        setup:
        def map
        def emptyMap

        when:
        map = [1:"1", 2:true, 3:1.2]
        emptyMap = [:]

        then:
        map.size() == 3
        map instanceof HashMap
        map[2] == true

        emptyMap.size() == 0
    }

    def "show map in Groovy 2"() {
        setup:
        def map

        when:
        map = [a: 1, b: 2, c: 3]
        map.c = 5 // access to element

        map['d'] = 10 // add new one
        map.e = 11 // add another one

        then:
        map.a == 1
        map['b'] == 2
        map.c == 5

        map.d == 10
        map.e == 11
    }

    def "show map iteration"() {
        setup:
        def map

        when:
        map = [a: 1, b: 2, "c": 3]
        map.each {entry ->
            println "$entry.key = $entry.value"
        }

        then:
        map.every { it.key instanceof String }
    }

}
