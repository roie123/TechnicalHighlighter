package com.example.technicalHighlighter.REPOSITORIES;

import com.example.technicalHighlighter.MODLES.Highlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighlightRepository extends JpaRepository<Highlight, Long> {

}
