package com.example.hms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String patientName;
    private long patientContactNo;
    private String patientEmail;
    private String patientGender;
    private int patientAge;
    private String patientMedicalHistory;
    private LocalDateTime creationDate;
    private LocalDateTime updationDate;
}
