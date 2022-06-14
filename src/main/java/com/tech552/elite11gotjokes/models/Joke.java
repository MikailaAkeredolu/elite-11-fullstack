package com.tech552.elite11gotjokes.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// POJO plain old java object
@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String value;

    private String category;

    public Joke() {
    }

    public Joke(Long id, String value, String category) {
        this.id = id;
        this.value = value;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
