package com.example.demo.entity;



import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class QuestionEntity {

	
	
	
	@Id
	@GeneratedValue
	int qid;
	String question;
	
	@ElementCollection
	List<String> options;
	
	@ManyToMany
	@JoinTable(name="userResponse_Question",
	joinColumns=@JoinColumn(name="userResponseid"),
	inverseJoinColumns=@JoinColumn(name="questionid"))
	Set<UserResponseEntity> userResponsesSet;
	
	
}
