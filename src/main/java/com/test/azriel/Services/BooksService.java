package com.test.azriel.Services;
import com.test.azriel.dto.BooksDto;
import com.test.azriel.Models.Books;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.azriel.Repositories.BooksRepository;
@Service
public class BooksService {
    @Autowired
    private BooksRepository repository;
    
    public List<Books> getAll(){
        return repository.findAll();
    }

    public Object getById(Long id){
        if (repository.findById(id).isEmpty()){
            return ResponseEntity.badRequest().body("Data Tidak Ditemukan");
        }else {
            return repository.findById(id);
        }

    }

    public Books save(BooksDto dto){
        return repository.save(
            Books.builder()
            .title(dto.getTitle())
            .pages(dto.getPages())
            .price(dto.getPrice())
            .build()
        );
        
    }

    public Object put(Long id,BooksDto dto){
        if(repository.findById(id).isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id Tidak Ada");
        }
        var book = repository.findById(id).get();
        book.setTitle(dto.getTitle());
        book.setPages(dto.getPages());
        book.setPrice(dto.getPrice());
        return repository.save(book);
    }

    public void delete(Long id){           
                repository.deleteById(id);
        }
}
        
    

