package com.example.technicalHighlighter.SERVICES;

import com.example.technicalHighlighter.MODLES.Challenge;
import com.example.technicalHighlighter.MODLES.Highlight;
import com.example.technicalHighlighter.MODLES.Skill;
import com.example.technicalHighlighter.REPOSITORIES.HighlightRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HighlightService {

    private final HighlightRepository highlightRepository;
    private final SkillService skillService;

    @Transactional
    public Highlight addHighlight(Highlight highlight) {

        //TODO ::  Some validation
        Highlight highlight1 =highlightRepository.save(highlight);

        highlight1.getSkillsUtilized().forEach(skill ->
                {
                    skill.setHighlight(highlight1);
                    ;
                }
                );

        return highlight1;
    }

    public Highlight getHighlight(Long id) {


        if (!highlightRepository.existsById(id)) {
            throw new RuntimeException("Highlight not found");
        }


        return highlightRepository.findById(id).orElseThrow();
    }


//    public List<Highlight> getAllByCreatedAt(LocalDateTime createdAt) {
//        return highlightRepository.getAllByCreatedAt(createdAt);
//    }
//
//    public List<Highlight> getAllBySkillsUtilized(List<Skill> skillsUtilized) {
//        return highlightRepository.getAllBySkillsUtilized(skillsUtilized);
//    }
//
//
//
//
//    public List<Highlight> getAllByChallenges(List<Challenge> challenges) {
//        return highlightRepository.getAllByChallenges(challenges);
//    }
//


    public List<Highlight> getHighlightsBySkill(String skillName) {
        return skillService.getHighlightBySkill(skillName);
    }





}
