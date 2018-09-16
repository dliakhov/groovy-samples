package example9

println "runAll"
scriptMethod()

println str

def scriptMethod() {
    println "method"
    anotherScriptMethod()
}

def anotherScriptMethod() {
    println "another method"
}