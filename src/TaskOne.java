import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    //TODO: women 18+
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hellen", 40, false));
        persons.add(new Person("Ivan", 27, true));
        persons.add(new Person("Helga", 17, false));
        persons.add(new Person("Inessa", 27, false));

        persons.stream().filter(person -> !person.isGender() && person.getAge() > 18).forEach(System.out::println);
    }
}
