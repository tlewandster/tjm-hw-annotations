package pl.tlewand.task1;

import lombok.*;

import java.util.List;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GetterSetterDemo {

    @EqualsAndHashCode.Include
    private String id;
    @Setter
    private String name;
    @Setter
    private int age;
    @ToString.Exclude
    @Getter(AccessLevel.NONE)
    private String pass;
}

/* Class after delombok

public class GetterSetterDemo {

    private String id;
    private String name;
    private int age;
    private String pass;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetterSetterDemo)) return false;
        final GetterSetterDemo other = (GetterSetterDemo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetterSetterDemo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        return "GetterSetterDemo(super=" + super.toString() + ", id=" + this.getId() + ", name=" + this.getName() + ", age=" + this.getAge() + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}*/
