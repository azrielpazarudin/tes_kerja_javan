package com.test.azriel.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.azriel.Models.Books;


public interface BooksRepository extends JpaRepository<Books,Long> {
    
}
