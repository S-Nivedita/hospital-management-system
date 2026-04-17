package com.example.hms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_us")
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String fullName;
    private String email;
    private long contactNo;
    private String message;
    private LocalDateTime postingDate;
    private String adminRemark;
    private LocalDateTime lastUpdationDate;
    private int isRead;
}
