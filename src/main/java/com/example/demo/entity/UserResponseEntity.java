package com.example.demo.entity;




import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class UserResponseEntity {

	
	@Id
	@GeneratedValue
	Long userresponseid;
	String urname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	 UserEntity ue;
	
	@ManyToMany(mappedBy="userResponsesSet")
	Set<QuestionEntity> questionEntitySet;
	
	
	@ElementCollection
	@Column(name="options")
	Map<QuestionEntity,String> selectedOptions;
}