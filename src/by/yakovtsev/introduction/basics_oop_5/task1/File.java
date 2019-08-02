package by.yakovtsev.introduction.basics_oop_5.task1;

public class File extends java.io.File {
    public File(String pathname) {
        super(pathname);
    }

    public File(String parent, String child) {
        super(parent, child);
    }

    public File(java.io.File parent, String child) {
        super(parent, child);
    }
}
