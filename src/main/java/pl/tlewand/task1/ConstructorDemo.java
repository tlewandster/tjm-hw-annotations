package pl.tlewand.task1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class ConstructorDemo {
    @NoArgsConstructor
    public static class FirstNestedClassUser {
        private final String name = "User";
        private int age;
        @NonNull
        private String email;
    }

    @AllArgsConstructor
    public static class SecondNestedClassUser {
        private final String name;
        private int age;
        @NonNull
        private String email;
    }

    @RequiredArgsConstructor
    public static class ThirdNestedClassUser {
        private final String name;
        private int age;
        @NonNull
        private String email;
    }
}

/* Class after delombok

public class ConstructorDemo {
    public static class FirstNestedClassUser {
        private final String name = "User";
        private int age;
        @NonNull
        private String email;

        public FirstNestedClassUser() {
        }
    }

    public static class SecondNestedClassUser {
        private final String name;
        private int age;
        @NonNull
        private String email;

        public SecondNestedClassUser(String name, int age, @NonNull String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public static class ThirdNestedClassUser {
        private final String name;
        private int age;
        @NonNull
        private String email;

        public ThirdNestedClassUser(String name, @NonNull String email) {
            this.name = name;
            this.email = email;
        }
    }
}*/
