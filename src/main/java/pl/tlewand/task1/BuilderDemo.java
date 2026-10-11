package pl.tlewand.task1;

import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.List;

public class BuilderDemo {

    @SuperBuilder
    public abstract static class Member {
        public String name;
        public int age;
    }
    @SuperBuilder(
            builderMethodName = "init",
            buildMethodName = "create"
    )
    public static class Subscriber extends Member {
        @Singular
        List<String> permissions;
    }

    static void main() {
        Subscriber subscriber = Subscriber.init()
                .name("SomeName")
                .age(20)
                .permission("ADD")
                .permission("DELETE")
                .create();
    }
}
