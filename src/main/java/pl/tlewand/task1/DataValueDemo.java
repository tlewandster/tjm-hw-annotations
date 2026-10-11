package pl.tlewand.task1;

import lombok.Data;
import lombok.NonNull;
import lombok.Value;

public class DataValueDemo {
    @Data
    public static class MutableUser{
        private final String name;
        private int age;
        @NonNull
        private String email;
    }

    @Value
    public static class UnmutableUser {
        private final String name;
        private int age;
        @NonNull
        private String email;
    }
}

/* Class after delombok

public class DataValueDemo {
    public static class MutableUser {
        private final String name;
        private int age;
        @NonNull
        private String email;

        public MutableUser(String name, @NonNull String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public @NonNull String getEmail() {
            return this.email;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setEmail(@NonNull String email) {
            this.email = email;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof MutableUser)) return false;
            final MutableUser other = (MutableUser) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            if (this.getAge() != other.getAge()) return false;
            final Object this$email = this.getEmail();
            final Object other$email = other.getEmail();
            if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof MutableUser;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            result = result * PRIME + this.getAge();
            final Object $email = this.getEmail();
            result = result * PRIME + ($email == null ? 43 : $email.hashCode());
            return result;
        }

        public String toString() {
            return "DataValueDemo.MutableUser(name=" + this.getName() + ", age=" + this.getAge() + ", email=" + this.getEmail() + ")";
        }
    }

    public static final class UnmutableUser {
        private final String name;
        private final int age;
        @NonNull
        private final String email;

        public UnmutableUser(String name, int age, @NonNull String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public @NonNull String getEmail() {
            return this.email;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof UnmutableUser)) return false;
            final UnmutableUser other = (UnmutableUser) o;
            final Object this$name = this.getName();
            final Object other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
            if (this.getAge() != other.getAge()) return false;
            final Object this$email = this.getEmail();
            final Object other$email = other.getEmail();
            if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $name = this.getName();
            result = result * PRIME + ($name == null ? 43 : $name.hashCode());
            result = result * PRIME + this.getAge();
            final Object $email = this.getEmail();
            result = result * PRIME + ($email == null ? 43 : $email.hashCode());
            return result;
        }

        public String toString() {
            return "DataValueDemo.UnmutableUser(name=" + this.getName() + ", age=" + this.getAge() + ", email=" + this.getEmail() + ")";
        }
    }
}*/
