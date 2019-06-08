package com.techprimers.mongodb.springbootmongodb.repository;

import com.techprimers.mongodb.springbootmongodb.document.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Books, Integer> {
}
