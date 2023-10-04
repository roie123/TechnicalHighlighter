package com.example.technicalHighlighter.SERVICES;

import com.example.technicalHighlighter.MODLES.Highlight;
import com.example.technicalHighlighter.MODLES.Skill;
import com.example.technicalHighlighter.REPOSITORIES.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {


    private final SkillRepository skillRepository;


    public List<Highlight> getHighlightBySkill(String skillName) {

        List<Skill> skills = skillRepository.getAllByName(skillName);
        List<Highlight> highlights = new ArrayList<>();
        skills.forEach(skill ->
                {
                    highlights.add(skill.getHighlight());
                }
        );

        return highlights;
    }

}
