import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SurveyTest
{

    private Survey survey;

    @BeforeEach
    void setup()
    {
        this.survey = new Survey();
    }

    @ParameterizedTest
    @ValueSource(strings = {"hans", "HANS", "HaNs","ha-NS"})
    void shouldReturnCorrectWhenNameIsCorrect(String names)
    {
        // Given
        String name = names;
        // When
        survey.setName(name);
        // Then
        assertEquals(name,survey.getName());
    }
    @ParameterizedTest
    @ValueSource(strings = {"90", "95", "110","Jens%",""})
    void shouldReturnFalseWhenNameIsIncorrect(String names)
    {
        // Given
        String name = names;
        // When
        Executable executable = () -> survey.setName(name);
        // Then
        assertThrows(ArithmeticException.class, executable);
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 35, 18})
    void shouldReturnCorrectWhenAgeIsCorrect(Integer ages)
    {
        // Given
        int age = ages;
        // When
        survey.setAge(age);
        // Then
        assertEquals(age, survey.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void shouldReturnFalseWhenAgeIsIncorrect(Integer ages)
    {
        // Given
        int age = ages;
        // When
        Executable executable = () -> survey.setAge(age);
        // Then
        assertNotEquals(ArithmeticException.class, executable);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Male", "Female"})
    void shouldReturnCorrectWhenGenderIsCorrect(String genders)
    {
        // Given
        String gender = genders;
        // When
        survey.setGender(gender);
        // Then
        assertEquals(gender, survey.getGender());
    }

    @ParameterizedTest
    @ValueSource(strings = {"noGender", "xxx",""})
    void shouldReturnFalseWhenGenderIsIncorrect(String genders)
    {
        // Given
        String gender = genders;
        // When
        Executable executable = () -> survey.setGender(gender);
        // Then
        assertThrows(ArithmeticException.class, executable);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 8})
    void shouldReturnCorrectWhenTimeSpendIsCorrect(Integer timeSpent)
    {
        // Given
        int currentTimeSpent = timeSpent;
        // When
        survey.setHoursSpent(currentTimeSpent);
        // Then
        assertEquals(currentTimeSpent, survey.getHoursSpent());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void shouldReturnFalseWhenTimeSpendIsIncorrect(Integer timeSpent)
    {
        // Given
        int currentTimeSpent = timeSpent;
        // When
        Executable executable = () -> survey.setHoursSpent(currentTimeSpent);
        // Then
        assertThrows(ArithmeticException.class, executable);
    }


}