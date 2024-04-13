package LR10.Example_2;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject Film_library = new JSONObject();
        JSONArray Film = new JSONArray();

        JSONObject Film1 = new JSONObject();
        Film1.put("Title","Унесённые призраками");
        Film1.put("Author","Хаяо Миядзаки");
        Film1.put("Year",2001);

        JSONObject Film2 = new JSONObject();
        Film2.put("Title","Бойцовский клуб");
        Film2.put("Author","Дэвид Финчер");
        Film2.put("Year", 1999);

        Film.add(Film1);
        Film.add(Film2);

        Film_library.put("Film",Film);

        try (FileWriter file = new FileWriter("src/LR10/Example_2/Example-json.json"))
        {
            file.write(Film_library.toJSONString());
            System.out.println("Json файл создан.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
