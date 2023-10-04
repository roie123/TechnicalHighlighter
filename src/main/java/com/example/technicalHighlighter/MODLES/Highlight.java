package com.example.technicalHighlighter.MODLES;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor@NoArgsConstructor@ToString@Getter@Setter
public class Highlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String image;

    private String linkToGithub;
    private String linkToPDFFile;
    private String linkToLiveSite;


    private LocalDateTime createdAt = LocalDateTime.now();


    @OneToMany(cascade = {CascadeType.ALL} ,mappedBy = "highlight")
    private List<Challenge> challenges;

    @OneToMany(cascade = {CascadeType.ALL} ,mappedBy = "highlight")
    private List<Skill> skillsUtilized;
//   id:number=0;
//    title:string='';
//    description:string='';
//    image:string='';
//    linkToGithub:string='';
//    linkToPDFFile:string='';
//    linkToLiveSite:string='';
//    challenges:string[]=[];
//    skillsUtilized:string[]=[];



}
