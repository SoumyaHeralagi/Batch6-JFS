package com.cg.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.demo.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
