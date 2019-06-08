package com.techprimers.mongodb.springbootmongodb.config;

import com.techprimers.mongodb.springbootmongodb.document.Books;
import com.techprimers.mongodb.springbootmongodb.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = BooksRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(BooksRepository booksRepository){//UserRepository userRepository) {
        return strings -> {
            booksRepository.save(new Books(1, "julio",55, "verne","fiction"));
            booksRepository.save(new Books(2, "tin",18, "tin","action"));
        };

    }

}