package com.spring.batchprocessing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Document {
    @Id
    private Integer id;
    private String heading;
    private String heading2;
    private String heading3;

}
