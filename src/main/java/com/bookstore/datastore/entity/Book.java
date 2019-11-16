package com.bookstore.datastore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Data
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "book_id", nullable = false)
    private Integer bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "image", nullable = false)
    private byte[] image;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "publish_date", nullable = false)
    private Date publishDate;

    @Column(name = "last_update_time", nullable = false)
    private Date lastUpdateTime;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    private Category categoryByCategoryId;
    @OneToMany(mappedBy = "bookByBookId")
    private Collection<OrderDetail> orderDetailsByBookId;
    @OneToMany(mappedBy = "bookByBookId")
    private Collection<Review> reviewsByBookId;



}