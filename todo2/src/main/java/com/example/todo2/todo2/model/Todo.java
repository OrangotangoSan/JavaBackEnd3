package com.example.todo2.todo2.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Todo implements Serializable {

    @Id
    private String id;
    private String tarefa;

}
