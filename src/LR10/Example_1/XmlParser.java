package LR10.Example_1;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlParser {
    public static void main(String[] args) {
        try{
            File inputFile = new File("src/LR10/Example_1/Example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Film");
            for (int i =0; i<nodeList.getLength();i++)
            {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: "+node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название фильма: "+
                            element.getElementsByTagName("Title").item(0)
                                    .getTextContent());
                    System.out.println("Автор: "+
                            element.getElementsByTagName("Author").item(0)
                                    .getTextContent());
                    System.out.println("Год издания: "+
                            element.getElementsByTagName("Year").item(0)
                                    .getTextContent());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
