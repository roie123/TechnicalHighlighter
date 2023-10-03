package com.example.technicalHighlighter.SERVICES;

import com.example.technicalHighlighter.MODLES.Highlight;
import com.example.technicalHighlighter.REPOSITORIES.HighlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HighlightService {

    private final HighlightRepository highlightRepository;


    public Highlight addHighlight(Highlight highlight) {

        //TODO ::  Some validation


        return highlightRepository.save(highlight);
    }

    public Highlight getHighlight(Long id) {



        if (!highlightRepository.existsById(id)) {
            throw new RuntimeException("Highlight not found");
        }


        return highlightRepository.findById(id).orElseThrow();
    }


}
