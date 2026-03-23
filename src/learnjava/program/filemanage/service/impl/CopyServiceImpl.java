package learnjava.program.filemanage.service.impl;

import learnjava.program.filemanage.entity.Copy;
import learnjava.program.filemanage.entity.Document;
import learnjava.program.filemanage.entity.Status;
import learnjava.program.filemanage.service.CopyService;
import learnjava.program.filemanage.service.DocumentService;

public class CopyServiceImpl implements CopyService {
    private DocumentService docService;

    public CopyServiceImpl(DocumentService docService) {
        this.docService = docService;
    }

    @Override
    public void addCopy(String id, String document_id, Status status) {
        Document doc = docService.getDocumentById(document_id);
        if (doc != null) {
            doc.getCopies().add(new Copy(id, document_id, status));
            System.out.println("=> Đã thêm bản sao [" + id + "] cho sách: " + doc.getTitle());
        } else {
            System.err.println("=> Lỗi: Không tìm thấy tài liệu mã " + document_id);
        }
    }

    @Override
    public Status getCopyStatus(String id) {
        for (Document doc : docService.getAllDocuments()) {
            for (Copy c : doc.getCopies()) {
                if (c.getId().equals(id)) return c.getStatus();
            }
        }
        return null;
    }
}