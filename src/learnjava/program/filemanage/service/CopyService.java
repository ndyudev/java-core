package learnjava.program.filemanage.service;

import learnjava.program.filemanage.entity.Status;

public interface CopyService {
    void addCopy(String id, String document_id, Status status);

    Status getCopyStatus(String id);
}
