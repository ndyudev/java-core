package javacore.program.filemanage.service.impl;

import javacore.program.filemanage.entity.Document;
import javacore.program.filemanage.exception.DuplicateIDDocument;
import javacore.program.filemanage.service.DocumentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentServiceImpl implements DocumentService {

    private Map<String, Document> documentMap = new HashMap<>();

    @Override
    public void addDocument(String id, String title, String author) {
        try {
            if (documentMap.containsKey(id)) {
                throw new DuplicateIDDocument("Mã tài liệu \"" + id + "\" đã tồn tại!");
            }

            Document doc = new Document(id, title, author, new ArrayList<>());
            documentMap.put(id, doc);
            System.out.println("Thêm tài liệu thành công.");
        } catch (DuplicateIDDocument e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void updateDocument(Document document) {
        if (documentMap.containsKey(document.getId())) {
            documentMap.put(document.getId(), document);
            System.out.println("Cập nhật tài liệu \"" + document.getId() + "\" thành công!");
        } else {
            System.err.println("Lỗi: Không tìm thấy tài liệu mã \"" + document.getId() + "\" để cập nhật!");
        }
    }

    @Override
    public void deleteDocument(String id) {
        if (documentMap.containsKey(id)) {
            documentMap.remove(id);
            System.out.println("Đã xóa tài liệu mã \"" + id + "\" thành công.");
        } else {
            System.err.println("Lỗi: Mã tài liệu \"" + id + "\" không tồn tại trong hệ thống!");
        }
    }

    @Override
    public Document getDocumentById(String id) {
        return documentMap.get(id);
    }

    @Override
    public List<Document> getAllDocuments() {
        return new ArrayList<>(documentMap.values());
    }

    @Override
    public Map<String, Document> getDocumentMap() {
        return this.documentMap;
    }

    @Override
    public void setDocumentMap(Map<String, Document> map) {
        if (map != null) {
            this.documentMap = map;
        }
    }

}
