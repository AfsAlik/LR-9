package LR10.Example_1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class NewFilm {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/LR10/Example_1/Example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            System.out.println("Введите название фильма:");
            String title = in.nextLine();

            System.out.println("Введите автора:");
            String author = in.nextLine();

            System.out.println("Введите год:");
            String year = in.nextLine();

            Element film1 = doc.createElement("Film");
            doc.getDocumentElement().appendChild(film1);

            Element title1 = doc.createElement("Title");
            title1.appendChild((doc.createTextNode(title)));
            film1.appendChild(title1);

            Element author1 = doc.createElement("Author");
            author1.appendChild(doc.createTextNode(author));
            film1.appendChild(author1);

            Element year1 = doc.createElement("Year");
            year1.appendChild(doc.createTextNode(year));
            film1.appendChild(year1);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new FileOutputStream("src/LR10/Example_1/Example.xml"));
            transformer.transform(source, result);
            System.out.println("Фильм добавлен!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
