package learnjava.program.filemanage.service.impl;

import learnjava.program.filemanage.entity.Document;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IOStreamImpl {
    private final String PATH = "src/learnjava/program/filemanage/data/documents.dat";

    public void writeToFile(Map<String, Document> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
            oos.writeObject(map);
        } catch (IOException e) {
            System.err.println("Lỗi lưu file: " + e.getMessage());
        }
    }

    public Map<String, Document> readFromFile() {
        File file = new File(PATH);
        if (!file.exists()) return new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, Document>) ois.readObject();
        } catch (Exception e) {
            return new HashMap<>();
        }
    }
}