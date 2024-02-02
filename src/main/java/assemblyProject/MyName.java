package assemblyProject;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MyName {
    public static void main(String[] args) {
        Map<String, String> human = new HashMap<>();
        human.put("name", "ivan");
        human.put("lastName", "khlan");
        System.out.println(new Gson().toJson(human));
    }
}
