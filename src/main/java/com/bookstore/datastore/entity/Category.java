package com.bookstore.datastore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Table(name = "category")
@Data
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", insertable = false, nullable = false)
    private Integer categoryId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<Book> booksByCategoryId;


}