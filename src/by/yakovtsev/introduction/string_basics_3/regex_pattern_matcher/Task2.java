package by.yakovtsev.introduction.string_basics_3.regex_pattern_matcher;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String XML_SPLIT_REGEX = "((?<open><[^/>]+?>)(?<body>.+?)(?<close></.+?>))|(?<openOnly><[^/>]+?>)|(?<closeOnly></.+?>)|(?<noBody><.+? />)|";
    private List<String> allXmlTextList;
    private String allTextString = "";

    public static void main(String[] args) throws IOException {

        Task2 task2 = new Task2();
        for (String s : task2.readTextFromFile("xmlText.txt")) {
            System.out.println(s);
        }


        task2.xmlParser();

    }

    public List<String> readTextFromFile(String path) throws IOException {
        allXmlTextList = Files.readAllLines(Paths.get("src/resources/text/" + path), StandardCharsets.UTF_8);
        readTextFromFile();
        return allXmlTextList;
    }

    public void xmlParser() throws IOException {
        Pattern template = Pattern.compile(XML_SPLIT_REGEX);
        Matcher findTeg = template.matcher(allTextString);

        while (findTeg.find()) {
            if (findTeg.group("open") != null && findTeg.group("close") != null) {
                System.out.println("Open tag: " + findTeg.group("open") + " сlose tag: " + findTeg.group("close") + " тело тега: " + findTeg.group("body"));
            } else if (findTeg.group("close") == null && findTeg.group("openOnly") != null) {
                System.out.println("Open tag: " + findTeg.group("openOnly"));
            } else if (findTeg.group("open") == null && findTeg.group("closeOnly") != null) {
                System.out.println("Close tag: " + findTeg.group("closeOnly"));
            } else if (findTeg.group("noBody") != null) {
                System.out.println("Tag without body: " + findTeg.group("noBody"));
            }
        }
    }

    public void readTextFromFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String s : allXmlTextList) {
            sb.append(s);
        }
        allTextString = sb.toString();

    }
}
