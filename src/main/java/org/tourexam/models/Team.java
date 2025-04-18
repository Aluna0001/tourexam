package org.tourexam.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private ArrayList<Rider> rider;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Rider> getRider() {
        return rider;
    }

    public void setRider(ArrayList<Rider> rider) {
        this.rider = rider;
    }
}
