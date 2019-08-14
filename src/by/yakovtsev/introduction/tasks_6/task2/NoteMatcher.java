package by.yakovtsev.introduction.tasks_6.task2;

public class NoteMatcher {
    private String topic;
    private Date minDate;
    private Date maxDate;
    private String email;
    private String[] words;

    public NoteMatcher() {

    }

    public void setTopic(String topic) {
        this.topic = topic.equals("") ? null : topic;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public void setEmail(String email) {
        this.email = email.equals("") ? null : email;
    }

    public void setWords(String words) {
        this.words = words.equals("") ? null : words.split(" ");
    }

    public boolean match(Note note) {
        boolean match = (topic == null || this.topic.equals(note.getTopic()))
                && (this.minDate == null || note.getDate().compareTo(this.minDate) >= 0)
                && (this.maxDate == null || note.getDate().compareTo(this.maxDate) <= 0)
                && (this.email == null || this.email.equals(note.getEmail()));

        if (words != null) {
            for (String word : words) {
                match = match && note.getText().matches(".*" + word + ".*");
            }
        }
        return match;
    }

}
