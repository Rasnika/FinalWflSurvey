package com.example.demo.implementation;


	


	import java.util.List;
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
		
		
		public List<QuestionEntity> getQuestionsfromTable() throws Exception {
			return repo.getQuestionsrepo();
		}

	}



