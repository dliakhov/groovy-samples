package example8

import spock.lang.Specification

class HouseTest extends Specification {

    def "when address or count of people is missing house should be 'false'"() {
        setup:
        def houseWithoutCountOfPeople
        def houseWithoutAddress

        when:
        houseWithoutCountOfPeople = new House(address: "ul. Khreschatyk")
        houseWithoutAddress = new House(countOfPeople: 10)

        then:
        !houseWithoutCountOfPeople
        !houseWithoutAddress
    }

    def "when address and count of people exist house should be 'true'"() {
        setup:
        def house

        when:
        house = new House(address: "ul. Khreschatyk", countOfPeople: 10)

        then:
        house
    }

    def "show default Groovy truth"() {
        setup:
        def stub

        when:
        stub = 2

        then:
        !0
        1
        -1

        !""
        "hello"

        ![]
        [1, 2, 3]
    }

}
