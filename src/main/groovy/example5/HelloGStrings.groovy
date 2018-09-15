package example5

class HelloGStrings {

    def name

    HelloGStrings(name) {
        this.name = name
    }

    def sayHelloString() {
        'Hello ' + name
    }

    def sayHelloGString() {
        "Hello ${name}"
    }

    def sayHelloMultilineString() {
        '''
            Hello
            ''' + name
    }

    def sayHelloMultilineGString() {
        """
            Hello
            ${name}
        """
    }

}
