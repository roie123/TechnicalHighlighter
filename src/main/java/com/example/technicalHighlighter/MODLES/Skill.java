package com.example.technicalHighlighter.MODLES;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Skill {


    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    private Highlight highlight;


}
