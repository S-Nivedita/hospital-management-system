package com.example.hms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_log")
public class UserLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private int uid;
    private String username;
    private LocalDateTime loginTime;
    private LocalDateTime logout;
    private int status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
