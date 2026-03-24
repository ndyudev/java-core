package javacore.program.filemanage.service;

import javacore.program.filemanage.entity.Status;

public interface CopyService {
    void addCopy(String id, String document_id, Status status);

    Status getCopyStatus(String id);
}
