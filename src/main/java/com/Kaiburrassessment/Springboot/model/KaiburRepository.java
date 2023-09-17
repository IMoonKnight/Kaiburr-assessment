package com.Kaiburrassessment.Springboot.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KaiburRepository extends MongoRepository<assessment,String> {

}
