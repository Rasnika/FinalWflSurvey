package com.example.demo.implementation;



	import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserEntityRepo;
import com.example.demo.service.UserEntityService;

	@Service
	public class UserEntityServiceImpl implements UserEntityService{
		
		private final UserEntityRepo repo;
		
		public UserEntityServiceImpl(UserEntityRepo repo)
		{
			this.repo=repo;
		}
		
		
		public UserEntity getUserDetails(String check) throws Exception {
			
			
		UserEntity xe =repo.checkuserbygoogleid(check);
			return xe;
		}

	}


