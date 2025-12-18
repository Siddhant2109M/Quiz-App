package com.siddhant.quizapp.dao;

import com.siddhant.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Quizdao extends JpaRepository<Quiz, Integer> {
}
