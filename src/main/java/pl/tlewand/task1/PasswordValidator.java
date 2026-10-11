package pl.tlewand.task1;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

public class PasswordValidator {
    static boolean validate(Object obj) throws IllegalAccessException {
        Class<?> objClass = obj.getClass();
        Field[] declaredFields = objClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(PasswordValidation.class)) {
                PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);
                field.setAccessible(true);
                if (field.getType() != String.class) {
                    throw new IllegalArgumentException("Annotation on a field other than String");
                }
                String password = field.get(obj).toString();

                boolean hasPassAnySpecialChar = StringUtils.containsAny(password, "_!@#$%^&*()");
                boolean hasPassAnyDigit = StringUtils.isNotEmpty(StringUtils.getDigits(password));
                if (password.length() < annotation.minLength()) return false;
                if (annotation.requireSpecialChar() && !hasPassAnySpecialChar) return false;
                if (annotation.requireDigit() && !hasPassAnyDigit) return false;
            }
        }
        return true;
    }
}
