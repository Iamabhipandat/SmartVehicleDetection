package com.abhinav.smartvehicledetection.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class User {
    @Column(nullable = false, unique = true)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean enabled;

    @ManyToOne
    @JoinColumn(name="role_id",nullable= false)
    private Role role;
    @ManyToOne
    @JoinColumn(name="site_id")
    private Site site;
}
