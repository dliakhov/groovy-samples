package example3

class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
    boolean completed

    def getPriority() {
        this.priority + 2
    }

}
