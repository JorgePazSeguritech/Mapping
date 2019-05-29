package com.mapping.Mapping.persistence.model;

import javax.persistence.*;

@MappedSuperclass
public class DatabaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
