package com.lista.notas.lista_notas.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "tasks")
public class Task implements Serializable {
    @Id
    private ObjectId id;
    private String title;
    private boolean completed;
    private String category;
    

    
    // Getter para id que devuelve String
    public String getId() {
        return id != null ? id.toHexString() : null;
    }

    // Setter para id que acepta String
    public void setId(String id) {
        if (id != null && ObjectId.isValid(id)) {
            this.id = new ObjectId(id);
        }
    }
}