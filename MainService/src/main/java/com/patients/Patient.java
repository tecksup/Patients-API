package com.patients;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PATIENTS")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "FIRSTNAME", length = 50)
    private String firstName;
    @Column(name= "LASTNAME", length = 50)
    private String lastName;
    @Column(name= "DATEOFBIRTH")
    private Date dateOfBirth;

    public Patient() {}

    public Patient(long id, String firstName, String lastName, Date dataOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dataOfBirth;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
