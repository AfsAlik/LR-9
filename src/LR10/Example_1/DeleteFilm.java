package LR10.Example_1;

import org.w3c.dom.Document;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DeleteFilm {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/LR10/Example_1/Example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Film");

            Node node = nodeList.item(0);
            Element filmElement = (Element) node;
            filmElement.getElementsByTagName("Title").item(0);
            Node parentNode = filmElement.getParentNode();
            parentNode.removeChild(filmElement);

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

            System.out.println("Удалён первый фильм в списке");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
