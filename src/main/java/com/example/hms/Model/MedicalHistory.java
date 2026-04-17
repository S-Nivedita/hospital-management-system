package com.example.hms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="medical_history")
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    private String bloodPressure;
    private String bloodSugar;
    private String weight;
    private String temperature;
    private String medicalPrescription;
    private LocalDateTime creationDate;
}
