package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Adeebo on 2017/08/15.
 */
@Entity
public class DatabaseTest implements Serializable {

    @Id
    @GeneratedValue
    private Integer ID;
    private String name;

    public int getID() {
        return ID;
    }

    public DatabaseTest setID(int ID) {
        this.ID = ID;
        return this;
    }

    public String getName() {
        return name;
    }

    public DatabaseTest setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "DatabaseTest{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
