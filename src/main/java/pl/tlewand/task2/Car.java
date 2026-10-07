package pl.tlewand.task2;

class Car extends Vehicle{
    @Override
    String description(){
        return "This is a car";
    }

    @Override
    @Deprecated(since = "1.0", forRemoval = true)
    void oldMethod() {
        super.oldMethod();
    }

    void newMethod(){
        System.out.println("Something new");
    }
}
