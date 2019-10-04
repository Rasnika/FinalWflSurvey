package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.QuestionEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserResponseEntity;
import com.example.demo.repository.UserEntityRepo;
import com.example.demo.repository.UserResponseRepo;
import com.example.demo.service.QuestionEntityService;
import com.example.demo.service.UserEntityService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.codec.binary.Base64;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    UserEntityRepo urepo;

    @Autowired
    UserResponseRepo urespo;
    @Autowired
    UserEntityService us;

    @Autowired
    QuestionEntityService Qeservice;

    @PostMapping(value = "/ouath", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> gettoken(@RequestBody String token) throws Exception {

        String payload = token.split("\\.")[1];

        String varString = new String(Base64.decodeBase64(payload), "UTF-8");
        ObjectMapper om = new ObjectMapper();
        om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        UserEntity user = om.readValue(varString, UserEntity.class);
        String check = user.getSub();
        UserEntity datacheck = us.getUserDetails(check);
        if (datacheck == null) {
            urepo.save(user);
            return new ResponseEntity<>(user.getUid(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user.getUid(), HttpStatus.OK);
        }


    }


    @GetMapping(value = "/questions", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<QuestionEntity> getQuestions() throws Exception {
        List<QuestionEntity> questns = Qeservice.getQuestionsfromTable();
        return new ResponseEntity(questns, HttpStatus.OK);
    }

    @PostMapping(value = "/userResponse/{uid}")
    public ResponseEntity<String> storeResponses(@RequestBody UserResponseEntity uresponse) {

        urespo.save(uresponse);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}