package com.restaurant.sourse.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "meal")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "meal_ingredients",
            joinColumns = @JoinColumn(name = "main_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> ingredients;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "meal_pictures",
            joinColumns = @JoinColumn(name = "main_id"),
            inverseJoinColumns = @JoinColumn(name = "file_storage_id"))
    private List<FileStorage> pictures;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "special_type")
    @Enumerated(EnumType.STRING)
    private SpecialType specialType;

    @Column(name = "preparation_time")
    private long preparationTime;

    @Column(name = "availability")
    private boolean isAvailable;

    @Column(name = "description")
    private String description;

    public Meal() {
    }

    public Meal(long id, String name, double price, List<Ingredient> ingredients, List<FileStorage> pictures, Type type, SpecialType specialType, long preparationTime, boolean isAvailable, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.pictures = pictures;
        this.type = type;
        this.specialType = specialType;
        this.preparationTime = preparationTime;
        this.isAvailable = isAvailable;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<FileStorage> getPictures() {
        return pictures;
    }

    public void setPictures(List<FileStorage> pictures) {
        this.pictures = pictures;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SpecialType getSpecialType() {
        return specialType;
    }

    public void setSpecialType(SpecialType specialType) {
        this.specialType = specialType;
    }

    public long getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(long preparationTime) {
        this.preparationTime = preparationTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                ", pictures=" + pictures +
                ", type=" + type +
                ", specialType=" + specialType +
                ", preparationTime=" + preparationTime +
                ", isAvailable=" + isAvailable +
                ", description='" + description + '\'' +
                '}';
    }
}
