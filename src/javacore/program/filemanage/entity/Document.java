package javacore.program.filemanage.entity;

import java.io.Serializable;
import java.util.List;

public class Document implements Serializable {
    private String id;
    private String title;
    private String author;

    private List<Copy> copies;

    public Document() {
    }

    public Document(String id, String title, String author, List<Copy> copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Copy> getCopies() {
        return copies;
    }

    public void setCopies(List<Copy> copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", copies=" + copies +
                '}';
    }
}
