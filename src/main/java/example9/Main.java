package example9;

import groovy.lang.Binding;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        MyGroovyScript myGroovyScript = new MyGroovyScript();

        Binding binding = new Binding(new HashMap<String, String>() {{
            put("str", "Hello Groovy Script");
        }});
        myGroovyScript.setBinding(binding);

        myGroovyScript.run();
    }

}
