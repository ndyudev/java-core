package learnjava.program.filemanage.service;

import learnjava.program.filemanage.entity.Document;

import java.util.List;
import java.util.Map;

public interface DocumentService {
    void addDocument(String id, String title, String author);
    void updateDocument(Document document);
    void deleteDocument(String id);
    Document getDocumentById(String id);
    List<Document> getAllDocuments();

    Map<String, Document> getDocumentMap();
    void setDocumentMap(Map<String, Document> map);
}