package by.yakovtsev.introduction.tasks_6.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParserXML {
    private static final String PATH = "src/resources/text/student.xml";
    private static List<Student> studentList = new ArrayList<>();

    Student student;

    public static String readXML(){
        File xmlFile = new File(PATH);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        StringBuilder sb = new StringBuilder("");
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            System.out.println(document.getDocumentElement().getNodeName());
            // получаем узлы с именем Student
            // теперь XML полностью загружен в память
            // в виде объекта Document
            NodeList nodeList = document.getElementsByTagName("Student");

            // создадим из него список объектов Student
            List<Student> students = new ArrayList<Student>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                students.add(getStudent(nodeList.item(i)));
            }
            studentList = new ArrayList<>(students);
            // печатаем в консоль информацию по каждому объекту Student
            for (Student st : students) {
//                System.out.println(st.toString());
                sb.append(st.toString());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
return sb.toString();
    }

    public static void writeXML(List<Student> students){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        studentList.addAll(students);
        try {
            builder = factory.newDocumentBuilder();

            // создаем пустой объект Document, в котором будем
            // создавать наш xml-файл
            Document doc = builder.newDocument();
            // создаем корневой элемент
            Element rootElement =
                    doc.createElementNS("", "Students");
            // добавляем корневой элемент в объект Document
            doc.appendChild(rootElement);

            // добавляем первый дочерний элемент к корневому
            for (Student st: studentList) {
                rootElement.appendChild(getStudent(doc, st.getId()+"", st.getName(), st.getAge()+"", st.getNote()));
            }

            //создаем объект TransformerFactory для печати в консоль
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // для красивого вывода в консоль
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //печатаем в консоль или файл
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File(PATH));

            //записываем данные
            transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("Создание XML файла закончено");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private static Student getStudent(Node node){
        Student student = new Student();
        if (node.getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) node;
            student.setId(Integer.parseInt(getTagValue("id", element)));
            student.setName(getTagValue("name", element));
            student.setAge(Integer.parseInt(getTagValue("age", element)));
            student.setNote(getTagValue("note", element));
        }
        return student;
    }


    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

    private static Node getStudent(Document doc, String id, String name, String age, String note){
        Element student = doc.createElement("Student");

        student.appendChild(getStudentElements(doc, student, "id", id));
        student.appendChild(getStudentElements(doc, student, "name", name));
        student.appendChild(getStudentElements(doc, student, "age", age));
        student.appendChild(getStudentElements(doc, student, "note", note));

        return student;
    }

    private static Node getStudentElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }


}
