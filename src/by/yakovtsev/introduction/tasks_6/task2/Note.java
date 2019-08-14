package by.yakovtsev.introduction.tasks_6.task2;

import java.io.Serializable;
import java.util.Comparator;

public class Note implements Serializable {
    private String topic;
    private Date date;
    private Email email;
    private String text;

    public Note(){
        date = new Date();
        email = new Email("");
    }

    public Note(String topic, Date date, Email email, String text) {
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.text = text;
    }

    public Note(String topic, String date, String email, String text) {
        this.topic = topic;
        this.date = new Date(date);
        this.email = new Email(email);
        this.text = text;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }



    public boolean setDate(String date) {
        try {
            this.date.setLocalDate(date);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Email getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        return this.email.setEmail(email);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //    public static Comparator<Note> dateComparator = Comparator.comparing(Note::getDate);


    public static Comparator<Note> dateComparator = new Comparator<Note>() {

        public int compare(Note note1, Note note2) {
            return note1.getDate().compareTo(note2.getDate());
        }
    };



    public static Comparator<Note> topicComparator = new Comparator<Note>() {

        public int compare(Note note1, Note note2) {
            return note1.getTopic().compareTo(note2.getTopic());
        }
    };

//    @Override
//    public String toString() {
//        return "Note{" +
//                "topic='" + topic + '\'' +
//                ", date=" + date +
//                ", email=" + email +
//                ", text='" + text + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return  "Topic: '" + topic + '\'' +
                ", \nDate: " + date +
                ", \nEmail: " + email +
                ", \n'" + text + '\''
                ;
    }
}
