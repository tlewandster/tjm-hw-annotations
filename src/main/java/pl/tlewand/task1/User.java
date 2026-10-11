package pl.tlewand.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class User {
    @PasswordValidation(
            minLength = 10,
            requireDigit = true,
            requireSpecialChar = true
    )
    @NonNull
    @Getter
    String password;
}
