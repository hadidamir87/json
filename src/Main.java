import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Map<String, Object>>> json = new HashMap<>();

        Map<String, Object> person1 = new HashMap<>();
        person1.put("name", "John");
        person1.put("age", 30);
        person1.put("city", "New York");

        Map<String, Object> person2 = new HashMap<>();
        person2.put("name", "Alice");
        person2.put("age", 25);
        person2.put("city", "London");
        List<Map<String, Object>> listOfPerson = new ArrayList<>();
        listOfPerson.add(person1);
        listOfPerson.add(person2);
        json.put("person", listOfPerson);


        System.out.println(json);

    }
}


