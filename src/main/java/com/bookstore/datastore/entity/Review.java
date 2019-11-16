package com.bookstore.datastore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "review")
public class Review implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "review_id", nullable = false)
    private Integer reviewId;
    @Column(name = "rating", nullable = false)
    private Integer rating;
    @Column(name = "headline", nullable = false)
    private String headline;
    @Column(name = "comment", nullable = false)
    private String comment;
    @Column(name = "review_time", nullable = false)
    private Date reviewTime;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    private Book bookByBookId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customerByCustomerId;


}