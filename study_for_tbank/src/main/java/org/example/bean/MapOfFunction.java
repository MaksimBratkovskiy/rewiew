package org.example.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapOfFunction {
    private final Map<String, Function<MyBean, String>> functions = new HashMap<>();

    public MapOfFunction(){
        functions.put("print_it", MyBean::toString);
        functions.put("print_id", bean -> Integer.toString(bean.getId()));
        functions.put("id_to_hex", bean -> {
           int id = bean.getId();
           return String.format("0x%x%n", id);
        });
    }

    public String doFunctionWork(MyBean myBean, String functionKey) {
        return functions.get(functionKey).apply(myBean);
    }
}
