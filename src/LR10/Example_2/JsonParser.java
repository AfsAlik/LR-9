package LR10.Example_2;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/LR10/Example_2/Example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("Film");

            for (Object o: jsonArray)
            {
                JSONObject Film = (JSONObject) o;
                System.out.println("\nТекущий элемент: Film");
                System.out.println("Название фильма: "+Film.get("Title"));
                System.out.println("Автор: "+Film.get("Author"));
                System.out.println("Год издания: "+Film.get("Year"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
