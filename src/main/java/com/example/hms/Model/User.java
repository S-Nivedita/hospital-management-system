package com.example.hms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String fullName;
    private String address;
    private String city;
    private String gender;
    private String email;
    private String password;
    private LocalDateTime regDate;
    private LocalDateTime updationDate;

    @OneToMany(mappedBy="user")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "user")
    private List<MedicalHistory> medicalHistories;

    @OneToMany(mappedBy = "user")
    private List<UserLog> userLogs;

}
