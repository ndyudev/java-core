package javacore.program.filemanage.service;

import javacore.program.filemanage.entity.Document;

import java.util.Map;

public interface IOStreams {
    void writeToFile(Map<String, Document> data);

    Map<String, Document> readFromFile();
}
