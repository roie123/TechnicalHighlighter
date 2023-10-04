package com.example.technicalHighlighter.REPOSITORIES;

import com.example.technicalHighlighter.MODLES.Challenge;
import com.example.technicalHighlighter.MODLES.Highlight;
import com.example.technicalHighlighter.MODLES.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HighlightRepository extends JpaRepository<Highlight, Long> {


//    List<Highlight> getAllBySkillsUtilized(List<Skill> skillsUtilized);
//    List<Highlight> getAllByChallenges(List<Challenge> challenges);
//    List<Highlight> getAllByCreatedAt(LocalDateTime createdAt);


}
