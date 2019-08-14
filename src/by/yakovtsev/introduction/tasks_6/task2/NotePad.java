package by.yakovtsev.introduction.tasks_6.task2;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class NotePad {

    private static final String DELIMITER = "****************";
    private File file;
    private List<Note> noteList;
    private List<Note> selectNotes;

    public NotePad(){
        readFile();
    }

    private void readFile(){
        noteList = new ArrayList<>();

        file = new File("src/resources/text/notes.txt") ;

        if (file.exists() && file.canRead()) {
            try (Scanner in = new Scanner(new FileReader(file))) {
                while (in.hasNextLine()) {
                    String topic = in.nextLine();
                    String date = in.nextLine();
                    String email = in.nextLine();
                    StringBuilder text = new StringBuilder("");
                    String nextLine;
                    while (in.hasNextLine() && !(nextLine = in.nextLine()).equals(DELIMITER)) {
                        text.append(nextLine);
                        text.append("\n");
                    }
                    String textStr = text.toString();
                    while (textStr.endsWith("\n")) {
                        textStr = textStr.substring(0, textStr.length() - 1);
                    }

                    noteList.add(new Note(topic, date, email, textStr));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void saveToFile(){
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (file.setWritable(true)) {
            try (PrintWriter out = new PrintWriter(file)) {
                for (Note note : noteList) {
                    out.println(note.getTopic());
                    out.println(note.getDate());
                    out.println(note.getEmail());
                    out.println(note.getText());
                    out.println(DELIMITER);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error save file");
        }
    }

    public int numOfNotes() {
        return noteList.size();
    }

    public int numOfSelected() {
        return selectNotes == null ? 0 : selectNotes.size();
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public void printSelected() {
        for (Note note: selectNotes) {
            System.out.println(note);
            System.out.println(DELIMITER);
        }
    }

    public void flush() {
        selectNotes = null;
    }

    public void printAll() {
        for (Note note: noteList) {
            System.out.println(note);
            System.out.println(DELIMITER);
        }
    }

    public void sortSelected(Comparator<Note> comparator) {
        Collections.sort(selectNotes, comparator);
    }

    public void filter(NoteMatcher matcher) {
        if (selectNotes == null) {
            selectNotes = noteList;
        }

        ArrayList<Note> filteredNotes = new ArrayList<>();
        for (Note note : selectNotes) {
            if (matcher.match(note)) {
                filteredNotes.add(note);
            }
        }

        selectNotes = filteredNotes;

    }


}
