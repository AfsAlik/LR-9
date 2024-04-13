package LR10.Example_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NewFilm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название фильма: ");
        String Title = in.nextLine();
        System.out.println("Введите автора: ");
        String Author = in.nextLine();
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/LR10/Example_2/Example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject Film_library =  (JSONObject) obj;
        JSONArray Film = (JSONArray) Film_library.get("Film");
        JSONObject newFilm = new JSONObject();
        newFilm.put("Title", Title);
        newFilm.put("Author", Author);
        newFilm.put("Year", 2023);
        Film.add(newFilm);

        Film_library.put("Film",Film);
        try(FileWriter file = new FileWriter("src/LR10/Example_2/Example-json.json"))
        {
            file.write(Film_library.toJSONString());
            System.out.println("Новый фильм добавлен!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
