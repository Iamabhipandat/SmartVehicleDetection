package com.abhinav.smartvehicledetection.entity;

import com.abhinav.smartvehicledetection.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true)
    private UserRole name;
}
