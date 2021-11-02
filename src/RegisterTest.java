import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Register register = new Register(
            List.of(new Student("Mariam", 11, Year.THIRD, List.of(34.6, 78.9, 67.8, 65.7)),
                    new NaughtyStudent("Kpakpo", 15, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2)),
                    new NaughtyStudent("Alfred", 13, Year.SECOND, List.of(67.9, 34.9, 89.9, 56.2)),
                    new Student("Nortey", 14, Year.FIRST, List.of(67.9, 34.9, 89.9, 56.2))
                    )
    );


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getRegister() {
        assertEquals(Arrays.asList("Mariam", "Kpakpo", "Alfred", "Nortey"), register.getRegister());
    }

    @Test
    void getRegisterByLevel() {

        assertEquals(Arrays.asList(), register.getRegisterByLevel(Year.THIRD));
        System.out.println(register.getRegisterByLevel(Year.THIRD));

    }
}