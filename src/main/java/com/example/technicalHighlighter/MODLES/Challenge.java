package com.example.technicalHighlighter.MODLES;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Challenge {
    @Id
    @GeneratedValue
    private Long id;


    private String name;




}
