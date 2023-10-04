package com.example.technicalHighlighter.CONTROLLERS;

import com.example.technicalHighlighter.MODLES.Highlight;
import com.example.technicalHighlighter.MODLES.Skill;
import com.example.technicalHighlighter.SERVICES.HighlightService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/highlight" )
public class HighlightController {


    private final HighlightService highlightService;



    @PostMapping
    public Highlight addHighlight(@RequestBody Highlight highlight) {
        return highlightService.addHighlight(highlight);
    }

    @GetMapping("/{id}")
    public Highlight getHighlightById(@PathVariable Long id) {
        return highlightService.getHighlight(id);
    }

    @GetMapping("/getBySkill/{skill}")
    public List<Highlight> getAllBySkill(@PathVariable String skill) {
        return highlightService.getHighlightsBySkill(skill);
    }



//    @GetMapping("/getRecent")
//    public List<Highlight> getRecent() {
//        return highlightService.getAllByCreatedAt(LocalDateTime.now());
//    }
//
//    @GetMapping("/getBySkill/{skill}")
//    public List<Highlight> getAllBySkill(@PathVariable String skill) {
//        return highlightService.getAllBySkillsUtilized();
//    }
//









}
