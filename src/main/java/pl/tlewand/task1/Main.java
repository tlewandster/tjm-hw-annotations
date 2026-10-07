package pl.tlewand.task1;

public class Main {
    static void main() throws IllegalAccessException {
        String pass1 = "1_short";
        User user1 = new User(pass1);
        String pass2 = "without_digit";
        User user2 = new User(pass2);
        String pass3 = "0specialChars";
        User user3 = new User(pass3);
        String pass4 = "1:0_for_user";
        User user4 = new User(pass4);
        System.out.printf("User with pass \"%s\" -> %B%n", pass1, PasswordValidator.validate(user1));
        System.out.printf("User with pass \"%s\" -> %B%n", pass2, PasswordValidator.validate(user2));
        System.out.printf("User with pass \"%s\" -> %B%n", pass3, PasswordValidator.validate(user3));
        System.out.printf("User with pass \"%s\" -> %B%n", pass4, PasswordValidator.validate(user4));
    }
}
