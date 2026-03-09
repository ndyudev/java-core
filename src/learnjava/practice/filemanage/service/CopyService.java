package JavaCore.practice.filemanage.service;

import JavaCore.practice.filemanage.entity.Status;

public interface CopyService {
    void addCopy(String id, String document_id, String status);
    void updateCopy(String id, String document_id, String status);
    void deleteCopy(String id);
    void getCopyById(String id);
    Status getCopyStatus(String id);
}
