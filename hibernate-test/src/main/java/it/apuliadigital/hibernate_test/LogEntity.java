package it.apuliadigital.hibernate_test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LogEntity {

    @Id
    private String id;
    private String path;
    private String message;

    public LogEntity() {
    }

    public LogEntity(String id, String path, String message) {
        this.id = id;
        this.path = path;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
