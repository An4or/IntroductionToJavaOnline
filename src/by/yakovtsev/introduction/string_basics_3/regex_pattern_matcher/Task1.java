package by.yakovtsev.introduction.string_basics_3.regex_pattern_matcher;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.
public class Task1 {
    private static final String PARAGRAPH_SPLIT_REGEX = "(?m)(?!\\A)(?=\\s{4})";
    private static final String SENTENCE_SPLIT_REGEX = "(?<=\\.|\\?)\\s(?=[A-Z])";

    private List<String> allTextList;
    private String allTextString = "";

    public static void main(String[] args) throws IOException {
        Task1 task1 = new Task1();
//        task1.readTextFromFile("text.txt").forEach(System.out::println);
        task1.readTextFromFile("text.txt");

        String[] paragraph = task1.paragraphSplit();
        String[] paragraphSortRes = task1.paragraphSort(paragraph);
        String[] sentence = task1.sentenceSplit(paragraph[1]);

        System.out.println(Arrays.toString(paragraph));
        System.out.println(Arrays.toString(sentence));
        System.out.println(Arrays.toString(paragraphSortRes));

        task1.wordSort(paragraphSortRes);
        //task1.lexemSort(paragraphSortRes, "i");




    }

    public List<String> readTextFromFile(String path) throws IOException {
        allTextList = Files.readAllLines(Paths.get("src/resources/text/" + path), StandardCharsets.UTF_8);
        readTextFromFile();
        return allTextList;
    }

    public void readTextFromFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String s : allTextList) {
            sb.append(s);
        }
        allTextString = sb.toString();

    }

    public String[] paragraphSplit() {
        return allTextString.split(PARAGRAPH_SPLIT_REGEX);
    }

    public String[] sentenceSplit(String paragraph) {
        return paragraph.split(SENTENCE_SPLIT_REGEX);
    }

    public String[] paragraphSort(String[] paragraph) {
        int[] lengthSentences = new int[paragraph.length];
        String[] forSotrParagraph = new String[paragraph.length];

        for (int i = 0; i < paragraph.length; i++) {
            String[] santence = sentenceSplit(paragraph[i]);
            lengthSentences[i] = santence.length;
        }

        for (int i = 0; i < paragraph.length; i++) {
            int count = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < lengthSentences.length; j++) {
                if (count > lengthSentences[j] && lengthSentences[j] != 0) {
                    count = lengthSentences[j];
                    index = j;
                }
            }
            lengthSentences[index] = 0;
            forSotrParagraph[i] = paragraph[index];
        }
        return forSotrParagraph;
    }

    public List<String[]> wordSort(String[] sentence) {
        List<String[]> listSentences = new ArrayList<>();

        Comparator<String> comprator = (o1, o2) -> o1.length() - o2.length();

        for (int i = 0; i < sentence.length; i++) {
            listSentences.add(sentence[i].split("\\s"));
        }

        for (String[] s : listSentences) {
            Arrays.sort(s, comprator);
            System.out.print(Arrays.toString(s));
        }
        System.out.println();
        return listSentences;
    }

//    public List<String[]> lexemSort(String[] sentence, String str) {
//        List<String[]> listSentences = new ArrayList<>();
//        List<String[]> lexems = new ArrayList<>();
//
//        Comparator<String> comprator = (o1, o2) -> o1.length() - o2.length();
//        for (int i = 0; i < sentence.length; i++) {
//            listSentences.add(sentence[i].split("\\s"));
//        }
//        for (String[] s : listSentences) {
//            if (s.toString().contains(str)){
//                for (int i = 0; i < s.length; i++){
//                    if (s.)
//                }
//                lexems.add(s.toString().split(" "));
//            }
//            Arrays.sort(s, comprator);
//            System.out.print(Arrays.toString(s));
//        }
//
//
////        lexems = allTextList.stream().filter(s -> s.contains(str)).collect(Collectors.toList());
////lexems.sort(comprator);
//
//        System.out.println(lexems);
//        return lexems;
//    }


}
