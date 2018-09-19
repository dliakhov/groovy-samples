package example3

class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
    boolean completed

    def getName() {
        "Task: " + this.name
    }

    def addTask(GroovyTask task, int additionalPriority = 0) {
        new GroovyTask(name: task.name, priority: task.priority + additionalPriority,
                startDate: task.startDate, endDate: task.endDate, completed: task.completed)
    }
}
