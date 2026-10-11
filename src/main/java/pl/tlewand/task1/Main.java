package pl.tlewand.task1;

public class Main {
    static void main() throws IllegalAccessException {
        User user1 = new User("1_short");
        User user2 = new User("without_digit");
        User user3 = new User("0specialChars");
        User user4 = new User("1:0_for_user");
        System.out.printf("User with pass \"%s\" -> %B%n", user1.getPassword(), PasswordValidator.validate(user1));
        System.out.printf("User with pass \"%s\" -> %B%n", user2.getPassword(), PasswordValidator.validate(user2));
        System.out.printf("User with pass \"%s\" -> %B%n", user3.getPassword(), PasswordValidator.validate(user3));
        System.out.printf("User with pass \"%s\" -> %B%n", user4.getPassword(), PasswordValidator.validate(user4));
    }
}
