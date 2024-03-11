package LR10.Example_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            Element film1 = doc.createElement("Film");
            rootElement.appendChild(film1);

            Element title1 = doc.createElement("Title");
            title1.appendChild((doc.createTextNode("1+1")));
            film1.appendChild(title1);

            Element author1 = doc.createElement("Author");
            author1.appendChild(doc.createTextNode("Olivier Nakache"));
            film1.appendChild(author1);

            Element year1 = doc.createElement("Year");
            year1.appendChild(doc.createTextNode("2011"));
            film1.appendChild(year1);

            Element manga2 = doc.createElement("Film");
            rootElement.appendChild(manga2);

            Element title2 = doc.createElement("Title");
            title2.appendChild(doc.createTextNode("Побег из Шоушенка"));
            manga2.appendChild(title2);

            Element author2 = doc.createElement("Author");
            author2.appendChild(doc.createTextNode("Frank Darabont"));
            manga2.appendChild(author2);

            Element year2 = doc.createElement("Year");
            year2.appendChild(doc.createTextNode("1994"));
            manga2.appendChild(year2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File ("src/LR10/Example_1/Example.xml"));
            transformer.transform(source,result);

            System.out.println("XML-файл создан.");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
