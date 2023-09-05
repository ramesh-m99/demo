package com.example.demo;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp")
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int id;
    private String name;
}
