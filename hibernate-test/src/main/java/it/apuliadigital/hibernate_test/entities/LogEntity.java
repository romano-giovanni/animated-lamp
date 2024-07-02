package it.apuliadigital.hibernate_test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class LogEntity {

    @Id
    private String id;
    private String path;
    private String message;
    private LocalDateTime time;

    public LogEntity() {
    }

    public LogEntity(String id, String path, String message, LocalDateTime time) {
        this.id = id;
        this.path = path;
        this.message = message;
        this.time = time;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
