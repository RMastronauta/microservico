package com.example.notification_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notifications")
    private Long id;
    @Column(name = "message_notifications")
    private String message;
    @Column(name = "user_id_notifications")
    private Long userId;
}
