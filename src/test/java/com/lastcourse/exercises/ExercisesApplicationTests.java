package com.lastcourse.exercises;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lastcourse.exercises.repository.BillionairesRepository;


//@Transactional på klassnivå innebär att samtliga metoder ska det startas en transaktion för
@SpringBootTest
//@RunWith(SpringRunner.class) //Support-classes specific to SpringBoot 
//@DataJpaTest
public class ExercisesApplicationTests {

	
	@Autowired
	BillionairesRepository repository;
	
	
	@Test
	@Transactional
	void contextLoads() {	
		assertEquals("Aliko", repository.getOne(1).getFirst_name());
	}

	
	//Demonstrate another test method but without the @Transactional annotation to see the output 



}
