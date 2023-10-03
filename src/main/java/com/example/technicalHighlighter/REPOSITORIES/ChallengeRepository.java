package com.example.technicalHighlighter.REPOSITORIES;

import com.example.technicalHighlighter.MODLES.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
