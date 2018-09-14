package example4

class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
    boolean completed

    def setPriority(priority) {
        this.priority = priority + 2
    }

}
