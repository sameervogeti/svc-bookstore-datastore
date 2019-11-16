package com.bookstore.datastore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Table(name = "book_order")
public class BookOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", insertable = false, nullable = false)
    private Integer orderId;

    @Column(name = "customer_id", nullable = false,insertable = false,updatable = false)
    private Integer customerId;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @Column(name = "shipping_address", nullable = false)
    private String shippingAddress;

    @Column(name = "recipient_name", nullable = false)
    private String recipientName;

    @Column(name = "recipient_phone", nullable = false)
    private String recipientPhone;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customerByCustomerId;
    @OneToMany(mappedBy = "bookOrderByOrderId")
    private Collection<OrderDetail> orderDetailsByOrderId;


}