package com.restaurant.sourse.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurant_tables")
public class ResTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @ManyToOne(fetch = FetchType.EAGER)
    private Facility facility;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "table_pictures",
            joinColumns = @JoinColumn(name = "table_id"),
            inverseJoinColumns = @JoinColumn(name = "file_storage_id"))
    private List<FileStorage> pictures;

    @Enumerated(EnumType.STRING)
    private TableType type;

    @Column(name = "availability")
    private boolean isAvailable;

    @Column(name = "description")
    private String description;

    public ResTable() {
    }

    public ResTable(long id, int number, Facility facility, List<FileStorage> pictures, TableType type, boolean isAvailable, String description) {
        this.id = id;
        this.number = number;
        this.facility = facility;
        this.pictures = pictures;
        this.type = type;
        this.isAvailable = isAvailable;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public List<FileStorage> getPictures() {
        return pictures;
    }

    public void setPictures(List<FileStorage> pictures) {
        this.pictures = pictures;
    }

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
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
        return "Table{" +
                "id=" + id +
                ", number=" + number +
                ", facility=" + facility +
                ", pictures=" + pictures +
                ", type=" + type +
                ", isAvailable=" + isAvailable +
                ", description='" + description + '\'' +
                '}';
    }
}
