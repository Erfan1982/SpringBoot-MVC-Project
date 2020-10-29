package com.lastcourse.exercises;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lastcourse.exercises.model.Billionaires;

@SpringBootApplication
public class ExercisesApplication{


	//Alternative 1 for getting application properties
	@Autowired
	Environment env;

	//Alternative 2 for getting application properties
	@Value("${spring.datasource.password}")
	String getString;

	@Autowired
	JdbcTemplate template;

	
	public static void main(String[] args) throws Exception {

		
		ApplicationContext ctx = SpringApplication.run(ExercisesApplication.class, args);
		ExercisesApplication app =  ctx.getBean(ExercisesApplication.class);
		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for(String bean: beans) {
			System.out.println(bean);
		}		
		
	}
	
	
	//Running native queries against relational database with the use of JdbcTemplate-utility class
	@Bean	
	public List<Billionaires> returnAllRows() {
		String sql = "SELECT * FROM BILLIONAIRES";
		
		List<Billionaires> all = template.query(sql, new BeanPropertyRowMapper(Billionaires.class));
		for (Billionaires load : all) {
			System.out.println(load.getFirst_name());
		}
		return all;
		
		
	}
	
	







}
