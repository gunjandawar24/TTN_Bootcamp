package com.bootcamp.mappings.repositories;

import com.bootcamp.mappings.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
