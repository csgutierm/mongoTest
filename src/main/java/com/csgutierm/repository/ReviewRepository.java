package com.csgutierm.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.csgutierm.model.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
