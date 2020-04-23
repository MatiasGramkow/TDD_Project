import java.util.Arrays;
import java.util.List;

public class Survey
{
    private String name,gender;
    private int age, hoursSpent;

    public Survey(String name, String gender, int age, int hoursSpent) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hoursSpent = hoursSpent;
    }

    public Survey() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("^[a-zA-Z\\s-]+$"))
        {
            throw new ArithmeticException("Not a valid name");
        }
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        List<String> genders = Arrays.asList("Male", "Female");
        if (!genders.contains(gender))
        {
            throw new ArithmeticException("Not a valid gender");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
        {
            throw new ArithmeticException("Not a valid age");
        }
        this.age = age;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        if (hoursSpent < 0)
        {
            throw new ArithmeticException("Not a valid value");
        }
        this.hoursSpent = hoursSpent;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hoursSpent=" + hoursSpent +
                '}';
    }
}
