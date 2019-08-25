package com.example.demo.implementation;


	


	import org.springframework.stereotype.Service;

import com.example.demo.entity.QuestionEntity;
import com.example.demo.repository.QuestionEntityRepo;
import com.example.demo.service.QuestionEntityService;

	@Service
	public class QuestionEntityServiceImpl implements QuestionEntityService {
		
	private final QuestionEntityRepo repo;
		
		public QuestionEntityServiceImpl(QuestionEntityRepo repo)
		{
			this.repo=repo;
		}
		
		
		public QuestionEntity getQuestionsfromTable() throws Exception {
			
			
		QuestionEntity qe =repo.getQuestionsrepo();
			return qe;
		}

	}



