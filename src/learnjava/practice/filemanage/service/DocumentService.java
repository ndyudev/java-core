package JavaCore.practice.filemanage.service;

import JavaCore.practice.filemanage.entity.Document;

import java.util.List;

public interface DocumentService {
    void addDocument(String id, String title, String author);
    void updateDocument(Document document);
    void deleteDocument(String id);
    Document getDocumentById(String id);

    List<Document> getAllDocuments();
}
