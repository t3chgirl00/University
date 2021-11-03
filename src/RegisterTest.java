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

    List<Student> studentAndNaughty = new ArrayList<>(
            List.of(
                    new NaughtyStudent("Mariam", 11, Year.THIRD, List.of(34.6, 78.9, 67.8, 65.7)),
                    new Student("Lisa", 12, Year.THIRD, List.of(89.0, 90.0, 96.9, 99.5)),
                    new NaughtyStudent("Alfred", 13, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2)),
                    new Student("Nortey", 14, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2)),
                    new NaughtyStudent("Kpakpo", 15, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2))
            )
    );

    List<String> classOfStudents = new ArrayList<String>(
            List.of (
                    ("Mariam"),
                    ("Lisa"),
                    ("Nortey")            )
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

        assertEquals("[Mariam, Kpakpo]", register.getRegisterByLevel(Year.THIRD));

    }

    @Test
    void getStudentByName() {
        assertNotEquals(null, register.getStudentByName("Kpakpo"));
        assertEquals("Optional[Student{name='Kpakpo', id=15, year=THIRD, studentGrade=[67.9, 34.9, 89.9, 56.2]}]", register.getStudentByName("Mariam").toString());
    }

    @Test
    void getListOfStudentsByName() {
        assertEquals("Mariam, Lisa, Nortey", register.getListOfStudentsByName(classOfStudents));
    }
}