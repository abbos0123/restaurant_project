package com.restaurant.sourse.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ResTable table;

    @Column(name = "time")
    private LocalDate time;

    @Column(name = "description")
    private String description;

    @OneToOne
    private Payment payment;

    @ManyToMany
    @JoinTable(name = "meal_list",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "mean_id"))
    private List<Meal> mealList;

    public Order() {
    }

    public Order(Long id, ResTable table, LocalDate time, String description, Payment payment, List<Meal> mealList) {
        this.id = id;
        this.table = table;
        this.time = time;
        this.description = description;
        this.payment = payment;
        this.mealList = mealList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResTable getTable() {
        return table;
    }

    public void setTable(ResTable table) {
        this.table = table;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", table=" + table +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", payment=" + payment +
                ", mealList=" + mealList +
                '}';
    }
}
