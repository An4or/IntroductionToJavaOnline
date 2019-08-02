package by.yakovtsev.introduction.basics_oop_5.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFile {
    private Directoire directoire;
    private File file;

    public TextFile(Directoire directoire, File file) throws IOException {
        this.directoire = directoire;
        directoire.mkdir();
        this.file = file;
        file.createNewFile();
    }

    public TextFile(Directoire directoire) {
        this.directoire = directoire;
        directoire.mkdir();
    }

    public TextFile(File file) throws IOException {
        this.file = file;
        file.createNewFile();
    }

    public TextFile() {
    }

    public void create(String path) throws IOException {
        if (path.contains(".txt")) {
            file = new File(path);
            file.createNewFile();
        } else {
            directoire = new Directoire(path);
            directoire.mkdir();
        }

    }

    public void printConsole() throws IOException {
//        if (directoire.isDirectory()){
//            for (java.io.File dir : directoire.listFiles()){
//                if (dir.isDirectory()){
//                    System.out.println(dir.getName() + "  \t folder");
//                }else{
//                    System.out.println(dir.getName() + "\t file");
//                }
//            }
//        }
        List<String> list = Files.readAllLines(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8);
        list.forEach(System.out::println);
    }

    public void rename(String newName) {
        if (newName.contains(".txt")) {
            file.renameTo(new File(file.getParent() + "/" + newName));
        } else {
            directoire.renameTo(new Directoire(directoire.getParent() + "/" + newName));
        }
    }

    public void deleted() {
        file.delete();
        directoire.delete();
    }


    public void addText(String text) throws IOException {
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file.getAbsolutePath(), true), StandardCharsets.UTF_8));
        writer.write(text);
        writer.close();
    }
}
