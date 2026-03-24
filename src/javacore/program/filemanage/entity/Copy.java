package javacore.program.filemanage.entity;

import java.io.Serializable;

public class Copy implements Serializable {
    private String id;
    private String document_id;
    private Status status;

    public Copy(String id, String document_id, Status status) {
        this.id = id;
        this.document_id = document_id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Copy{" +
                "id='" + id + '\'' +
                ", document_id='" + document_id + '\'' +
                ", status=" + status +
                '}';
    }
}
