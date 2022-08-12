package com.cbcode.projectfinal.models;

import javax.persistence.*;

@Entity
@Table(name = "sales_sold")
public class SalesCarSold extends CarSold{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    public SalesCarSold() {
    }

    public SalesCarSold(User user) {
        this.user = user;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUserName(User user) {
        if (user != null) {
            user.getName();
        }
        return user;
    }

}
