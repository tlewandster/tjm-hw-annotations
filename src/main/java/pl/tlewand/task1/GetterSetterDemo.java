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
