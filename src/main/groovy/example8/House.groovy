package example8

class House {

    String address
    int countOfPeople

    def asBoolean() {
        address && countOfPeople
    }

}
