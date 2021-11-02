import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    NaughtyStudent naughtyStudentTest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        List<Double> testGrade = new ArrayList<>(List.of(45.7, 63.9, 34.5, 12.45));
        naughtyStudentTest = new NaughtyStudent("Keziah", 98, Year.THIRD, testGrade);


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testGetAverageGrade() {
        assertEquals(172.205, naughtyStudentTest.getAverageGrade());


    }


    @Test
    void testGetStudentGrade() {
        assertEquals(Arrays.asList(50.27000000000001, 70.29, 37.95, 13.695), naughtyStudentTest.getStudentGrade());
    }
}