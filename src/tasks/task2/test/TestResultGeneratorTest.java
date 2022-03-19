package tasks.task2.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.task2.code.Student;
import tasks.task2.code.TestResultGenerator;

import java.util.*;

import static java.util.Set.of;

class TestResultGeneratorTest {
    private TestResultGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new TestResultGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    private Student createFakeStudent() {
        Faker faker = new Faker(new Locale("en-IND"));
        return new Student((byte) faker.number().randomNumber(), faker.name().fullName(),
                Long.parseLong(String.valueOf(faker.phoneNumber())), faker.number().numberBetween(1, 100));
    }

    private Set<Student> createSetOfFakeStudents(int number) {
        Set<Student> fakeStudentSet = new HashSet<>();
        for (int index = 0; index < number; index++) {
            fakeStudentSet.add(createFakeStudent());
        }
        return fakeStudentSet;
    }

    @Test
    void createEmptySetOfFailedStudents() {
        var expected = Set.<String>of();
        Set<Student> studentSet = of();
        var actual = generator.getDetailsOfFailedStudents(studentSet);
        Assertions.assertEquals(expected, actual, "Method should be able to create empty set");
    }

    @Test
    void getDetailsOfFailedStudents() {

    }

    @Test
    void sortStudentsForRanking() {
    }
}