package example4

import spock.lang.Specification

class GroovyTaskTest extends Specification {

    def "check map-based constructor"() {
        given:
        def date = new Date()

        when:
        def task = new GroovyTask(name: "test", completed: true, endDate: date, priority: 1, startDate: date)

        then:
        task.completed
        task.name == "test"
        task.endDate == date
        task.priority == 3
        task.startDate == date
    }

    def "check generated setters and getters"() {
        given:
        def date = new Date()
        def task = new GroovyTask()

        when:
        task.completed = false
        task.name = "test2"
        task.endDate = date
        task.priority = 3
        task.startDate = date

        then:
        !task.completed
        task.name == "test2"
        task.endDate == date
        task.priority == 5
        task.startDate == date
    }


    def "check access field like array element"() {
        given:
        def date = new Date()
        def task = new GroovyTask()

        when:
        task.completed = false
        task.name = "test2"
        task.endDate = date
        task.priority = 3
        task.startDate = date

        then:
        !task["completed"]
        task["name"] == "test2"
        task["endDate"] == date
        task["priority"] == 5
        task["startDate"] == date
    }

}
