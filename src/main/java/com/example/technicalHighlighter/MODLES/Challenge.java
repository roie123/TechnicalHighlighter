package com.example.technicalHighlighter.MODLES;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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


    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    private Highlight highlight;

}
