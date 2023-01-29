package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreationSucsess() {
        User user=new User("qwe","123");
        user.authmethod("login","password");
        assertTrue(user.authmethod("qwe","123"));
    } @Test
    void userCreationFalse() {
        User user=new User("qwe","123");
        user.authmethod("login","password");
        assertFalse(user.authmethod("qw","103"));
    }


}