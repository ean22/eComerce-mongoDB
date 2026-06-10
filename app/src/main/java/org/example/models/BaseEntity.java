package org.example.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseEntity {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    private String createdBy;
    private String updatedBy;
    private String deletedBy;

    // Helpers
    public void markCreated(String user) {
        this.createdAt = LocalDateTime.now();
        this.createdBy = user;
    }

    public void markUpdated(String user) {
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = user;
    }

    public void markDeleted(String user) {
        this.deletedAt = LocalDateTime.now();
        this.deletedBy = user;
    }
}