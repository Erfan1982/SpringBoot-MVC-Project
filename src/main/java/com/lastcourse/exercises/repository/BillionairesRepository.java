package com.lastcourse.exercises.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lastcourse.exercises.model.Billionaires;

public interface BillionairesRepository extends JpaRepository<Billionaires, Integer> {

}
