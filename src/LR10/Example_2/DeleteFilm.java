package LR10.Example_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class DeleteFilm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/LR10/Example_2/Example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject Film_library =  (JSONObject) obj;
        JSONArray Films = (JSONArray) Film_library.get("Film");
        System.out.println("Пожалуйста, введите название фильма, который хотите удалить: ");
        String Title = in.nextLine();
        Iterator iterator = Films.iterator();
        while (iterator.hasNext()) {
            JSONObject Film = (JSONObject) iterator.next();
            if (Title.equals(Film.get("Title"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/LR10/Example_2/Example-json.json"))
        {
            file.write(Film_library.toJSONString());
            System.out.println("Фильм "+Title+" удалён.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
