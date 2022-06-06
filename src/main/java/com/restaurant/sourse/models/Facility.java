package com.restaurant.sourse.models;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "facilities")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "info")
    private String info;

    @ManyToOne
    @Column(name = "location")
    private Location location;

    public Facility() {
    }

    public Facility(long id, String name, String info, Location location) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.location = location;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", location=" + location +
                '}';
    }
}
