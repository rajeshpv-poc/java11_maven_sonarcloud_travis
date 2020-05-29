package foo;

import java.util.Optional;

public class OptModel {
    private String name;

    private Optional<String> withValue;
//    private Optional<String> withoutValue;

    public OptModel(){
        this("unknown");
    }

    public OptModel(String name){
        this.name = name;
        init();
    }

    public String getName() {
        return name;
    }

    private void init(){
        withValue  = Optional.of(name);
//        withoutValue  = Optional.empty();
    }

    public Optional<String> getWithValue() {
        return withValue;
    }
//
//    public Optional<String> getWithoutValue() {
//        return withoutValue;
//    }
}
