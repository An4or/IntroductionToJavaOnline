package by.yakovtsev.introduction.tasks_6.task2;

import by.yakovtsev.introduction.ConsoleHelper;

public class MenuUtil {

    public static void notePadMenu(){
        NotePad notePad = new NotePad();

        boolean exit = false;
        while (!exit) {
            System.out.println("Total notes: " + notePad.numOfNotes());
            System.out.println("1. Add new note");
            System.out.println("2. Filter");
            System.out.println("3. Print all");
            System.out.println("4. Exit");
            int choice = choicePosition(1, 4);

            if (choice == 1) {
                Note note = getNote();
                notePad.addNote(note);

            } else if (choice == 2) {

                int choice2 = 1;

                do {
                    if (choice2 == 1) {
                        filter(notePad);
                    } else if (choice2 == 2) {
                        sort(notePad);
                    } else if (choice2 == 3) {
                        notePad.printSelected();
                    }

                    System.out.println();
                    System.out.println("Selected: " + notePad.numOfSelected());
                    System.out.println("1. New filter");
                    System.out.println("2. Sort filtered");
                    System.out.println("3. Print filtered");
                    System.out.println("4. Flush");
                    choice2 = choicePosition(1, 4);

                } while (choice2 != 4);

                notePad.flush();

            } else if (choice == 3) {
                notePad.printAll();
            } else {
                exit = true;
            }
        }

        notePad.saveToFile();

    }


    private static int choicePosition(int min, int max) {
        int res = ConsoleHelper.readInt();
        if (res < min || res > max) {
            System.out.println("Invalid input: try again");
            return choicePosition(min, max);
        }else {
            return res;
        }
    }

    private static Note getNote() {
        Note note = new Note();
        System.out.println("Enter topic: ");
        String topic = ConsoleHelper.readString();
        note.setTopic(topic);

        System.out.println("Enter date \"yyyy-mm-dd\": ");
        String date = ConsoleHelper.readString();
        while (!note.setDate(date)) {
            System.out.println("Invalid input. Please, try again");
            date = ConsoleHelper.readString();
        }

        System.out.println("Enter email: ");
        String email = ConsoleHelper.readString();
        while (!note.setEmail(email)) {
            System.out.println("Invalid input. Please, try again");
            email = ConsoleHelper.readString();
        }

        System.out.println("Enter note text. Enter EXIT to finish");
        StringBuilder text = new StringBuilder("");
        String newLine = "";
        while (!(newLine = ConsoleHelper.readString()).equals("EXIT")) {
            text.append(newLine);
            text.append("\n");
        }

        String textStr = text.toString();
        while (textStr.endsWith("\n")) {
            textStr = textStr.substring(0, textStr.length() - 1);
        }

        note.setText(textStr);

        return note;
    }

    private static void filter(NotePad notebook) {
        NoteMatcher matcher = new NoteMatcher();

        System.out.println("Enter topic or empty to skip");
        String topic = ConsoleHelper.readString();
        matcher.setTopic(topic);

        System.out.println("Enter the words that should be in the text or empty to skip");
        String words = ConsoleHelper.readString();
        matcher.setWords(words);

        notebook.filter(matcher);
    }

    private static void sort(NotePad notebook) {
        System.out.println("Enter sort parameter");
        System.out.println("1. Topic");
        System.out.println("2. Date");
        int choice = choicePosition(1, 2);

        if (choice == 1) {
            notebook.sortSelected(Note.topicComparator);
        } else if (choice == 2) {
            notebook.sortSelected(Note.dateComparator);
        }
    }


}
